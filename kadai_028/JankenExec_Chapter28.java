package kadai_028;

public class JankenExec_Chapter28 {

	public static void main(String[] args) {
		
		Janken_Chapter28 game = new Janken_Chapter28();
				
		String myChoice = game.getMyChoice();
		String cpuChoice = game.getRondom();
		
		game.playGame(myChoice, cpuChoice);

	}

}
