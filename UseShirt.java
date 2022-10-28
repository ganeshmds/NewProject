package day04;

public class UseShirt {
	public static void main(String[] args) {
		
		Shirt s = new Shirt();
		
		String [] s1= args[0].split("@");
		
		s.brand=s1[0];
		s.price=Integer.parseInt(s1[1]);
		s.taxpercentage=Integer.parseInt(s1[2]);
		s.discountPrice=Integer.parseInt(s1[3]);
		s.size = s1[4].charAt(0);
		s.netPrice= (s.price*s.taxpercentage/100);
		s.discountAmount= (s.netPrice*s.discountPrice/100);
		s.originalPrice= ((s.price+s.netPrice)-s.discountAmount);
		
		Shirt m= new Shirt();
		
String [] m1= args[1].split("#");
		
		m.brand=m1[0];
		m.price=Integer.parseInt(m1[1]);
		m.taxpercentage=Integer.parseInt(m1[2]);
		m.discountPrice=Integer.parseInt(m1[3]);
		m.size = m1[4].charAt(0);
		m.netPrice= (m.price*m.taxpercentage/100);
		m.discountAmount= (m.netPrice*m.discountPrice/100);
		m.originalPrice= ((m.price+m.netPrice)-m.discountAmount);

		
		
		Shirt n= new Shirt();
		
		String [] n1= args[2].split("\\$");
		
		
		n.brand=n1[0];
		n.price=Integer.parseInt(n1[1]);
		n.taxpercentage=Integer.parseInt(n1[2]);
		n.discountPrice=Integer.parseInt(n1[3]);
		n.size = n1[4].charAt(0);
		n.netPrice= (n.price*n.taxpercentage/100);
		n.discountAmount= (n.netPrice*n.discountPrice/100);
		n.originalPrice= ((n.price+n.netPrice)-n.discountAmount);

	System.out.println("Price of otto shirt is = "+s.originalPrice+"\n"+"Price of Raymond shirt is = "+m.originalPrice+"\n"+"Price of Ucb shirt is = "+n.originalPrice);
	}

}
