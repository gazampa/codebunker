package joshuafox.singleton;

import java.util.Date;

/**
 * A sample Singleton, showing one common technique for implementing
 * the Singleton Design Patterns, with some added bells and whistles
 * to illustrate points from the article.
 *
 * The Singleton gives a message that helps track its
 * identity.
 *
 * The identity hash code is a number that is unique for every
 * references. If two object refer to the same object if and
 * only if they have the same identity hash code. Class
 * <CODE>Object</CODE> defines a <CODE>hashCode()</CODE> method that
 * is the same as the identity hash code. Since this can be
 * overridden to allow two different objects to have the same hash
 * code (although, as it happens, for this class it isn't), we use
 * the identity hash code to precisely specify the reference's
 * identity.
 *
 * In addition, creation date and number of instances are recorded.
 * Note that if this class is reloaded, any static fields or
 * instance fields of the Singleton instance will be reset to
 * the default values. If this class is simultaneously loaded twice
 * in two class-loaders, the creation dates will be (almost) the same,
 * and each class will indicate that only one instance was instantiated,
 * but the identity hash codes will differ, as will the class-loaders.
 *
 * This Singleton can be called from a servlet, applet, or
 * regular application.
 *
 * Some experiments to try:
 * <UL>
 * <LI>Have a servlet or a similar object call
 * <CODE>setReference(this)</CODE> on the Singleton instance. Then
 * see what happens when the servlet class is reloaded (after it is
 * changed).</LI>
 *
 * <LI>As an experiment, call this Singleton, then make sure that there
 * are no references being held to the Singleton or to the class,
 * wait for class garbage collection to kick in, then call the
 * Singleton again. You can avoid holding direct references to the
 * class by creating an interface for the Singleton to implement
 * and a factory class to return the Singleton instance with that
 * interface as the run-time type.</LI>
 *
 * <LI>Try having another class load this Singleton through
 * dynamic classloading (<CODE>Class.forName())</CODE>, then call
 * the <CODE>getInstance()</CODE> method using reflection, to see
 * what this does to class garbage collection.</LI>
 *
 * <LI>Set your JVM to have no class garbage collection (command-line
 * parameter -Xnoclassgc on the JRE 1.3 virtual machine or
 * -noclassgc on the IBM VM.) If you're working in a servlet
 * engine, add this to the command- line of the servlet-engine's
 * VM using the servlet-engine's administrative tools.</LI>
 *
 * <LI>Call this Singleton from different servlets, after setting
 * your servlet-engine to load servlets with different classloaders.
 * (This is the default in iPlanet 4.1.).</LI>
 *
 * <LI>Call this Singleton from applets loaded from different
 * servers.</LI>
 *
 * @author Joshua Fox (C) 2000
 */
public class SingletonX {
  // This field can hold a reference to any Object
  // While it is not used in the ServletA/B example, you might want,
  // as an experiment, to have the Singleton hold a reference
  // to a servlet to prevent the servlet class from being discarded.
  private Object reference;

  // These fields help us see whether one or
  // more Singletons were created. There is usually
  // no need for them in a Singleton.
  private int instanceNumber;
  private Date creationDate;

  // Counts instantiations. Should always be  0 or 1
  private static int numberOfInstances;

  // You could add = new SingletonX() at the end of the
  // next line for simple non-lazy initialization,
  // instead of doing lazy initialization in getInstance()
  private static SingletonX instance;

   /**
    * Note that the constructor is private, to prevent
    * outside objects from constructing more instances.
    */
   private SingletonX() {
    instanceNumber= ++numberOfInstances;
    creationDate =new Date();
   }

  /**
  * The getInstance() method is static, giving a global
  * point of access through the classname. There are
  * other ways to implement the Singleton.
  */
  public static SingletonX getInstance() {
        if (instance==null){
            instance=new SingletonX();
        }
        return instance;
  }

   /**
    * As an experiment, have the Singleton hold a reference
    * to a servlet to prevent the servlet class from being discarded.
    *
    * Alternately, you might try to hold a reference in the
    * opposite direction, from another class to the
    * Singleton: Either hold a reference to class SingletonX
    * (in which case the class cannot be garbage-collected),
    * or else to a super-interface of SingletonX, loading
    * class SingletonX dynamically (in which case class SingletonX might be
    * garbage-collected).
    */
   public void setReference(Object  o){
      reference = o;
   }


  /**
   * @return a value that helps us identify how many
   *  Singleton instance there are--one, we hope.
   */
  public String getHTMLMessage() {
    String s = "Hi, I'm an instance of SingletonX.<BR>" +
      "My classloader is <FONT COLOR='BLUE'>" +
      getClass().getClassLoader() +
      "</FONT>.<BR>My identity hash code is <FONT COLOR='GREEN'>" +
      System.identityHashCode(this) +
      "</FONT>.<BR>So far, since the class was loaded, " +
      "<FONT COLOR='RED'>" + numberOfInstances +
      "</FONT> instance" + (numberOfInstances==1?"":"s") +
      " of this Singleton class " + (numberOfInstances==1?"has":"have")+
      " been created.<BR>I'm instance number <FONT COLOR='RED'>"+
      instanceNumber + "</FONT>.<BR>I was created at <FONT COLOR='RED'>"+
      creationDate + "</FONT>.<BR>If there's really only one instance of my class, " +
      "these items will be constant for all instances of SingletonX.";

    if (reference!=null) {
       s += "<BR>I'm holding a reference to Object "+ reference +
       " with identity hash code <FONT COLOR='RED'>" +
       System.identityHashCode(reference) +"</FONT>.";
    }
    return s;
  }
}

