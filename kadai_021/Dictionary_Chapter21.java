package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	private HashMap<String, String> fruit = new HashMap<>();
	
	public Dictionary_Chapter21() {
		fruit.put("apple", "りんご");
		fruit.put("peach", "桃");
		fruit.put("banana", "バナナ");
		fruit.put("lemon", "レモン");
		fruit.put("pear", "梨");
		fruit.put("kiwi", "キウイ");
		fruit.put("strawberry", "いちご");
		fruit.put("grape", "ぶどう");
		fruit.put("muscat", "マスカット");
		fruit.put("cherry", "さくらんぼ");
	}
	
	public void search(String[] words) {
		for(String word : words) {
			if(fruit.containsKey(word)) {
				System.out.println(word + "の意味は" + fruit.get(word) + "です");
			}else {
				System.out.println(word + "は辞書に存在していません");
					
			}
				
		}
	}
}

