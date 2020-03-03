package git;

public class main {

	public static void main(String[] args) {
		
		Chilld1 c1 = new Chilld1(); 
		Child2 c2 = new Child2();
		
		polymorphism1 p1 = new polymorphism1();
		polymorphism2 p2 = new polymorphism2();
		
//		c1.sum(5, 5);
//		c2.multiply(5, 5);
//		c1.division(5, 5);
//		
//		c1.setemail("wewebrsetr");
		
		
		p1.show("overloading1");
		p1.show(1111);
		
		p2.show();
		p2.show("overloading3");
	}

}
