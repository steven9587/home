package student;

public class GraduateStudent extends Student {
	int thesis;

	public GraduateStudent(String name, int english, int math, int chinese,int thesis) {
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		this.thesis = thesis ; 
	}
	
	@Override
	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese+"\t" + thesis);
	}
	
	@Override
	public int getAverage() {
		return (english + math + chinese + thesis) / 4;
	}
	
}
