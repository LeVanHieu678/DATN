package com.hieu.levan.videocalldatn.signalingserver.network;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SessionManager {
    private SessionManagerDelegate delegate;
    private DatagramSocket socket;
    private boolean isRun = true ;
    public SessionManager(){
        try {
            socket = new DatagramSocket();
            new Thread(() -> {
                byte[] buffer = new byte[20*1024];
                DatagramPacket server = new DatagramPacket(buffer, buffer.length);
                while (isRun){
                    try {
                        socket.receive(server);
                        if (delegate != null){
                             delegate.didReceiverData(server.getData());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }

    interface SessionManagerDelegate{
        void didReceiverData(byte[] data);
    }

}

