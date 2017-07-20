package FileDemo;
/**
 * 读操作
 */
import java.io.FileInputStream;
import java.io.IOException;

public class Demo_2 {
	public static void main(String[] args)  {
	try {
		//读小说
		readNote();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	private static void readNote() throws IOException {
		//1 创建流对象
		FileInputStream fis = new FileInputStream("p:/test/1.txt");
		//2 读数据
		int data = 0;
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
		}
		//3 关闭资源
		fis.close();
	}
	
}

