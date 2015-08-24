/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chatbox;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ashley E. Stallings
 */
public class ChatBoxServer {

        int port = 8000;
        DataInputStream in;
        DataOutputStream out;
        ServerSocket server;
        Socket socket;
        
    
    public ChatBoxServer(){ 
        try {
            server = new ServerSocket(port);
            System.out.println("Waiting on client to connect");
            socket = server.accept();
            
            
            
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            
            
            double num;
            
            System.out.println("Waiting on client to input");
            
            while(true)
            {
                num = in.readDouble();
                System.out.println(num);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ChatBoxServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }

    
    public static void main(String args[]) {
        new ChatBoxServer();
    }
    
}
