/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		// #feedback: better to give a meaningfull name instead of using comments
		int prev = 0;
		// #feedback: really bad idea to use such way loop - you should use the conditional statement to manage a loop correctly.
        	do {
	    		// generate random number in range [0 -> 10)
            		int random = (int) (Math.random() * 10);
			boolean isIncreased = random >= prev;
            		if(isIncreased){
                		System.out.print(random + " ");
			}
			// previous number gets random value fron last loop
                	prev = random;
       		 } while(isIncreased);
    }
}

