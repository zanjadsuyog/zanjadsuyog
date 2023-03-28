package Q10_Counter;

public class StudentTest {

	public static void main(String[] args) {

		Student s1=new Student();
		System.out.println(s1.counter);
		
		
		Student s2=new Student(1,"omkar",87);
		Student s3=new Student(1,"suyog",97);
		Student s4=new Student(1,"suyog",97);

		System.out.println("Total student registered in school =>"+s1.counter);
	}

}
