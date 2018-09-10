public class Main {

	public static void main(String[] args) {

		 //インスタンス化
		Yatagarasu y1 = new Yatagarasu();
		Yatagarasu y2 = new Yatagarasu();
		Zombie zombie = new Zombie();
		Sword sword = new Sword("エクスカリバー", 30);

		//八咫烏同士の攻撃
		for(; y1.getHp() > 0;) {
			int damage = y2.attack(y1.getHp());
			y1.setHp(damage);
			y1.dead(y1.getHp());
		}

		//インスタンス化
		Hero hero = new Hero(30, "藤井");
		Wizard wizard = new Wizard(25, "伊藤");

		//素手殴り
		int damage = hero.attack(y2.getHp());
		y2.setHp(damage);
		y2.dead(y2.getHp());

		//剣装備
		hero.quipmentSword(sword);

		//剣殴り
		for(; y2.getHp() > 0 && wizard.getHp() > 0;) {
			//heroの攻撃
			damage = sword.attack(y2.getHp());
			y2.setHp(damage);
			y2.dead(y2.getHp());

			//wizardの被弾
			damage = zombie.attack(wizard.getHp());
			wizard.setHp(damage);
			wizard.dead(wizard.getHp());
		}
	}
}
