import java.util.Scanner;
class RectCal{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		Test t=new Test();
		System.out.println(t.Area(length,breadth));
		System.out.println(t.Perimeter(length,breadth));
		
	}
}
class Test{
	public double Area(int length,int breadth)
	{
		return length*breadth;
	}
	public double Perimeter(int length,int breadth)
	{
		return 2*(length+breadth);
	}
}
