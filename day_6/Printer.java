package com.xintian.day_6;
//
public class Printer {
//�Խӿڵ�������Ϊ����
	private InkBox inkBox;
	private Paper paper;
	public InkBox getInkBox() {
		return inkBox;
	}
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public Printer() {
		
	}
	
	public Printer(InkBox inkBox, Paper paper) {
	
		this.inkBox = inkBox;
		this.paper = paper;
	}
	
	public void print() {
		System.out.println("ʹ��"+inkBox.color()+"īˮ��"+paper.size()+"��ӡ");
	}
	
}
