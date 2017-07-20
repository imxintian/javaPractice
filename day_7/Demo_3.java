package FileDemo;
/**
 * �����ļ�
 */
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_3 {

	public static void main(String[] args) {
		
		try {
			copyFile();
			copyFile1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// ��һ�� �ַ���
	// ��ʱ��0.001
	private static void copyFile() throws IOException {
		//��ȡ����ʼִ��ʱ��ϵͳʱ��
		long start=System.currentTimeMillis();
		//����������
		FileInputStream fiStream=new FileInputStream("p:/test/1.txt");
		//
		FileOutputStream foStream=new FileOutputStream("С˵.txt");
		/* *  int read(byte[] buf,int offset,int len)
		 *  	buf  ������,ÿ�ζ�ȡ�����ݶ�������������
		 *  	offset  һ��Ϊ0
		 *  	len  ������ȡ�ĳ���
		 *  	����ֵ:	һ��ȥ�����ֽ���,��-1
		 */
		//������������
		byte[] buf=new byte[1024];
		int len=0;
		//��д����
		while ((len=fiStream.read(buf, 0, buf.length))!=-1) {
			foStream.write(buf,0,len);
		}
		// �ر���Դ
		fiStream.close();
		foStream.close();
		//��ȡ����ʱϵͳʱ��
		long end = System.currentTimeMillis();
		System.out.println((end-start)*1.0/1000);
		
	}
	    
		//����  �ֽ�������
	    //��ʱ0.037
		private static void copyFile1() throws IOException {
			long start = System.currentTimeMillis();
			//copy operation
			//1 ����������
			FileInputStream fis = new FileInputStream("p:/test/1.txt");
			FileOutputStream fos = new FileOutputStream("С˵.txt");
			//2 ��д����
			int data = 0;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			//3 �ر���Դ
			fis.close();
			fos.close();
			long end = System.currentTimeMillis();
			System.out.println((end-start)*1.0/1000);
		}

}
