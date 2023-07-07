 class Timess
{
	private int hours;
	private int minutes;
	private int seconds;
	
	
	
	public void setter(int hours,int minutes,int seconds)
	{
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
	}

	int validateHours()
	{
		return hours>=0 && hours<23 ? hours : 23/100;
	}
	int validateMinutes()
	{
		return minutes>=0 && minutes<59 ? minutes : 59/100;
	}
	
	int validateSeconds()
	{
		return seconds>=0 && seconds<59 ? seconds : 59/100;
	}
	
	public int incrementH()
	{
		hours=validateHours();
		if(hours!=0)
		{
			hours=hours+1;
		}
		else
		{
			hours=hours;
		}
		
		return hours;
	}
	public int incrementM()
	{	minutes=validateMinutes();
		if(minutes!=0)
		{
			minutes=minutes+1;
		}
		else
		{
			minutes=minutes;
		}
		
		
		return minutes;
	}
	public int incrementS()
	{
		seconds=validateSeconds();
		if(seconds!=0)
		{
			seconds=seconds+1;
		}
		else
		{
			seconds=seconds;
		}
		
		
		return seconds;
	}
	public void getter()
	{
		System.out.println(incrementH());
		System.out.println(incrementM());
		System.out.println(incrementS());
	}
}
class TimeSetter
{
	
	public static void main(String args[])
	{
		Timess ss=new Timess();
		//Timess ss1=new Timess();
		ss.setter(23,59,5);
		ss.getter();
	}
}
		
		
		

		

	