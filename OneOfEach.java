
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		// add 2 boolean variables, to keep track of whether a boy or girl has been born
        boolean isBoy = false;
        boolean isGirl = false;
        int childrenCount = 0;
        // while(true || true) Count until there is at least one boy and one girl
        while(!isGirl || !isBoy){
            //50% chance for boy and girl
            boolean hasBoy = Math.random() > 0.5;
            // if hasBoy = true, loop going on
            if(hasBoy){
                isBoy = true;
                System.out.print("b ");
            // isGirl = true, loop is on
            }else{
                isGirl = true;
                System.out.print("g ");
            }
            childrenCount++;
        }
        System.out.println("\nYou made it... and you now have " + childrenCount + " children.");

	}
}
