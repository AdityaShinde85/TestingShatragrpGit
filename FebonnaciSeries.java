import java.util.*;

public class FebonnaciSeries{
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a no.");
		
		int num= sc.nextInt();
	
	int r=0;
	int b=1;
	
	int c;
	 while(num>=0){
		
		c=r+b;
		System.out.println(r);
		r=b;
		b=c;
		
		
		num--;
	}
	
	
	
	}
	
	
}


