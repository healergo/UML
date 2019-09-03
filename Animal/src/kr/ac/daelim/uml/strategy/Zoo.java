package kr.ac.daelim.uml.strategy;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tiger = new Tiger();
		tiger.performFly();
		tiger.performCry();
		tiger.display();
		tiger.move();
		
//		Animal eagle = new Eagle();
//		
		Animal turtle = new Turtle();
		turtle.display();
		turtle.performCry();
		turtle.move();
		turtle.performFly();
	}

}
