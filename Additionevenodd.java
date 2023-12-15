class  Additionevenodd
{
public static void main(String args[])
{
double start=1,count2=1,count1=1;
	while(start<=100)
	{
		if(start%2==0)
		{
		     count2=count2*start;
		}
		else
		{
			count1*=start;
		}
		
	start++;
	}
		System.out.println("sum of even"+count2);
		System.out.println("sum of odd"+count1);

}
}