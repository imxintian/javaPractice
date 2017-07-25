package com.xintian.demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	/**
	 * 发送端
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//1 创建socket
		DatagramSocket socket = new DatagramSocket();
		//2 发送数据
		String str = "你好,客户端";
		byte[] data = str.getBytes();
		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(data,data.length,address,12306);
		socket.send(packet);
		//3 关闭资源
		socket.close();
	}

}
