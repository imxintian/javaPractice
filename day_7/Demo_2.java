package FileDemo;
/**
 * ������
 */
import java.io.FileInputStream;
import java.io.IOException;

public class Demo_2 {
	public static void main(String[] args)  {
	try {
		//��С˵
		readNote();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	private static void readNote() throws IOException {
		//1 ����������
		FileInputStream fis = new FileInputStream("p:/test/1.txt");
		//2 ������
		int data = 0;
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
		}
		//3 �ر���Դ
		fis.close();
	}
	
}

