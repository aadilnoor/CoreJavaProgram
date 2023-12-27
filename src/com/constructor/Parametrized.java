package com.constructor;

public class Parametrized {
	String name;
	int emp_id;
	public Parametrized(String name,int emp_id)
	{
		this.name=name;
		this.emp_id=emp_id;
		System.out.println("NAME : " +name+"\n"+"EMP ID : "+emp_id +"\n");
	}
	public static void main(String[] args) {
		System.out.println("...ALL EMPLOYEE DETAIL...\n");
		Parametrized p = new Parametrized("Arhan",100);
		Parametrized p1 = new Parametrized("Aadil",101);
		Parametrized p2 = new Parametrized("Abrar",102);
		Parametrized p3 = new Parametrized("Asif",103);
		Parametrized p4 = new Parametrized("Aamir",104);
		Parametrized p5 = new Parametrized("Aakib",105);
		Parametrized p6 = new Parametrized("Asad",106);
		Parametrized p7 = new Parametrized("Belal",107);
		Parametrized p8 = new Parametrized("Basid",108);
		Parametrized p9 = new Parametrized("Sakib",109);
		Parametrized p10 = new Parametrized("Sameer",110);
		
		
	}
	
	

}
