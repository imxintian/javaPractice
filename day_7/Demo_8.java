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
		stu.setName("С����");
		stu.setAge(18);
		Serialize(stu);
		n0nSerialize();
	}

	private static void n0nSerialize() throws FileNotFoundException, IOException, Exception {
		//1 ����������
				ObjectInputStream ois = new ObjectInputStream(
						new FileInputStream("msg.obj"));
				//2 ������
				Student stu = (Student)ois.readObject();
				System.out.println(stu.getName()+","+stu.getAge());
				//3�ر���Դ
				ois.close();
		
	}

	private static void Serialize(Student stu) throws FileNotFoundException, IOException {
		//�������л�������
		ObjectOutputStream oos  =new ObjectOutputStream(new FileOutputStream("msg.obj"));
		//д����
		oos.writeObject(stu);
		//������Դ
		oos.close();
		
	}
}
//����ʵ�����л��ӿ�
class Student implements Serializable{
	/**�������л������̻ᱣ���������serialVersionUID 
	 * �ٴζ�ȡ���ڴ��У����Student.class��serialVersionUID �Ա�
	 * �������ͬ���ͻ��׳��쳣��
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