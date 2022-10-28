package day04;

public class SplitInLms {
	public static void main(String[] args) {
		
		String []a= args[0].split(" ");
		int a1= Integer.parseInt(a[0]);
		int a2= Integer.parseInt(a[1]);
		int a3= Integer.parseInt(a[2]);
		
		System.out.println(a1+a2+a3);
	}

}
