package oops.core.java;

public class MainMouse {
	
/*	class DanceMouse extends Mouse{
		public void dance() {
			System.out.println("the mouse is dancing..");
		}
	}*/
	
public static void main(String ...main) {

	//Mouse m= new Mouse();
	Mouse m=new Mouse("musa","Black",200);
	System.out.println(m);
	m.cry();
	m.run();
	//Mouse m1= new DanceMouse();			//upcasting
	m=new DanceMouse();					//downcasting
	DanceMouse m2= (DanceMouse)m;		//downcasting
//	m.dance();
//	System.out.println(m);
	m2.dance();


}
}

