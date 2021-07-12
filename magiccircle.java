package PrOgrAM;
import java.util.*;
public class magiccircle {
private Scanner in=new Scanner(System.in);
	public magiccircle()
	{
		int x,y,z;
		System.out.printf("\nEnter X Value :");
		x=in.nextInt();
		
		System.out.printf("\nEnter Y Value :");
		y=in.nextInt();
		
		System.out.printf("\nEnter Z Value :");
		z=in.nextInt();
		
		System.out.printf("\n%3d %3d %3d",x-z,x+z-y,x+y);
		System.out.printf("\n%3d %3d %3d",x+y+z,x,x-y-z);
		System.out.printf("\n%3d %3d %3d",x-y,x+y-z,x+z);
		
	}

}
