package PrOgrAM;

public class Java1 {
	
	
	public static void main(String[] args) {
	
		String id="Green Beans";
		String un="oz";
		
		double price=0.59;
		double size=11.5;
		double ssize=16;
		double sprice;
		sprice=price/size*ssize;
		
		System.out.printf("\n%8.2f      %-10.20s     %5.2f %s",price,id,size,un);
System.out.printf("\nUnit Price      %5.2f     For %.2f %s",sprice,ssize,un);
	
		
	}

}
