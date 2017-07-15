package day_4;

import java.util.Scanner;
/**
 * 猜数字，打印结果猜测结果，并求所有数字之和
 *  主要注意flog的用法。
 * @author tiantian
 *
 */
public class Demo_4 {

	
		public static void main(String[] args) {
			System.out.println("请输入你猜测的数字");
			Scanner sc = new Scanner(System.in);
			int testnum = sc.nextInt();
			boolean flag =false;
			int[] num = { 8, 4, 2, 1, 23, 344, 12 };
			int sum = 0;
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
				sum += num[i];
			}
			System.out.println("数列中所有数字之和：" + sum);
			for (int i = 0; i < num.length; i++) {
				if (num[i] == testnum) {
					flag=true;
					break;
				}
			}
			if (flag) {
				System.out.println("恭喜你猜中啦");
			}
			else {
				System.out.println("很遗憾，你没有猜对");
			}
		}
	}

	


