package com.xintian.demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	/**
	 * ����UDP 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1 ����socket
		DatagramSocket receive = new DatagramSocket(12306);
		//2 ��������
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf,0,buf.length);
		receive.receive(packet);//����,�ȴ�����
		String ip = packet.getAddress().getHostAddress();
		System.out.println(ip+":"+new String(packet.getData()));
		//3�ر���Դ
		receive.close();
	}

}
