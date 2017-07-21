package FileDemo;
/**
 * main方法中一般不抛异常，所以本事例主要研究怎么抓取异常
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_9 {
	/**
	 *1 main方法中一般不抛异常
	 */
	public static void main(String[] args) {
		//1 创建流对象
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("p:/test/1.txt")));
			bw = new BufferedWriter(new FileWriter("note.txt"));
			
			//2 读写数据
			String line = null;
			while((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine();//换行
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3关闭资源
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
					//没有关闭资源  br就不指向这个流对象
					br=null;//br指向null 
				} 
			}
			if(bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					bw=null;
				}
			}
		}
	
	}

}


