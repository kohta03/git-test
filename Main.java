public class Main {

	public static void main(String[] args) {

		 //インスタンス化
		Yatagarasu y1 = new Yatagarasu();
		Yatagarasu y2 = new Yatagarasu();
		Zombie zombie = new Zombie();
		Sword sword = new Sword("エクスカリバー", 30);

		//八咫烏同士の攻撃
		for(; y1.getHp() > 0;) {
			y1.setHp(y2.attack(y1.getHp()));
			y1.dead(y1.getHp());
		}

		//インスタンス化
		Hero hero = new Hero(30, "藤井");
		Wizard wizard = new Wizard(25, "伊藤");


		//素手殴り
		y2.setHp(hero.attack(y2.getHp()));
		y2.dead(y2.getHp());

		//剣装備
		hero.quipmentSword(sword);

		//剣殴り
		for(; zombie.getHp() > 0 ;) {
			//heroの攻撃
			y2.setHp(sword.attack(y2.getHp()));
			y2.dead(y2.getHp());

			//wizardの攻撃
			zombie.setHp(wizard.attack(zombie.getHp()));

			//レベルアップ処理
			//死亡時判定
			wizard.levelUp(zombie.dead(zombie.getHp()), wizard.getLv(), wizard.getHp());

		}

		//スーパーヒーローのインスタンス化
		SuperHero sh = new SuperHero(40, "藤原");

		for(; hero.getHp() > 0;) {
			//スーパーヒーロがヒーローを攻撃
			hero.setHp(sh.attack(hero.getHp()));
			System.out.println(hero.getHp());

			//ヒーローの死亡判定
			hero.dead(hero.getHp());

		}

	}
}
