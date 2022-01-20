
import java.util.Random;

public class MyClassicalArray {

	
	
	protected int[] ar = new int[10] ; 
	 
	public MyClassicalArray() {
		Random rand = new Random();
	
	for(int i = 0; i <= 9 ; i++ ) {
			
			this.ar[i]= rand.nextInt(100);
		    	
		    }//end for

		   
	}// end Constructor Method


			
	public void GetArray() {
		
	
		System.out.print("Array : ");  
		 for(int i = 0; i <= 9 ; i++ ) {
		    	System.out.print(" "+this.ar[i]+" ");
		    }//end for
		 System.out.println("");
		
	}//End Method GetArray
	
	
	
	public int FindMax() {
		int Max  = this.ar[0];
		 for(int i = 0; i <= 9 ; i++ ) {
		    	
			 if(Max < this.ar[i]) {
				 
			        Max = this.ar[i];
				 
			 }
			 
		
		    }//end for
		 
		 return Max;
		 
		
	}//End Method FindMax
	
	public int FindMin() {
		int Min  = this.ar[0];
		 for(int i = 0; i <= 9 ; i++ ) {
		    	
			 if(Min > this.ar[i]) {
				 
			        Min = this.ar[i];
				 
			 }
			 
		
		    }//end for
		 
		 return Min;
		 
		
	}//End Method FindMin
	


}// end class
