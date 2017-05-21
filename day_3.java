package javaPrictice;

/**
 * 求解：1+2!+3!+...+10!
 * 思路：创建递归函数对阶乘进行计算
 * 		利用for循环，进行求和。
 * @author tiantian
 *
 */
public class day_3 {
	public static void main(String[] args) {
		int num = 10;
		int sums = 0;
		int sum = function(num);
		System.out.println(sum);
		//进行求和
		for (int i = 1; i <= num; i++) {
			sums += function(i);
			}System.out.println(sums);
	}
//创建函数，进行求阶
	public static int function(int num) {
		if (num == 0 || num == 1)
			return num;
		else
			return num * function(--num);

	}
}
