package com.xintian.day_6;

public class Test {

	public static void main(String[] args) {
	//������ӡ��
		Printer p=new Printer();
		p.setInkBox(new BlackInkBox());
		p.setPaper(new A4Paper());
		p.print();

	}

}
