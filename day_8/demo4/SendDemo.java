package com.xintian.demo4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendDemo {	
	/**
	 * 基于UDP
	 */
	public static void main(String[] args) {
		//1 创建socket对象
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket(12345);
			//2 发送数据
			byte[] msg = "你好,我是发送端,我先发送消息".getBytes();
			DatagramPacket packet  = new DatagramPacket(msg,msg.length,InetAddress.getByName("127.0.0.1"),11111); 
			socket.send(packet);
			
			
			//3 获取数据
			byte[] buf = new byte[1024];
			DatagramPacket p  = new DatagramPacket(buf,buf.length); 
			socket.receive(p);//接受数据
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
