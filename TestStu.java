class TestStu
{
	int rollNumber;
	String name;
	int sub1marks,sub2marks,sub3marks;
	
	public TestStu(int rollNumber,String name, int sub1marks,int sub2marks,int sub3marks)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		this.sub1marks=sub1marks;
		this.sub2marks=sub2marks;
		this.sub3marks=sub3marks;
	}
	public int totalMarks()
	{
		return sub1marks+sub2marks+sub3marks;
	}
	public int average()
	{
		return (sub1marks+sub2marks+sub3marks)/3;	
	}
	public String results()
	{
		if(sub1marks >= 40 && sub2marks >=40 && sub3marks>=40)
		{
			return "PASSED";
		}
		return "FAILED";
	}
	public String division()
	{
		int avg=average();
		if(results().equals("PASSED"))
		{
			if(avg>=60)
			{
				return "FIRST";
			}
			else if(avg>=50)
			{
				return "SECOND";
			}
			else
			{
				return "THIRD";
			}
		}
		return "NA";
	}
}