package database;

import java.sql.*;
public class DatabaseHelper{

		private String url;
		private String user;
		private String pwd;
		private String driver;
		private Connection fConnection;

	public DatabaseHelper(){
		url  = "jdbc:paradox://////pyramid/Edrive/Database/sms460";
		user = "";
		pwd  = "";
		driver = null;
		Connection fConnection = null;

		}

	public void RegisterDatabaseDriver(){
		driver = "com.hxtt.sql.paradox.ParadoxDriver";
		try {
		Class.forName(driver);
		}catch(ClassNotFoundException e){
			System.out.println("Driver Class Not Found : "+ e.getMessage());
		}
	}

	public Connection IntializeDB()
	{

		try {
	        fConnection = DriverManager.getConnection(url,user,pwd);
		}catch (SQLException e)
		{
			System.out.println("Exception in Database : "+ e.getMessage()+ " : " + e.getErrorCode() ) ;
		}

	 return fConnection;
	}

	public Connection close(){
		try{
			fConnection.close();
		}catch(SQLException e){
			System.out.println("Problem closing database : " +e.getMessage());
		}
		return fConnection;
	}

}