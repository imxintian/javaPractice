package javaPrictice;

import java.util.Scanner;

/**
 * 利用if-else 判断瑞年
 * 
 * @author tiantian
 *
 */
public class day_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入所要被判断的年份");
		int year = sc.nextInt();
		function(year);
		sc.close();
	}

	public static void function(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " 是闰年");
		} else {
			System.out.println(year + " 不是闰年");
		}
	}
}
