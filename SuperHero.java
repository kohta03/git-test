public class SuperHero extends Hero {

	SuperHero(String name, int lv) {
		super(name, lv);
	}
 	int attack(int hp, boolean flg){
		hp = super.attack(hp, flg);
		hp = super.attack(hp, flg);
		return hp;
	}
}
