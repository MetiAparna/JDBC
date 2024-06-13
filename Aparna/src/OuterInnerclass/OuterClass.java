package OuterInnerclass;

public class OuterClass
{
	int a;
	static int b;
	public static class InnerClass
	{
		int c;
		public void m1()
		{
			System.out.println("m1() method of inner class");
		}
		public static void m2()
		{
			System.out.println("m2() method of inner class");
		}
		
		
	}

}
