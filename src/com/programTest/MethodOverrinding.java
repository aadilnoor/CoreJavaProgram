package com.programTest;

class Laptop {
	int ram(int ram) {
		return 8;
	}

	int ssd(int ssd) {
		return 256;
	}
}

class Hp extends Laptop {
	int ram(int ram) {
		return ram;
	}

	int ssd(int ssd) {
		return ssd;
	}
}

public class MethodOverrinding {
	public static void main(String[] args) {
		Laptop l = new Hp();
		int ram = l.ram(16);
		int ssd = l.ssd(512);
		System.out.println("LAPTOP RAM : " + ram + "\nLAPTOP SSD : " + ssd);

	}
}
