package FileDemo;

/**
 * 使用集合存储5个用户对象
 *  把对象的信息写到文本文本中,每个对象占一行
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo_7 {

	public static void main(String[] args) throws IOException {
		ArrayList<User> aList = new ArrayList<>();
		aList.add(new User("jack", "销售", 18, 8000));
		aList.add(new User("rose", "行政", 26, 10000));
		aList.add(new User("张三", "前端", 25, 10000));
		aList.add(new User("张三", "算法工程师", 25, 20000));
		// 创建流对象(字符高效流 BufferedReader/BufferedWriter)
		BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
		// 2 读写数据
		for (User user : aList) {
			String msg = user.getName() + "-" + user.getJob() + "-" + user.getAge() + "-" + user.getSalary();
			bw.write(msg);
			bw.newLine();// 换行
		}
		// 关闭资源
		bw.close();
	}

}

class User {
	private String name;
	private String job;
	private Integer age;
	private double salary;

	public User() {
	}

	public User(String name, String job, Integer age, double salary) {
		super();
		this.name = name;
		this.job = job;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}