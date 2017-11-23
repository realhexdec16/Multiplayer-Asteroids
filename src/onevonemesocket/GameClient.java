/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onevonemesocket;
import java.io.*;
import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author jackn
 * Constructs Client by connecting it to the server. Sets up GUI/GUI listeners
 */
public class GameClient extends JFrame{
    public static final int PORT_NUM=9000;
    //private Socket socket;
    private DatagramSocket socket;
    private BufferedReader input;
    private PrintWriter output;
    private JFrame thePOT = new JFrame ("Creative Title Frame");
    private OnevOneMeSocket plaayball;
    private float Dancer;
    private InetAddress address  = InetAddress.getByName("localhost");
    
    public GameClient(String address) throws Exception {
        setTitle("Game");
        setBackground(Color.CYAN);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //****setSize();
        //Client Socket Setup:
        //socket = new Socket(address, PORT_NUM);
        //input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //output = new PrintWriter(socket.getOutputStream(), true);
        
        //Implementing UDP here
        input = new BufferedReader(new InputStreamReader(System.in));
        socket = new DatagramSocket();
        byte[] sendData = new byte[1024];
        byte[] recvData = new byte[1024];
        
        //Sending data
        //Get whatever data we need into send data using sendData = (data).getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length,InetAddress.getByName("localhost"),PORT_NUM);
        socket.send(sendPacket);
        
        //Receiving data
        DatagramPacket recvPacket = new DatagramPacket(recvData,recvData.length);
        socket.receive(recvPacket);
        //Take whatever data you need from here using (data) = new (data)(recvPacket.getData());
        
        //At the end you want to close
        socket.close();
        
        //Put GUI layouts here ~poss ?::
        
        /*
        Steal, borrow, refer, save your shady inference.
        kangaroo done hung the juror with the innocent.
        YOU MUST HAVE BEEN HIIIIGH
        */
    }
    public static void main(String[] args) {
        new OnevOneMeSocket();
    }
}
