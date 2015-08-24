/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chatbox;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Elisabeth
 */
public class ChatBoxClient {
    int port = 8000;
    String host = "localhost";
    DataInputStream in;
    DataOutputStream out;
    Socket socket;
    
    public ChatBoxClient(){
        
    try {
            socket = new Socket(host, port);
            
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number:");
            while(input.hasNextDouble())
            {
                out.writeDouble(input.nextDouble());
                System.out.println("Enter a number:");
            }
            
            
        } catch (IOException ex) {
            System.out.println("IO Exception:");
            ex.printStackTrace();
        }
    
    }



    public static void main(String args[]) {
        new ChatBoxClient();
    }

}
