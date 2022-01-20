
public class MyCurrentArray extends MyClassicalArray {

	
	public void Sort() {
		
		
		for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9-i; j++) {
                if (this.ar[j] > this.ar[j+1])
                {
                   
                    int temp = this.ar[j];
                    this.ar[j] = this.ar[j+1];
                    this.ar[j+1] = temp;
                }//end if
		
            }//end for j
		} //end for i
		System.out.print("Sort min -> max : ");
		 for(int i = 0; i <= 9 ; i++ ) {
		    	System.out.print(" "+this.ar[i]+" ");
		    }//end for
		 System.out.println("");
       }//End Method Sort
	
	public int Search( int s) {
		
		int position = 0 ;
		
		 for(int i = 0; i <= 9 ; i++ ) {
		    	
			 if(s == this.ar[i] )
				 
				 position = i+1;
			 
			 
		    }//end for
		 
		return position;
		
       }//End Method Search
	
}//Class

	
	
	
	
