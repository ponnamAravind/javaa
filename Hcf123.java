class Hcf
{
public static void main(String args[])
{
int num=10,num2=20,start=1,hcf=0;
	while(start<=num&&start<=num2)
	{
		if(num%start==0&&num2%start==0)
		{
			System.out.println(start);
		    hcf=start;		
		}
		start++;
	}
		System.out.println(hcf);
}
}