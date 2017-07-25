package com.xintian.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	/*
	 * 创建客户端
	 * 
	 *   客户端发送消息,服务器回复
	 */
	public static void main(String[] args) throws IOException {
		//1 创建服务器端socket
		ServerSocket server = new ServerSocket(10086);
		//2 等待客户连接
		Socket socket = 	server.accept();
		String ip = socket.getInetAddress().getHostName();
		System.out.println(ip+"连接进来");
		//3 获取流 对象
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream()));
		OutputStream os = socket.getOutputStream();
		//4 读取数据
		String msg = br.readLine();
		System.out.println(ip+":"+msg);
		socket.shutdownInput();//关闭输入流
		//5 回复数据
		os.write("我接受到数据流".getBytes());
		
		//6 关闭资源
		br.close();
		os.close();
		socket.close();
		
	}
}
