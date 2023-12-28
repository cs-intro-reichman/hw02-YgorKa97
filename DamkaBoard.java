/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		 int board = Integer.parseInt(args[0]);
        int board = Integer.parseInt(args[0]);
            for (int i = 0; i < board; i++) {
                for (int j = (1 - board); j <= board; j++) {
                    boolean isTale = (i + j) % 2 ==0;
                    if (board % 2 == 0){
                        isTale = !isTale;
                    }
                    System.out.print(isTale ? "*" : " ");
                    }
                System.out.println();
            }
	}
}
