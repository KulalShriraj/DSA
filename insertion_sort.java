package placement_preperation;

public class insertion_sort {

	public static void main(String[] args) {
		  int i,j;	

		   int arr1[]= {1,98,2,4,9};
		   
		   for(i=1;i<arr1.length;i++){
			   j=i-1;
			   int current=arr1[i];
			   while(j>=0 && current<arr1[j]) {
				   arr1[j+1]=arr1[j];
				   j--;
			   }
			   arr1[j+1]=current;
		    
		  
		   }
		   

		     


		   
		     System.out.println("sorted");
		   for(i=1;i<arr1.length;i++){
		       System.out.println(arr1[i]);
		   }

		
		

		
		

	}

}
