package com.xintian.demo2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * ��ͻ������������������,ͨ�� 
 *
 */
public class Server {
	static ArrayList<Socket> alist = new ArrayList();
	public static void main(String[] args) throws IOException {
		//1 ���������socket
		ServerSocket server = new ServerSocket(12345);
		System.out.println("����������...");
		//2 �ȴ��ͻ�������
		while(true) {
			Socket socket = server.accept();
			alist.add(socket);
			System.err.println("��������:"+alist.size());
			//�����߳�,��ͻ���ͨ��
			new SocketThread(socket).start();
		}
	}
}
