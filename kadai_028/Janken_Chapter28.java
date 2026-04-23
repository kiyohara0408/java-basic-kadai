package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Janken_Chapter28 {	
	private HashMap<String, String> hands;
	
	public Janken_Chapter28() {
		hands = new HashMap<>();
		hands.put("r", "グー");
		hands.put("s", "チョキ");
		hands.put("p", "パー");
	}
	
	
	
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String myChoice = scanner.nextLine();
		
		System.out.println(myChoice);
		
		scanner.close();
		return myChoice;		
	}
	
	
	
	public String getRondom() {
		
		String[] handArray = {"r", "s", "p"};
		
		double i = (Math.random()*3);
		
		i = (Math.floor(i));	
		
		String cpuChoice = handArray[(int) i];
		return cpuChoice;		
	}
	
	
	
	public void playGame(String myChoice, String cpuChoice) {
		String myHand = hands.get(myChoice);
		String cpuHand = hands.get(cpuChoice);
		
		System.out.println("自分の手は" + myHand + "相手の手は" + cpuHand);
	
	
	
		if (myChoice.equals(cpuChoice)) {
	        System.out.println("あいこです");
	    } else if ((myChoice.equals("r") && cpuChoice.equals("s")) ||
	               (myChoice.equals("s") && cpuChoice.equals("p")) ||
	               (myChoice.equals("p") && cpuChoice.equals("r"))) {
	        System.out.println("あなたの勝ちです！");
	    } else {
	        System.out.println("コンピュータの勝ちです！");
	    }
	}
}
