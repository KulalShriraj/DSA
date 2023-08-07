package placement_preperation;

import java.util.HashSet;
import java.util.Iterator;

public class remove_duplicate_items {

	// Import the HashSet class
	
	  public static void main(String[] args) {
	  int arr[]={1,5,2,34,5,4,4,6,6,6,6,6,6,6,6,6,6,6,6,6,6};
	    HashSet<Integer> cars = new HashSet<Integer>();
	  for(int i:arr){
	  cars.add(i);
	  }
	  
	    for (int j: cars) {
	      System.out.println(j);
	    }
	  }
	}


		
		
		

		
		
		
