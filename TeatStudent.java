import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Student> ar1 = new ArrayList<Student>(5);
		
		Student s1 = new Student();
		s1.setNo(1);
		s1.setEmail("aa@aa.com");
		
		ar1.add(s1);
		Student s2 = new Student();
		
		s2.setNo(2);
		s2.setEmail("b@bb.com");
		
		ar1.add(s2);
		
	Student s3 = new Student();
		
		s3.setNo(3);
		s3.setEmail("cc@cc.com");
		
	ar1.add(s3);
	
	System.out.println(ar1);	
	}
}
