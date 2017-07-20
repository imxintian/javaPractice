package FileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Demo_8 {
	public static void main(String[] args) throws Exception {
		Student stu= new Student();
		stu.setName("小芳芳");
		stu.setAge(18);
		Serialize(stu);
		n0nSerialize();
	}

	private static void n0nSerialize() throws FileNotFoundException, IOException, Exception {
		//1 创建流对象
				ObjectInputStream ois = new ObjectInputStream(
						new FileInputStream("msg.obj"));
				//2 读数据
				Student stu = (Student)ois.readObject();
				System.out.println(stu.getName()+","+stu.getAge());
				//3关闭资源
				ois.close();
		
	}

	private static void Serialize(Student stu) throws FileNotFoundException, IOException {
		//创建序列化流对象
		ObjectOutputStream oos  =new ObjectOutputStream(new FileOutputStream("msg.obj"));
		//写数据
		oos.writeObject(stu);
		//结束资源
		oos.close();
		
	}
}
//必须实现序列化接口
class Student implements Serializable{
	/**对象被序列化到磁盘会保存所属类的serialVersionUID 
	 * 再次读取到内存中，会和Student.class的serialVersionUID 对比
	 * 如果不相同，就会抛出异常。
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer age;
	
	public Student() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}