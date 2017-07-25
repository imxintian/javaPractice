package com.xintian.demo4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendDemo {	
	/**
	 * ����UDP
	 */
	public static void main(String[] args) {
		//1 ����socket����
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket(12345);
			//2 ��������
			byte[] msg = "���,���Ƿ��Ͷ�,���ȷ�����Ϣ".getBytes();
			DatagramPacket packet  = new DatagramPacket(msg,msg.length,InetAddress.getByName("127.0.0.1"),11111); 
			socket.send(packet);
			
			
			//3 ��ȡ����
			byte[] buf = new byte[1024];
			DatagramPacket p  = new DatagramPacket(buf,buf.length); 
			socket.receive(p);//��������
			String ip = p.getAddress().getHostAddress();
			System.out.println(ip+":"+new String(p.getData()));
			
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
