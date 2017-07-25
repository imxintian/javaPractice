package com.xintian.demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;

public class SocketThread extends Thread {
	private Socket socket;
	public SocketThread(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		//获取ip
		String ip = socket.getInetAddress().getHostAddress();
		System.out.println("客户端:"+ip+"建立连接");
		//获取流对象
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 //读取客户端发来的数据
			 String line = null;
			 while((line=br.readLine())!=null) {
				 //打印数据
				 System.out.println(ip+":"+line);
			 }
		} catch (IOException e) {
			System.err.println(ip+"断开连接");
			Server.alist.remove(socket);//移除
		} finally {
			Server.alist.remove(socket);//移除
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(socket!=null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}


