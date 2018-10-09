
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws Exception{

        Socket Client = new Socket("192.168.100.42",9999);
        System.out.println("Connecting Succeed!");

        while(true){
            new Response(Client).start();
        }
        /*
        while (true){

            String message = reader.readLine();
            System.out.println(message);
        }
        */


    }
}
