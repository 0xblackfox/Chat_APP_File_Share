import java.net.*;
import java.io.*;

public class file_client {
   public static void main(String[] args)throws Exception {

      byte[] b = new byte[20002];
      Socket sr = new Socket("localhost", 4333);
      InputStream is = sr.getInputStream();
      FileOutputStream fr = new FileOutputStream("E:\\Java learn\\Chat_APP_File_Share\\ccc.txt");
      is.read(b, 0, b.length);
      fr.write(b, 0, b.length);
   }
}