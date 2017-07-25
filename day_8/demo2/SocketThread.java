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
		//��ȡip
		String ip = socket.getInetAddress().getHostAddress();
		System.out.println("�ͻ���:"+ip+"��������");
		//��ȡ������
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 //��ȡ�ͻ��˷���������
			 String line = null;
			 while((line=br.readLine())!=null) {
				 //��ӡ����
				 System.out.println(ip+":"+line);
			 }
		} catch (IOException e) {
			System.err.println(ip+"�Ͽ�����");
			Server.alist.remove(socket);//�Ƴ�
		} finally {
			Server.alist.remove(socket);//�Ƴ�
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


