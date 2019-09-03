package kr.ac.daelim.uml.strategy;

public abstract class Animal {
	IFly fly;
	ICry cry;
	public Animal() {
		
	}
	public void display() {
		System.out.println("Animal: display()");
	}
	public void move() {
		System.out.println("ȣ���� ���");
	}
	public void performFly() {
		
	}
	public void performCry() {
		
	}
}
