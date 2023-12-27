/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		 // user input
        int num = Integer.parseInt(args[0]);
        // sum = 1 because String starts from 1
        int sum = 1;
        // Start string from 1 because we need to make it look like this:
        // 6 is a perfect number since 6 = 1 + 2 + 3
        String divisors = "1";
        //start for loop to find divisors i = 2 because sum starts from 1
        for(int i = 2; i < num; i++){
            //check for divisors
            if(num % i == 0){
                sum += i;
                // String starts from 1 and for loop add divisors.
                divisors += " + " + i;
            }
        }
        // check for a perfect number or not
        if (sum == num){
            System.out.println(num + " is a perfect number since " + num + " = " + divisors );
        }else{
            System.out.println(num + " is not a perfect number");
        }
	}
}
