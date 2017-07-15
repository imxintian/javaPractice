package com.xintian.day_6;

public class Test {

	public static void main(String[] args) {
	//创建打印机
		Printer p=new Printer();
		p.setInkBox(new BlackInkBox());
		p.setPaper(new A4Paper());
		p.print();

	}

}
