import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		
		
		MyClassicalArray  mclassi = new MyClassicalArray();
		MyCurrentArray m = new  MyCurrentArray() ;
		
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("");
		System.out.println("MyClassicalArray");
		mclassi.GetArray();
		//Fine Maximum
		int Mac = mclassi.FindMax();
		System.out.println("Max is " + Mac);
		
		//Find Minimum
		int Mic = mclassi.FindMin();
		System.out.println("Min is " + Mic);
		/////////////////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("");
		System.out.println("MyCurrentArray");
		m.GetArray();
		//Fine Maximum
		int Max = m.FindMax();
		System.out.println("Max is " + Max);
		
		//Find Minimum
		int Min = m.FindMin();
		System.out.println("Min is " + Min);
		
		//Sort Minimum -> Maximum
		m.Sort();
		
		// Search Position number
		System.out.print("What  search position number    : ");
		Scanner sc = new Scanner(System.in);
	    int s = sc.nextInt();
	    System.out.print("Position " + s + " is : " + m.Search(s));  
	    /////////////////////////////////////////////////////////////////////////////

	    
	    
	}// End main

}
