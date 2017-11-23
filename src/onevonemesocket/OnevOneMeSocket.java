/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onevonemesocket;

/**
 *
 * @author jackn
 * //GameServerThing
 */
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class OnevOneMeSocket {
    
    public static final int PORT_NUM=9000;
    public static InetAddress address;
    public static DatagramSocket socket;

    /**
     * @param args the command line arguments
     * //mult. client psuedo coded
     * while(tru) {
     * accept connection
     * create thread
     * }
     * 
     */
    public static void main(String[] args) throws Exception {
        address = InetAddress.getByName("localhost");
        socket = new DatagramSocket(PORT_NUM);
        byte[] sendData = new byte[1024];
        byte[] recvData = new byte[1024];
        while(1<2){
            Player player = new Player(socket);
        }
    }
    
    //Game Object
    class Game {
        //private Player etc...
        //win conditions
    }
    
    /*
    Helper thread class. I/O streams for player/client communication
    */
    class Player extends Thread {
        BufferedReader input;
        PrintWriter output;
        DatagramChannel channel;
        
        //idk how much gas i got left maybe this will work at somepoint [insert::rngGOd.prayer]
        private Player opponent;
        int Pnumber;
        DatagramSocket socket;
        
        public Player(DatagramSocket socket) {
            this.socket = socket;
            try {
                /*input = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(new InputStreamReader(System.in))));
                output = new PrintWriter(socket.getOutputStream(), true);
                */
                socket = new DatagramSocket(PORT_NUM);
                channel = socket.getChannel();
                //displays 1st couple of communicatay
                output.println("WELCOME FAGGOt " + socket);
                output.println("Waiting on the other SCRUB...");
            } catch (IOException e) {
                System.out.println("Player died: " + e);
            }
        }
        public void setOpposition(Player opponent){
            this.opponent = opponent;
        }
        public void winner(boolean isAliveOne, boolean isAliveTwo){
            //TODO: VICTORY CONDITIONS
        }
        //Run method of thread
        public void run() {
            try {
                //GameProtocol protocol = new GameProtocl(); testing protocol
                
                output.println("Everyone connected thread party!");
                while(true) {
                    String test = input.readLine();
                    //listen for commands from clients
                    
                    if(test.equalsIgnoreCase("QUIT"))
                        return;
                    
                }
            } catch (IOException ex) {
                System.out.println("ded");
            } finally {
                try {
                        //  try {
                        socket.close();
                    } catch (IOException ex) {
                        Logger.getLogger(OnevOneMeSocket.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        }
    }

    class Dancer {
        private float Dancer;
    }
