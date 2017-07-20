package FileDemo;
/**
 * �����ļ�
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_4 {
	

	public static void main(String[] args) {
		try {
			copyfiles();
			copyFile1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//��Ч������
// ��ʱ16.493

	private static void copyfiles() throws IOException {
		//��ȡϵͳʱ��
		long start = System.currentTimeMillis();
		//1 ����������
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("P:\\test\\Ф��˵ľ���.RMVB"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("P:\\test\\movie\\movie.RMVB"));
		byte []bytes=new byte[1024];
		//2 ��д��	��
		int len = 0;//ʵ�ʶ�ȡ�ĳ���
		while((len=bis.read(bytes, 0, bytes.length))!=-1) {
			bos.write(bytes,0,len);
		}
		//�ر���Դ
		bis.close();
		bos.close();
		long end = System.currentTimeMillis();
		System.out.println((end-start)*1.0/1000);
	}
	//�ַ�������
	//��ʱ��32.962
		private static void copyFile1() throws IOException {
			long start = System.currentTimeMillis();
			
			//1 ����������
			FileInputStream fis = new FileInputStream("P:\\\\test\\\\Ф��˵ľ���.RMVB");
			FileOutputStream fos = new FileOutputStream("P:\\test\\movie\\movie.RMVB");
			
			byte[] buf = new byte[1024];
			int len = 0;//ʵ�ʳ���
			while((len=fis.read(buf, 0, buf.length))!=-1) {
				fos.write(buf,0,len);
			}
			//3 �ر���Դ
			fis.close();
			fos.close();
			
			long end = System.currentTimeMillis();
			System.out.println((end-start)*1.0/1000);
		}
}
