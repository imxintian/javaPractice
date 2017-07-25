
package com.xintian.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	/**
	 * ����TCPЭ���ͨ��
	 * 		��Ҫ��
	 * 		ip:��ʶ�����
	 * 		Э��:ͨ�ŵĹ���
	 * 		�˿�:��־����	1~65535(��Ҫȡ1024֮ǰ��)
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1 ��������˵�Socket
		ServerSocket server = new ServerSocket(12345);//����12345�˿�
		//2 ����,�ȴ��ͻ�������
		while(true) {
			Socket socket = server.accept();
			String ip = socket.getInetAddress().getHostName();//��ȡip
			System.out.println("�ͻ������ӳɹ�");
			//3 ��ȡ������
			InputStream is = socket.getInputStream();
			BufferedReader bi = new BufferedReader(
					new InputStreamReader(is));
		
			//4 ��ȡ����
			String msg = bi.readLine();
			System.out.println("ip:"+msg);
			
			//5 �ر���Դ
			is.close();
			bi.close();
			socket.close();
			//server.close();
		}
	}

}
