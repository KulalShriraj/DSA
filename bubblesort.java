package placement_preperation;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
	  int i,j,temp=0;
//		   Scanner  sc=new  Scanner(System.in);
//		   System.out.println("Enter   the  limit");
//		   int  n=sc.nextInt();

		   int arr1[]= {1,3,2,4,43};
		    
//		   System.out.println("Enter the number");
//		   for(i=0;i<n;i++){
//		     arr1[i]=sc.nextInt();
//		   }
		   for(i=1;i<arr1.length;i++){
		    
		      for(j=1;j<arr1.length-i;j++){
		             if(arr1[j]>arr1[j+1]){
		            temp=arr1[j];
		            arr1[j]=arr1[j+1];
		            arr1[j+1]=temp;

		        }

		    }
		   }
		   

		     


		   
		     System.out.println("sorted");
		   for(i=1;i<arr1.length;i++){
		       System.out.println(arr1[i]);
		   }

		
		

		
		

	}

}
