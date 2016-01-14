/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conquistador;

//Server.java
import java.net.*;
import java.io.*;
import javax.swing.*;

public class Server extends JFrame implements Runnable{
    
    //JTextField txtenter;
    //JTextArea txtadisplay;
    ObjectOutputStream output;
    ObjectInputStream input;
    String message = "";
    Thread t;
    state st;
    //private nhyausa n;
    
    public Server() {
        super("SERVER");

        st=new state("Gorkha",12,true);
        
        t=new Thread(this,"Server");
        t.start();
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
        //n = new nhyausa();
    }
    
    public void runServer() {
        ServerSocket ss;
        Socket s;
        int counter = 1;
        
        
        try {
            //create a seversocket
            ss = new ServerSocket(5000, 100);
            
            while (true) {
                
                //wait for the connection
                st.f.displayStatus("Waiting for the Connection...");
                //txtadisplay.setText("Waiting for the Connection...");
                
                //establishing connection
                s = ss.accept();
                
                st.f.displayStatus("Conection " + counter + "receivedfrom:" + s.getInetAddress().getHostName());
                
                //getting input/output
                output = new ObjectOutputStream(s.getOutputStream());
                
                output.flush();
                
                input = new ObjectInputStream(s.getInputStream());
                
                //processing connection
                
                String message = "Server>>>Conection Sucessfull...";
                output.writeObject(message);
                output.flush();
                //txtenter.setEnabled(true);
                
                
                do {
                    
                    //int k = (int) input.readInt();
                    //n = (nhyausa) input.readObject();
                    message=(String) input.readObject();
                    //f.txtadisplay(message);
                    //txtadisplay.append(""+k);
                    //f.txtadisplay.setCaretPosition(txtadisplay.getText().length());
                    
                    
                } while (!message.equals("CLIENT>>>TERMINATE"));
                
                st.f.displayStatus("User Terminated Connection...");
                output.close();
                input.close();
                s.close();
                ++counter;
            }
        } catch (Exception e) {
        }
    }
    
    public void sendData(String s) {
        try {
            output.writeObject("SERVER>>>" + s);
            output.flush();
            //f.txtenterdisplay();
            //s.f.displayStatus("SERVER>>>" + s);
        } catch (Exception e) {
        }
    }
    
    public static void main(String args[]) {
        Server ser = new Server();
        
        /*ser.addWindowListener(
        new WindowAdapter() {
                
                public void WindowClosing(WindowEvent e) {
                System.exit(1);
                
                }
                });*/
        ser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ser.runServer();
        
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
