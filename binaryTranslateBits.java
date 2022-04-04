//binary  translator
package binary;

import java.util.ArrayList;
import java.util.Scanner;

public class binary {
	//main method
	  public static void main(String[] args) {
		 
		  
		  int[] Digit = {2,0,4,5,1,6,6,2};
		  for(int i =0; i<Digit.length;i++)
		  {
			  if (Digit[i]>=3)
					  Digit[i] =1;
			  else
				  Digit[i] = 0;
		  }
		  
		  for(int i = 0; i<10; i++)
			  System.out.println(Digit[i]);
		  
	  }
}
