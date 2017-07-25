package com.xintian.demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	/**
	 * 基于UDP 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1 创建socket
		DatagramSocket receive = new DatagramSocket(12306);
		//2 接受数据
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf,0,buf.length);
		receive.receive(packet);//阻塞,等待接受
		String ip = packet.getAddress().getHostAddress();
		System.out.println(ip+":"+new String(packet.getData()));
		//3关闭资源
		receive.close();
	}

}
