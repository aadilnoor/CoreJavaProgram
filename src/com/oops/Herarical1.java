package com.oops;
class Detail
{
	public void main()
	{
		System.out.println("Super class");
	}
}
class Detail1 extends Detail
{
	public void main1()
	{
		System.out.println("child class");
	}
}
class Detail2 extends Detail
{
	public void main2()
	{
		System.out.println("mini class");
	}
}
public class Herarical1
{
	public static void main(String[] args)
	{
		Detail1 ob = new Detail1();
		ob.main();
		ob.main1();
		Detail2 obj = new Detail2();
		obj.main();
		obj.main2();
	}

}
