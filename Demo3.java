class Demo3 extends Demo2
{
	Demo3()
	{
		super();
		System.out.println("Default const. of Demo3");
	}
	Demo3(int a)
	{
		super(10);
		System.out.println("Para. const. of Demo3");
	}
	int a=1000, b=2000;
	void display()
	{
		System.out.println("a="+super.a+" b="+super.b);
		System.out.println("Display method of Demo");
	}
}