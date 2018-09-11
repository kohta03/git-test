public class SuperHero extends Hero {

	SuperHero(int lv, String name) {
		super(lv, name);
	}
 	int attack(int hp){
		hp = super.attack(hp);
		hp = super.attack(hp);
		return hp;
	}
}
