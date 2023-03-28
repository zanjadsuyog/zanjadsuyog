package Q10_Counter;

public class Student {

	private int id;
	private String name;
	private int marks;
	static int counter=0;
	
	Student()
	{
		
		
	}
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		
		{
			counter++;
		}
	}
	
	
	
}
