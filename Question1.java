package hw1;

public class Question1 {
	
		/*
		 * squareRoot returns the floor of the square root of n 
		 * (i.e., rounded down to nearest integer). You must
		 * use binary search to complete this question. 
		 */

		  public static int squareRoot(int n) 
		  {
			  
			  int end = 0;
			  
			  int left = 0, right = n;
			  while(left <= right) {
				  int middle = (left + right) / 2;
				  long square = middle*middle;
				  
				  if(n == square) {
					  return middle;
				  }
				  else if(n > square) {
					  left = middle + 1;
					  end = middle;
				  } else {
					  right = middle - 1;
				  }
			  }
			  return end;
		}
		  ;
		  
		  /*
		   * You can modify the main function in any way you like, 
		   * however, we will not mark your main function.
		   */

		  public static void main(String[] args) 
		  {

			  System.out.println(Question1.squareRoot(1));  //must print 1 
			  System.out.println(Question1.squareRoot(2));  //must print 1 
			  System.out.println(Question1.squareRoot(3));  //must print 1 
			  System.out.println(Question1.squareRoot(4));  //must print 2 
			  System.out.println(Question1.squareRoot(5));  //must print 2 
			  System.out.println(Question1.squareRoot(6));  //must print 2 
			  System.out.println(Question1.squareRoot(7));  //must print 2 
			  System.out.println(Question1.squareRoot(8));  //must print 2 
			  System.out.println(Question1.squareRoot(9));  //must print 3 
			  System.out.println(Question1.squareRoot(10));  //must print 3
			  System.out.println(Question1.squareRoot(11));  //must print 3
			  System.out.println(Question1.squareRoot(12));  //must print 3
			  System.out.println(Question1.squareRoot(13));  //must print 3
			  System.out.println(Question1.squareRoot(14));  //must print 3
			  System.out.println(Question1.squareRoot(15));  //must print 3
			  System.out.println(Question1.squareRoot(16));  //must print 4
			  System.out.println(Question1.squareRoot(17));  //must print 4
			  System.out.println(Question1.squareRoot(18));  //must print 4
			  System.out.println(Question1.squareRoot(19));  //must print 4
			  System.out.println(Question1.squareRoot(20));  //must print 4
			  System.out.println(Question1.squareRoot(21));  //must print 4
			  System.out.println(Question1.squareRoot(22));  //must print 4
			  System.out.println(Question1.squareRoot(23));  //must print 4
			  System.out.println(Question1.squareRoot(24));  //must print 4
			  System.out.println(Question1.squareRoot(25)); //must print 5
		      System.out.println(Question1.squareRoot(256)); //must print 16
		    
		  }
}