import java.util.*;
class MainMultilevelDemo extends ScifiCalcultorM
{
	
	void show()
	{
		System.out.println("Main class of Multi-level inheritance");
	}
	public static void main(String args[])
	{
		MainMultilevelDemo md=new MainMultilevelDemo();
		md.show();
		System.out.println(md.add(20,30));
		System.out.println(md.sub(50,30));
		System.out.println(md.div(20,4));
		System.out.println(md.mul(20,30));
		System.out.println(md.square(20));
		System.out.println(md.cube(20));
		System.out.println(md.squareRoot(100));
		System.out.println(md.cubeRoot(27));
	}
}