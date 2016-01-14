/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conquistador;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

public class client extends JFrame implements Runnable{
    
    //nhyausa n = new nhyausa();
    //JTextField txtenter;
    //JTextArea txtadisplay;
    ObjectOutputStream output;
    ObjectInputStream input;
    String message = "";
    //frame f;
    state st;
    Thread t;
    public client() {
        super("CLIENT");
        /*Container c = getContentPane();
         
        txtenter = new JTextField();
        txtenter.setEnabled(false);
        txtenter.addActionListener(
        new ActionListener() {
         
        public void actionPerformed(ActionEvent e) {
            sendData(e.getActionCommand());
         
         
        }
        });
         
        c.add(txtenter, BorderLayout.SOUTH);
         
        txtadisplay = new JTextArea();
        txtadisplay.setEditable(false);
        c.add(new JScrollPane(txtadisplay), BorderLayout.CENTER);
         
        setSize(300, 150);
        show();*/
        st=new state("Gorkha",12,true);
        //f=new frame();
        //f.setVisible(true);
        //f.setTitle("Client");
        t=new Thread(this,"Client");
        t.start();
    }
    
    public void runClient() {
        Socket s;
        try {
            st.f.displayStatus("Attempting Connection...");
            //establishing connection
            s = new Socket("localhost", 5000);
            st.f.displayStatus("Connectedto:" + s.getInetAddress().getHostName());
            
            output = new ObjectOutputStream(s.getOutputStream());
            output.flush();
            input = new ObjectInputStream(s.getInputStream());
            
            //txtenter.setEnabled(true);
            
            //processing connection
            //READING INPUT FROM SERVER
            do {
                message = (String) input.readObject();
                st.f.displayStatus(message);
                //txtadisplay.setCaretPosition(txtadisplay.getText().length());
            } while (!message.equals("SERVER>>>TERMINATE"));
            st.f.displayStatus("Closing Connection...");
            input.close();
            output.close();
            s.close();
        } catch (Exception e) {
        }
    }
//SENDING DATA
    public void sendData(String s) {
        try {
            message = s;
            //txtadisplay.append("message Sent");
            //n.s="Hello";
            output.writeObject(s);
            //output.writeObject(n);
            //output.writeObject(n);
            output.flush();
            //f.txtenterdisplay();
            //txtadisplay.append(n.s);
            //System.out.print("what");
        } catch (Exception e) {
            System.out.print("whaterror");
        }
    }
    
    public static void main(String args[]) {
        client cli = new client();
        
        cli.addWindowListener(
                new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
        cli.runClient();
        
    }
    
    public void run() {
        while(st.f.runFlag){
            try {
                Thread.sleep(500);
                
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

