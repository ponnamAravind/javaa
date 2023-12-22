class Evil
{
public static void main(String args[])
{
 int num=9,sum=0,total=0,temp=num,rem=0;
sum=(int)Math.pow(num, 2);
for(;sum>0;sum/=10)
{
   rem=sum%10;
    total+=rem;
}
if(temp==total)
System.out.println("evil number");

}
}