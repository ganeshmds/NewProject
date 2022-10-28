package day04;

public class UseStudent {
	public static void main(String[] args) {
		
		Student s1= new Student();
		
		String [] a=args[0].split(" ");
		
		s1.id= Integer.parseInt(a[0]);
		s1.section=a[1].charAt(0);
		s1.name=a[2];
		s1.standard=Integer.parseInt(a[3]);
		s1.isPresent=Boolean.parseBoolean(a[4]);
		
		Student s2 = new Student();
		

		String [] b=args[1].split(" ");
		
		s2.id= Integer.parseInt(b[0]);
		s2.section=b[1].charAt(0);
		s2.name=b[2];
		s2.standard=Integer.parseInt(b[3]);
		s2.isPresent=Boolean.parseBoolean(b[4]);
		
	Student s3 = new Student();
	

	String [] c=args[2].split(" ");
	
	s3.id= Integer.parseInt(c[0]);
	s3.section=c[1].charAt(0);
	s3.name=c[2];
	s3.standard=Integer.parseInt(c[3]);
	s3.isPresent=Boolean.parseBoolean(c[4]);
	
	System.out.println((s1.id+" "+s1.section+" "+s1.name+" "+s1.standard+" "+s1.isPresent+"\n"+s2.id+" "+s2.section+" "+s2.name+" "+s2.standard+" "+s2.isPresent+"\n"+s3.id+" "+s3.section+" "+s3.name+" "+s3.standard+" "+s3.isPresent).toUpperCase());;
	
}
	

}
	


