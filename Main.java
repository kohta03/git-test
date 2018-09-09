public class Main {

	public static void main(String[] args) {

		 //インスタンス化
		Yatagarasu y1 = new Yatagarasu();
		Yatagarasu y2 = new Yatagarasu();
		Zombie zombie = new Zombie();

		//攻撃
		for(; y2.getHp() > 0;) {
			int damage = zombie.attack(y2.getHp());
			y2.setHp(damage);
			y2.dead(y2.getHp());
		}
	}
}
