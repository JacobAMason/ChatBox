/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chatbox;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

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
    
}
