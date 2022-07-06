import java.util.*;

public class FebonnaciSeries{
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a no.");
		
		int num= sc.nextInt();
	
	 int a=0;
	 int b=1;
	
	 int c;
	 while(num>=0){
		
		c=a+b;
		System.out.println(a);
		a=b;
		b=c;
		
		
		num--;
	}
	
	
	
	}
	
	
}


