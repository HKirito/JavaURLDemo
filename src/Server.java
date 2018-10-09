
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)throws Exception{

        ServerSocket s =new ServerSocket(9999);
        System.out.println("Server Opening!");

        Socket client = s.accept();
        System.out.println("Having someone connecting "+client.getInetAddress().getHostAddress());


        while(true){
            new Response(client).start();
        }

        /*
        while(true){
            String word= reader.readLine();

            writer.write(word);
            writer.newLine();
            writer.flush();
        }
         */

        //writer.close();
    }

}
