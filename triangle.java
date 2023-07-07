import java.util.Scanner;
class triangle{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int base=sc.nextInt();
		int height=sc.nextInt();
		Test t=new Test();
		System.out.println(t.Area(base,height));
		System.out.println(t.Perimeter(a,b,c));
		
	}
}
class Test{
	public double Area(int base,int height)
	{
		return 0.5*base*height;
	}
	public double Perimeter(int a,int b,int c)
	{
		return a*b*c;
	}
}

