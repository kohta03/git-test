public class Main {

	public static void main(String[] args) {

		 //インスタンス化
		Yatagarasu y1 = new Yatagarasu("八咫烏A", 100);
		Yatagarasu y2 = new Yatagarasu("八咫烏B", 100);
		Zombie zombie = new Zombie("ゾンビ", 100);
		Battle battle = new Battle();

		//八咫烏同士の攻撃
		battle.mvmBattle(y1, y2);

		//インスタンス化
		Hero hero = new Hero("藤井", 30);
		Wizard wizard = new Wizard("伊藤", 25);

		//素手殴り
		y2.setHp(hero.attack(y2.getHp(), hero.isFlg()));
		y2.dead(y2.getHp());


		//剣装備
		hero.setFlg(hero.quipmentSword());

		//ヒーローと八咫烏の戦い
		battle.pvmBatlle(hero, y2);

		//杖装備
		wizard.setFlg(wizard.quipmentWand());

		//wizardとゾンビの戦い
		battle.pvmBatlle(wizard, zombie);

		//スーパーヒーローのインスタンス化
		SuperHero sh = new SuperHero("藤原", 40);

		//スーパーヒーローとヒーローの戦い
		battle.pvpBattle(hero, sh);

	}
}
