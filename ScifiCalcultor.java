class ScifiCalcultor extends Calculator
{
	double square(double a){ return a*a;}
	double cube(double a){ return a*a*a;}
	double squareRoot(double a){ return Math.sqrt(a);}
	double cubeRoot(double a){ return Math.cbrt(a);}

	public static void main(String args[])
	{
		ScifiCalcultor s=new ScifiCalcultor();
		System.out.println(s.add(20,30));
		System.out.println(s.sub(50,30));
		System.out.println(s.div(20,4));
		System.out.println(s.mul(20,30));
		System.out.println(s.square(20));
		System.out.println(s.cube(20));
		System.out.println(s.squareRoot(100));
		System.out.println(s.cubeRoot(27));



		/*double sum=s.add(20,30);
		System.out.println(sum);*/
	}
}
	