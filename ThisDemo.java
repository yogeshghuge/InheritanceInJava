class ThisDemo
{
	int a=100,b=200;
	ThisDemo()
	{
		this(10,20);
		System.out.println("Default const. of Demo");
	}
	ThisDemo(int a, int b)
	{
		System.out.println("int int para. const. of Demo");
	}
	void display()	
	{
		int a=10,b=20;
		System.out.println("Display method of Demo");
		System.out.println("a="+this.a+" b="+this.b);
		System.out.println(this);
	}
}