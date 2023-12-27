/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		// make a inr previous = 0
		int p = 0;
	//start while loop until random >= p, if random < p, loop breaks	
        while(true){
	    // generate random number in range [0 -> 10)
            int random = (int) (Math.random() * 10);
            if(random >= p){
                System.out.print(random + " ");
		// previous number gets random value fron last loop
                p = random;
            }else{
		// breaking loop if random <= p
                break;
            }
        }
    }
}

