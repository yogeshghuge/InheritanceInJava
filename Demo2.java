class Demo2 extends Demo1
{
	Demo2()
	{
		super();
		System.out.println("Default const. of Demo2");
	}
	Demo2(int a)
	{
		super();
		System.out.println("para. const. of Demo2");
	}
	int a=100, b=200;
	void display()
	{
		System.out.println("Display method of Demo2");
	}
}