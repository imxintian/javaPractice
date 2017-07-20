package FileDemo;
import java.io.FileInputStream;

/*
 * ת���������ֽ���ת��Ϊ�ַ���������ָ�����뼯��
 * �ַ���,�����ı��Ķ�д(�ı��ļ�,�ü��±����ܿ�)
 * ������
 * 		int read()		��һ���ַ�
 * 		int read(char[] buf, int offset, int len) 
 * �����
 * 		write(String str)
 * 		write(char[] buf, int offset, int len)
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.OutputStreamWriter;



public class Demo_5 {
	public static void main(String[] args)  {
		try {
			writeFile();
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readFile() throws IOException {
		InputStreamReader isr=new InputStreamReader(new FileInputStream("p:/test/1.txt"),"utf-8");
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("p:/test/2.txt"), "utf-8"); 
		//��д����
		int len=0;
		char[] cbuf = new char[1024];
		while((len=isr.read(cbuf, 0, cbuf.length))!=-1) {
			//��ӡ������̨
			System.out.println(new String(cbuf,0,len));
			//д�뵽2.txt
			osw.write(cbuf, 0, len);
		}
		//3 �ر���Դ
		isr.close();
		osw.close();
			
	}

	private static void writeFile() throws IOException {
		OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("p:/test/1.txt"), "utf-8");
		out.write("С˵����\n\r");
		out.write("����С˵����");
		out.close();
	}
}
