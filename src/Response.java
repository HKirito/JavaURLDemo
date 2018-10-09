import java.io.*;
import java.net.Socket;

public class Response extends Thread {
    Socket client;

    public Response(){}

    public Response(Socket client){
        this.client =client;
    }

    @Override
    public void run() {
    try{
        //客户端输出流
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        //控制台输入
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //客户端输入流
        BufferedReader returnm = new BufferedReader(new InputStreamReader(client.getInputStream()));

        while (true){
            String content = returnm.readLine();
            System.out.println(content);
            String message =reader.readLine();
            writer.write(message);
            writer.newLine();
            writer.flush();
        }
    }catch (IOException e){
        e.printStackTrace();
    }


    }
}
