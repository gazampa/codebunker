import java.io.*;

public class ClassVersionChecker {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < args.length; i++)
            checkClassVersion(args[i]);
    }

    private static void checkClassVersion(String filename)
        throws IOException
    {
        DataInputStream in = new DataInputStream
         (new FileInputStream(filename));

        int magic = in.readInt();
        if(magic != 0xcafebabe) {
          System.out.println(filename + " is not a valid class!");;
        }
        int minor = in.readUnsignedShort();
        int major = in.readUnsignedShort();
        System.out.println(filename + ": " + major + " . " + minor);
        in.close();
    }
}

