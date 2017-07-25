package com.xintian.demo2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * 多客户端与服务器建立连接,通信 
 *
 */
public class Server {
	static ArrayList<Socket> alist = new ArrayList();
	public static void main(String[] args) throws IOException {
		//1 创建服务端socket
		ServerSocket server = new ServerSocket(12345);
		System.out.println("服务器启动...");
		//2 等待客户端连接
		while(true) {
			Socket socket = server.accept();
			alist.add(socket);
			System.err.println("在线人数:"+alist.size());
			//创建线程,与客户端通信
			new SocketThread(socket).start();
		}
	}
}
