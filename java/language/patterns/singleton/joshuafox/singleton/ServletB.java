package joshuafox.singleton;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * After compiling this servlet, surf to it at
 * http://localhost/servlet/joshuafox.singleton.ServletB
 *
 * This servlet simply prints out a message indicating its
 * identity, and passes on a message from a Singleton.
 *
 * ServletA has identical code to ServletB. We write
 * two independent classes to simulate the usual situation
 * when two separate servlets access a Singleton.
 * In iPlanet 4.1, for example, ServletA and ServletB will actually
 * load two separate Singleton classes (take a look
 * at the Singleton's identity hash code, and at the class-loaders
 * for each of the classes).
 *
 * Try adding 'implements SingleThreadModel' to the end
 * of the class declaration to see how this effects the
 * number of instances of servlet created. If you do that,
 * experiment with adding a sleep() to the doGet method to slow
 * down the response, and surf to the servlet simultaneously from
 * separate browser windows.
 *
 * @author Joshua Fox (C) 2000
 */
public class ServletB extends HttpServlet {
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
  }

  /**
   * Process the HTTP Get request
   */
  public void doGet(HttpServletRequest request,
    HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = new PrintWriter (response.getOutputStream());
    out.println("<HTML><HEAD><TITLE>ServletB</TITLE></HEAD><BODY>");
    out.println("\""+getHTMLMessage() +"\"");

    out.println("<BR><HR><BR>");
    out.println("The servlet passes on a message from a Singleton.<BR>"+
                        "The Singleton says ");
    out.println("\"" + SingletonX.getInstance().getHTMLMessage());
    out.println("\"</BODY></HTML>");
    out.close();
  }



  public String getHTMLMessage() {
    return "Hi, I'm <FONT COLOR='RED'>ServletB</FONT>" +
    ".<BR>My classloader is <FONT COLOR='BLUE'>" +
    getClass().getClassLoader() +
    "</FONT>.<BR>My identity hash code is <FONT COLOR='RED'>" +
    System.identityHashCode(this) +
    "</FONT>.<BR>If there's really only one instance of my class, " +
    "this will be constant for all instances of ServletB.";
  }
}
