import java.util.*;
class fib
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=0,b=1,cou=0;;
		//int n=s.nextInt();
		for(int i=0;i<10;i++)
		{
		    cou=a+b;
		    System.out.print(cou+" ");
		    a=b;
		    b=cou;
		}
	}
}
