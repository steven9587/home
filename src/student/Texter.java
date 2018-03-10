package student;

public class Texter {

	public static void main(String[] args) {
		Student stu1 = new Student("王小明", 55, 66, 77);
		Student stu2 = new Student("王大明", 66, 77, 88);
		GraduateStudent stu3 = new GraduateStudent("王中明", 77, 88, 99 ,100);
		// stu.english=55;
		// stu.math=66;
		// stu.chinese=77;

		stu1.pass = 70;// 學生1及格分數為70
		stu1.print();
        int avg = stu1.getAverage();
		System.out.println(stu1.name + ":" + avg);
		Student.method();
		
		stu2.print();
		int avg2 = stu2.getAverage();
		System.out.println(stu2.name + ":" + avg2);
		Student.method();
		
		stu3.print();
		int avg3 = stu3.getAverage();
		System.out.println(stu3.name + ":" + avg3);
		Student.method();

	}
}
