
package com.xintian.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	/**
	 * 基于TCP协议的通信
	 * 		三要素
	 * 		ip:标识计算机
	 * 		协议:通信的规则
	 * 		端口:标志程序	1~65535(不要取1024之前的)
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1 创建服务端的Socket
		ServerSocket server = new ServerSocket(12345);//监听12345端口
		//2 阻塞,等待客户端连接
		while(true) {
			Socket socket = server.accept();
			String ip = socket.getInetAddress().getHostName();//获取ip
			System.out.println("客户端连接成功");
			//3 获取流对象
			InputStream is = socket.getInputStream();
			BufferedReader bi = new BufferedReader(
					new InputStreamReader(is));
		
			//4 读取数据
			String msg = bi.readLine();
			System.out.println("ip:"+msg);
			
			//5 关闭资源
			is.close();
			bi.close();
			socket.close();
			//server.close();
		}
	}

}
