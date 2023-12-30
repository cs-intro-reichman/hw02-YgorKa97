/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
        int totalChildren = 0;
        int twoChildren = 0;
        int threeChildren = 0;
        int fourOrMore = 0;
        for(int i = 0; i<=T; i++){
            boolean isBoy = false;
            boolean isGirl = false;
            int childCount = 0;
            while(!isBoy || !isGirl){
                boolean hasBoy = Math.random() < 0.5;
                if(hasBoy){
                    isBoy = true;
                }else{
                    isGirl = true;
                }
                childCount++;
            }
            totalChildren += childCount;

            if(childCount == 2){
                twoChildren++;
            } else if (childCount == 3){
                threeChildren++;
            }else if (childCount >= 4){
                fourOrMore++;
            }
        }
        double avg = (double) totalChildren / T;
        System.out.println("Average: " + avg + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + twoChildren);
        System.out.println("Number of families with 3 children: " + threeChildren);
        System.out.println("Number of families with 4 children or more: " + fourOrMore);
	}
}
