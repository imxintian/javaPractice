package FileDemo;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo_6 {

	public static void main(String[] args) throws IOException {
		FileReader fReader =new FileReader("p:/test/1.txt");
		FileWriter fWriter=new FileWriter("p:/test/3.txt");
		int len=0;
		char[] cbuf = new char[1024];
		while ((len=fReader.read(cbuf, 0, cbuf.length))!=-1) {
			fWriter.write(cbuf, 0, len);
		}
		fReader.close();
		fWriter.close();

	}

}
