package placement_preperation;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		int i,j,flag;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int n=sc.nextInt();
	for(i=0;i<n;i++) {
		flag=0;
		if(i==0 || i==1) {
			continue;
		}
		
		for(j=2;j<=i/2;j++) {
			if(i%j==0) {
				flag=1;
				break;
			
			
			}
		}
			if(flag==0) {
				System.out.println(i);
			}
			
		

	}

}
}
