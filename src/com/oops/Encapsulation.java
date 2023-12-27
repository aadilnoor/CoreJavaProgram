package com.oops;

interface I1
{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
}
class Demo1
{
	private String name;
	private int id;
	private int age;
	
	public Demo1(String name,int id,int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
class Demo2 implements I1
{
	@Override
	public void m1()
	{
		System.out.println("m1 method..");
	}
	@Override
	public void m2()
	{
		System.out.println("m1 method..");
	}
	@Override
	public void m3()
	{
		System.out.println("m1 method..");
	}
	
	void All()
	{
		Demo1 t=new Demo1("AADIL",101,19);
		System.out.println("Name : " +t.getName());
		System.out.println("Id : " +t.getId());
		System.out.println("Age : " +t.getAge());
	}
}

class Demo3 implements I1
{
	@Override
	public void m1()
	{
		System.out.println("m1 method..");
	}
	@Override
	public void m2()
	{
		System.out.println("m1 method..");
	}
	@Override
	public void m3()
	{
		System.out.println("m1 method..");
	}
	
	void All()
	{
		Demo1 t=new Demo1("Sameer",102,20);
		System.out.println("NAME : " +t.getName());
		System.out.println("ID : " +t.getId());
		System.out.println("AGE : " +t.getAge());
	}
}
class Demo4 implements I1
{
	public void m1()
	{
		System.out.println("");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	public void m3()
	{
		System.out.println("m3");
	}
	void All()
	{
		Demo1 t = new Demo1("Iliyas",103,25);
		System.out.println("NAME : " +t.getName());
		System.out.println("ID : " +t.getId());
		System.out.println("AGE : " +t.getAge());
	}
	
	
}
public class Encapsulation {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.All();
		d.m1();
		d.m2();
		d.m3();
		Demo3 d1 = new Demo3();
		d1.All();
		d.m1();
		d.m2();
		d.m3();
		Demo4 d2 = new Demo4();
		d2.All();
		d.m1();
		d.m2();
		d.m3();
		
		
		
	}
	
}
