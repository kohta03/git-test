package monster;

import java.util.Random;

public class Hagetaka extends Monster implements Bird {

	@Override
	public void run() {
		System.out.println("ハゲタカは逃げ出した！");
	}

	@Override
	public void fly() {
		System.out.println("ハゲタカは飛んだ");
	}

	@Override
	int attack(int hp) {
		Random rnd = new Random();
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println("ハゲタカのの攻撃" + i + "のダメージ！");
		return hp;
	}

	@Override
	void dead(int hp) {
		if(hp <= 0) {
			System.out.println("ハゲタカは倒れた...");
		}
	}

}