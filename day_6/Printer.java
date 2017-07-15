package com.xintian.day_6;
//
public class Printer {
//以接口的引用作为属性
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
		System.out.println("使用"+inkBox.color()+"墨水和"+paper.size()+"打印");
	}
	
}
