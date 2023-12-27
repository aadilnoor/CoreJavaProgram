package com.opps;

interface HostelData {

	public void hosteldetail();

	public void studentdata();
}

interface CollageData {

	public void Collagedetail();

	public void studentdata();

}

public class MultipleInheritance implements HostelData, CollageData {

	@Override
	public void hosteldetail() {
		System.out.println("Hostel Name : Center ");
		System.out.println("Hostel Location : SakiNaka ");

	}

	@Override
	public void studentdata() {
		System.out.println("Student Name : Sameer ");
		System.out.println("Student Class : BCA ");

	}

	@Override
	public void Collagedetail() {
		System.out.println("Collage Name : Leelawati collage ");
		System.out.println("Collage Location : Pune ");

	}

	public static void main(String[] args) {
		MultipleInheritance ob = new MultipleInheritance();
		ob.Collagedetail();
		ob.studentdata();
		ob.hosteldetail();
	}

}
