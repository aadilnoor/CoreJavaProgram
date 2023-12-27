package com.programTest;

abstract class Woodwork {
	abstract String wood();
}

class Door extends Woodwork {

	@Override
	String wood() {

		return "making door..";
	}

}

class Window extends Woodwork {

	@Override
	String wood() {

		return "making Window..";
	}

}

class Stool extends Woodwork {

	@Override
	String wood() {

		return "making Stool..";
	}

}

public class Test {
	public static void main(String[] args) {
		Door d = new Door();
		String door = d.wood();
		Window w = new Window();
		String window = w.wood();
		Stool s = new Stool();
		String stool = s.wood();
		System.out.println(door+"\n"+window+"\n"+stool);
	}
}
