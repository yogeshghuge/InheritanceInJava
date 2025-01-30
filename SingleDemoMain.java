import java.util.Scanner;
class SingleDemoMain extends SingleDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		SingleDemoMain sd=new SingleDemoMain();
		sd.accept();
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Addition: " + sd.display(a, b));	}
}
