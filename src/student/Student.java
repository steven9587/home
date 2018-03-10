package student;

public class Student {
	String name;
	int english;
	int math;
	int chinese;
	int pass = 60;

	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public Student() {

	}

	public Student(String name, int english, int math, int chinese) {
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}

	public static void method() {
		System.out.println("Hello!");
	}
}
