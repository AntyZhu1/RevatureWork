package com.anthony;

//Static
class PolyCalculator
{
    int add(int n1, int n2)
    {
         return n1+n2;
    }
    int  add(int n1, int n2, int n3)  
    {
         return n1+n2+n3;
    }
}
class Demo
{
   public static void main(String args[])
   {

   }
}

//Runtime
class PolyRuntime{
	   public void testing(){
		System.out.println("Test");
	   }
	}
	class PRExtension extends PolyRuntime{

	   public void testing(){
		System.out.println("Overriding");
	   }
	}
	
public class Polymorphism {
	public static void main(String[] args) {
		   PolyCalculator obj = new PolyCalculator();
	       System.out.println(obj.add(1, 2));
	       System.out.println(obj.add(3, 4, 5));
	       
	       PolyRuntime obj2 = new PRExtension();
	       obj2.testing();
	}
}
