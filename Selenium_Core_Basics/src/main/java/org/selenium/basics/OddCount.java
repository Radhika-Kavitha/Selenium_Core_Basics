package org.selenium.basics;

public class OddCount 
{
	public static void main(String[] args)
	{
		int count=0;
		for(int i=1;i<=10;i++)
		{
		if(i%2!=0)
			{
				count=count+i;
			}
		}
		System.out.println("Sum of odd nums are  "+count);
	}
}
