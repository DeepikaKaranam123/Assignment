import java.util.Scanner;
class Test
{
	void Counter(String st)
	{
		int len=st.length(),count=0;
		char ch[]= new char[len];     
		for(int i=0;i<len;i++)
		{
			ch[i]= st.charAt(i);  
                	if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    			count++;  
		}
		System.out.print("Word count is :"+count);
	}
}

		

class WordCound
{
	 public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String st=sc.nextLine();
		Test c=new Test();
		c.Counter(st);
		
	}
}