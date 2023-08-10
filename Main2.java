package quest2;

interface Person {
	void speak();
}

public class Main2 {
	public static void main(String[] args) {
		Student student =new Student();
		student.speak();
		Teacher teacher =new Teacher();
		teacher.speak();
	}
}