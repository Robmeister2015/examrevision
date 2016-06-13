package advancedclassdesign;

public class NestedClasses {

	private int privateOuterInt = 10;
	
	public NestedClasses(){
		this.privateOuterInt = 10;
	}
	
	public static void main(String[] args){
	
		/*
		 * To instantiate a non-static inner-class, create an instance of the outer
		 * class and use the syntax <StaticOuter>.<StaticInner><InstanceName>=<InstanceOuter>.<new><StaticInner>();
		 */
		NestedClasses n = new NestedClasses();
		NestedClasses.NestedClassInside innerInstance = n.new NestedClassInside();
		System.out.println(innerInstance.privateOuterInt);
		
	}
	
	class NestedClassInside {
		
		public NestedClassInside(){
			this.privateOuterInt = 10;
		}
	}
	//Accessing private members of an outer class
	
}
