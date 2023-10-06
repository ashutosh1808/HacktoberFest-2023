import java.io.*;
class Factorial
{
public static void main(String[] args)
{
	Console c=System.console();
	int n=Integer.parseInt(c.readLine("enter num: "));
	if(n>=0)
	{
		int f=1;
		for(int i=1;i<=n;i++)	f*=i;
		System.out.println(n+"! = "+f);
	}
	else
	{
		System.out.println("invalid input");
	}
}
}