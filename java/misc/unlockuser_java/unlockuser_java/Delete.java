import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import unlock.*;

public class Delete  extends HttpServlet
{
	public void doPost (HttpServletRequest request, 
			HttpServletResponse response)
		throws ServletException, IOException
		{
			String user_id;
			String query;
			int m=0;
			try {
				
				response.setContentType("text/html");;
				PrintWriter out=response.getWriter();
	        	user_id= request.getParameter("user_id");
	        	if (user_id==null)
	        	{
	        		out.println("You did not select a user.<p>");
       		
	        	} else {
	        		UserlistBean bean =new UserlistBean();	        	
	        		bean.IntializeDB();		
	        		query ="delete from loginfail where user_id=" +user_id;
	        		m=bean.executeUpdate(query);
	        		if (m==0)
	        		{
	        			out.println("The program has experienced an unexpected error.  "+
	        					"Please see Joe Adams for assistance.");
	        		}
	        		else
	        			out.println("The user has been unlocked.");
	        	}
        		RequestDispatcher dispatcher =
        			request.getRequestDispatcher("unlock.jsp");
        		dispatcher.include(request, response); 	 
	    
			
			} catch (Exception e) {System.out.println("Threw outer exception");}    				
		}
}
