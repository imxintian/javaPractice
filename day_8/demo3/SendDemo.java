package com.xintian.demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	/**
	 * ���Ͷ�
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//1 ����socket
		DatagramSocket socket = new DatagramSocket();
		//2 ��������
		String str = "���,�ͻ���";
		byte[] data = str.getBytes();
		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(data,data.length,address,12306);
		socket.send(packet);
		//3 �ر���Դ
		socket.close();
	}

}
