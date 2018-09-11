
public class SuperHero extends Hero {

	SuperHero(int lv, String name) {
		super(lv, name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	int attack(int hp){
		super.attack(hp);
		super.attack(hp);
		return hp;
	}
}