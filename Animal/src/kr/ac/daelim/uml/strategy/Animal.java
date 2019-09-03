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
		System.out.println("호랑이 모습");
	}
	public void performFly() {
		
	}
	public void performCry() {
		
	}
}
