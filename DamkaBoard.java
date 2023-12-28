/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int board = Integer.parseInt(args[0]);
        for( int i = 0; i < board; i++){
            for (int j = -3; j <= board; j++) {
                if( (i+j) % 2 != 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
	}
}
