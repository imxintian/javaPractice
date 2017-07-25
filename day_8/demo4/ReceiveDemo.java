package com.xintian.demo4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveDemo {	
	/**
	 * ����UDP
	 */
	public static void main(String[] args) {
		//1 ����socket����
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket(11111);
			//2 ��ȡ����
			byte[] buf = new byte[1024];
			DatagramPacket p  = new DatagramPacket(buf,buf.length); 
			socket.receive(p);//��������
			String ip = p.getAddress().getHostAddress();
			System.out.println(ip+":"+new String(p.getData()));
			//3 ��������
			byte[] reply = "���,���յ���Ϣ".getBytes();
			DatagramPacket packet  = new DatagramPacket(reply,reply.length,InetAddress.getByName("127.0.0.1"),12345); 
			socket.send(packet);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(socket!=null) {
				socket.close();
			}
		}
	}
}
