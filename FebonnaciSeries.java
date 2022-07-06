import java.util.*;

public class FebonnaciSeries{
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a no.");
		
		int num= sc.nextInt();
	
	int e=0;
	int b=1;
	
	int c;
	while(num>=0){
		
		c=e+b;
		System.out.println(e);
		e=b;
		b=c;
		
		
		num--;
	}
	
	
	
	}
	
	
}


