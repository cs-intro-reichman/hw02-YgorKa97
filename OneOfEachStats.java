import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		iint T = Integer.parseInt(args[0]);
        int seeds = Integer.parseInt(args[1]);
        int totalChildren = 0;
        int twoChildren = 0;
        int threeChildren = 0;
        int fourOrMore = 0;
        Random generator = new Random(seeds);
        for(int i = 0; i < T; i++){
            boolean isBoy = false;
            boolean isGirl = false;
            int childCount = 0;
            while(!isBoy || !isGirl){
                double rnd = generator.nextDouble();
                boolean hasBoy = rnd < 0.5;
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

        // most common number of children
        int max = Math.max(Math.max(twoChildren ,threeChildren),fourOrMore);
        if (max == twoChildren){
            System.out.println("The most common number of children is 2.");
        }else if(max == threeChildren){
            System.out.println("The most common number of children is 3.");
        }else if(max == fourOrMore){
            System.out.println("The most common number of children is 4 or more.");
        }
		// Gets the two command-line arguments
		//int T = Integer.parseInt(args[0]);
		//int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        //Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
