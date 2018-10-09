import javax.swing.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFrame extends JFrame {

    private JTextArea messages,editmessage;
    private JButton send,close;
    private ServerSocket server;
    private Socket client;

    public ServerFrame() {
        setTitle("****");
        setSize(400, 600);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComp();
        this.paintComponents(this.getGraphics());
        this.paintAll(getGraphics());
    }
    public void initComp(){
        messages = new JTextArea();
        //
    }
}
