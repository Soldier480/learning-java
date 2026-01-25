abstract class A
{
	public abstract void show();
	public abstract void config();

}
 /* 
   The Object of abstract class cannot be created in java, but we can inherit the abstract class 
   and create its object containing the implementation of abstract methods in derived class.
   An absteact class may contain abstract methods.
   */
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}


public class  Demo{
    public static void main(String[] args) {
    	
//    	A obj=new B();
    	
    	A obj=new A() 
    	{
    		public void show()
    		{
    			System.out.println("in new show");
    		}
    	};
    	obj.show();
    	
    }
}

