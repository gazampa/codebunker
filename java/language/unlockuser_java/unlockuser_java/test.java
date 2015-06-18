import java.sql.*;
import java.util.ArrayList;
import unlock.UserlistBean;
import database.DatabaseHelper;
import database.DBException;
import database.ManualPoolingDriverExample;

/**
*
* This is a training example. It demonstrates an application that utilizes part
* of the MVC pattern to retrieve data from a paradox database and populate a jsp page.
*
* The next step is to apply greater OO methodology, remove connection code to its own class, use a datasource to connect, set up a connection pool and remove static methods to a helper class.
*
*/

public class test {

		static String url  = "jdbc:paradox://////pyramid/Edrive/Database/sms460";
		static String user = "";
		static String pwd  = "";
		static String driver = null;
		static Connection fConnection = null;
		static Statement  fStatement  = null;
		static ResultSet  fResultSet  = null;
		static String     sql         = "select client_id,client_listname,client_name from client where client_locked = 'F' order by client_id"; //"select user_id, user_login, user_name from loginfail l, users u, clientuser cu where l.user_id = u.user_id and l.counter = 5 and cu.user_id = u.user_id and cu.client_id = 271";//

	public static void main(String[] args)
	{
		ArrayList<UserlistBean> uBeans = null;//<-- Assign Memory of Type ArrayList<UserListBean>

		/* ENVIRONMENT*/

		RegisterDatabaseDriver();

		System.out.println("Database Driver Registered : " + driver);

		InitializeDBPool();

		System.out.println("Database Pool Generated : "+DriverStatsOutput());

		fConnection = connect();

		for (int i=0;i<10;i++){connect();} //<--check out the database connection limits in the code.  No more than 5 currently,

		System.out.println("Database Connection Pool Established : " + fConnection);

		System.out.println("Passing Query to : " + fConnection + " : " +sql);

		/*MODEL*/

		executeQuery(sql);

		/* we are going to iterate over the result set and assign respective values in our Bean, the bean in this case represents selected columns from one record of the database
			Then we are going to add the beans into an indexed datastructure that will hold all the records returned from the database*/
		uBeans = new ArrayList<UserlistBean>();//<- Address Memory of Type ArrayList<UserListBean>
		while(next()){
			UserlistBean ubean = null; //<------------- Assign Memory Type UserlistBean
			ubean = new UserlistBean(); // <----------- Address Memory of Type UserlistBean
			ubean.setUserId(getString(1));//<----------------------- Assign Value
			ubean.setUserLogin(getString(2));//<-------------------- Assign Value
			ubean.setUserName(getString(3));//<--------------------- Assign Value
			System.out.println("Contents of ResultSet : "+getString(1)+" : "+getString(2)+" : "+getString(3)); //<---- Get a Visual
			uBeans.add(ubean);//<----------------------------------- Assign Value to ArrayList Memory. Now the value is the Bean.
		}
		/*Now you have an indexed datastructure in memory which holds many of the user defined UserlistBean*/

		/*This is a handy for each loop that iterates over the contents of uBeans*/
		for(UserlistBean ubean : uBeans){
			System.out.println("Contents of Bean : "+ubean.getUserId()+" : "+ubean.getUserLogin()+" : "+ubean.getUserName());
		}

		/*

		TO DO : Port Over to Servlet

		1 ) [PLACE POPULATED ARRAYLIST INTO REQUEST OBJECT AND EXECUTE PAGE DIRECTION LOGIC] - CONTROLLER

		2 ) [DISPLAY PAGE WITH CONTENTS OF ARRAYLIST] - VIEW

		*/
		printDriverStats();
		Close();
		System.out.println ("Database Connection Returned to Pool");
		printDriverStats();
		shutdownDriver();
	}

	public static void RegisterDatabaseDriver(){
		driver = "com.hxtt.sql.paradox.ParadoxDriver";
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException e){
			System.out.println("Driver Class Not Found : "+ e.getMessage());
		}
	}

	public static void InitializeDBPool(){
		try{
			ManualPoolingDriverExample.setupDriver(url);
		}catch(Exception e){
			System.out.println("Problem Creating Connection Pool : "+e);
		}
	}

	public static Connection getConnectionFromPool(){
		try{
			fConnection = DriverManager.getConnection("jdbc:apache:commons:dbcp:nutter-butter");
		}catch(SQLException e){
			System.out.println("Problem Getting Connection From Pool : "+e);
		}
		return fConnection;
	}

	public static Connection getActiveConnectionFromPool(){
		Connection con = null;
		try{
			con = DriverManager.getConnection("jdbc:apache:commons:dbcp:nutter-butter");
		}catch(SQLException e){
			System.out.println("Problem Getting Connection From Pool : "+e);
		}
		return con;
	}

	public static Connection connect(){
		Connection connection = null;
		int numActive = -1;

		try{
			numActive = ManualPoolingDriverExample.getNumberOfActiveConnections();
		}catch(Exception e){
			System.out.println("Unable to Determine Number of Active Connections");
		}

        if (numActive>-1 && numActive<5){
			try{
				connection = DriverManager.getConnection("jdbc:apache:commons:dbcp:nutter-butter");
			}catch(Exception e){
				System.out.println("Problem Getting Connection From Pool : " + e);
			}
		}
		else{
			System.out.println("Max Number of Database Connections Exceeded");
		}

	return connection;
	}


	public static Connection IntializeDB()
	{
		try {
	        fConnection = DriverManager.getConnection(url,user,pwd);
		}catch (SQLException e)
		{
			System.out.println("Exception in Database : "+ e.getMessage()+ " : " + e.getErrorCode() ) ;
		}

	 return fConnection;
	}

	public static void close(Connection connection){
		try{
			connection.close();
		}catch(SQLException e){
			System.out.println("Problem closing database : " +e.getMessage());
		}
	}

    public static int executeQuery(String pSQLString)
    {
    	int result = 0;

        try{
        	fStatement = fConnection.createStatement();
		}catch(SQLException e){
			System.out.println("Problem Creating Statement : " + e);
		}

        if(fResultSet != null)
        {
         //The connection is being reused, but not the resultSet
       	  try{
      	 		fResultSet.close();
			}catch(SQLException e){
				System.out.println("Problem Closing ResultSet : " + e);
			}
        }

        try{
			fResultSet = fStatement.executeQuery(pSQLString);
		}catch(SQLException e){
			System.out.println("Problem Executing Query : " + e);
		}

    	return result;
    }


    public static int executeUpdate(String pSQLString)
    {
        int result = 0;

        try{
			fStatement = fConnection.createStatement();
		}catch(SQLException e){
			System.out.println("Problem Creating Statement : " + e);
		}

        try{
			result = fStatement.executeUpdate(pSQLString);
		}catch(SQLException e){
			System.out.println("Problem Executin Statement : " + e);
		}
    	return result;
    }

    public static String getString(int pColumn)
    {
        String returnValue = null;

        try{
        	returnValue = fResultSet.getString(pColumn);
		}catch(SQLException e){
			System.out.println("Problem Getting String From ResultSet : " + e);
		}

        return returnValue;
    }

    public static double getDouble(int pColumn)
    {
        double returnValue=0.0;
        try{
			returnValue = fResultSet.getDouble(pColumn);
		}catch(SQLException e){
			System.out.println("Problem Getting Double From ResultSet : " + e);
		}
        return returnValue;
    }

    public static int getInt(int pColumn)
    {
        int returnValue = 0;
        try{
			returnValue = fResultSet.getInt(pColumn);
		}catch(SQLException e){
			System.out.println("Problem Getting Int From ResultSet : " + e);
		}

        return returnValue;
    }

    public static boolean next()
    {
        boolean result=false;
        try{
        	result = fResultSet.next();
		}catch(SQLException e){
			System.out.println("Problem Iterating Over Result Set : " + e);
		}
		return result;
    }

    public static void Close()
    {
		if( fStatement!=null ){
			try{
				fStatement.close();
			}catch(SQLException e){
				System.out.println("Problem closing Statement : " +e.getMessage());
			}
		}
		if(fResultSet!=null){
			try{
				fResultSet.close();
			}catch(SQLException e){
				System.out.println("Problem closing Result Set : " +e.getMessage());
			}
		}
		if(fConnection!=null){
			try{
				fConnection.close();
			}catch(SQLException e){
				System.out.println("Problem closing Database : " +e.getMessage());
			}
		}
    }

    public static void Close(Connection con){
		try{
			con.close();
		}catch(SQLException e){
			System.out.println("Problem Closing Connection");
		}
	}

	public static void printDriverStats(){
		try {
			ManualPoolingDriverExample.printDriverStats();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String DriverStatsOutput(){
		String result = null;
		try {
			result = ManualPoolingDriverExample.DriverStatsOutput();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void shutdownDriver(){
		try{
			ManualPoolingDriverExample.shutdownDriver();
		}catch(Exception e){
			System.out.println("Problem Shutting Driver : "+e);
		}
		System.out.println("Driver Shut Down");
	}

    public void beforeFirst() throws SQLException
    {
        fResultSet.beforeFirst();
    }

    public void first() throws SQLException
    {
        fResultSet.first();
    }

}
