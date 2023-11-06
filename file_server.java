import java.net.*;
import java.io.*;

public class file_server {
  public static void main(String[] args)throws Exception {
    ServerSocket s = new ServerSocket(4333);
    Socket sr = s.accept();
    FileInputStream fr = new FileInputStream("E:\\Java learn\\Chat_APP_File_Share\\s.txt");

    byte[] b = new byte[20002];
    fr.read(b, 0, b.length);

    OutputStream os = sr.getOutputStream();
    os.write(b, 0, b.length);


  }
}