package day04;

public class UseBag {
	public static void main(String[] args) {
		
		BagClass bag = new BagClass();
		
		String[] a= args[0].split(" ");
		
		bag.brand= a[0];
		bag.price=Integer.parseInt(a[1]);
		bag.iswaterProof=Boolean.parseBoolean(a[2]);
		
		BagClass bag1= new BagClass();
		
		String [] b=args[1].split(" ");
		
	bag1.brand= b[0];
		bag1.price =Integer.parseInt(a[1]);
		bag1.iswaterProof= Boolean.parseBoolean(a[2]);
		
		BagClass bag2=new BagClass();
		
		String [] c= args[2].split(" ");
		
		bag2.brand=c[0];
		bag2.price=Integer.parseInt(c[1]);
		bag2.iswaterProof= Boolean.parseBoolean(c[2]);
	
		System.out.println("Total price of bag is = "+(bag.price+bag1.price+bag2.price));
		
		System.out.println(bag.brand+" "+bag.price+" "+bag.iswaterProof+"\n"+bag1.brand+" "+bag1.price+" "+bag1.iswaterProof+"\n"+bag2.brand+" "+bag2.price+" "+bag2.iswaterProof);
	}

}
