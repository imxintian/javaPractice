package day_7;

import java.util.Scanner;
/**
 *  歌手打分：在歌唱比赛中，共有10位评委进行打分(键盘录入),
  	在计算歌手得分时,去掉一个最高分，去掉一个最低分，然后剩余的8位评委的分数进行平均，
  	就是该选手的最终得分。
  	求某选手的得分.
 * @author tiantian
 *
 */
public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sum=0;
		double[] score=new double[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("请输入第"+(i+1)+"个评委打分成绩");
			score[i]=sc.nextDouble();
			sum+=score[i];
		}
		double max=printMax(score);
		double min =printMin(score);
		double avg=(sum-max-min)/8;
		System.out.println("去掉最高分"+max);
		System.out.println("去掉最低分"+min);
		System.out.println("选手平均成绩为："+avg);
		
	}
	//最大值
		public static double printMax(double [] arr) {
			double max=arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (max<arr[i]) {
					max=arr[i];
				}
			}
			return max;
		}
		//最小值
		public static double printMin(double [] arr) {
			double min=arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (min>arr[i]) {
					min=arr[i];
				}
			}
			return min;
		}

}

