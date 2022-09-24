package hello;

class Student{
	String name;
	int roll_no;
    int marks;
	public Student(String name, int roll_no, int marks) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.marks = marks;
	}
    
	
}
class Array3
{
    public static void main(String [] args)
	{
		Student [] s;
		s=new Student [3];
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
	}	
}
