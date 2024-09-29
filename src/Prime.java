
public class Prime {

	public static void main(String[] args) {
		
		int a = 0;
		int b= 1;
		int sum = 0;
		int i =1;	
		
		while(i<9)	{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
		
	}

}
