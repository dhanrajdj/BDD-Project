package stepDefinations;

public class Baseclass {

	public static void main(String[] args) {
	
		int n1 = 0,  n2 = 1, sum = 0;
		
		System.out.println(n1+" "+n2);
		
		for(int w=2; w<10; w++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}

	}

}
