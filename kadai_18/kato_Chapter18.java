package kadai_18;

abstract public class kato_Chapter18 {
	
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	public kato_Chapter18(String givenName) {
		this.givenName = givenName;
	}
	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	 void eachIntroduce() {
	}
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
