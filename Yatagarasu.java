import java.util.Random;

public class Yatagarasu extends Monster implements Bird {

	@Override
	public void run() {
		System.out.println("八咫烏は逃げ出した！");
	}
	@Override
	public void fry() {
		System.out.println("八咫烏は飛び出した！");
	}

	@Override
	int attack(int hp) {
		Random rnd = new Random();
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println("八咫烏の攻撃" + i + "のダメージ！");
		return hp;
	}

	@Override
	void dead(int hp) {
		if(hp <= 0) {
			System.out.println("八咫烏は倒れた...");
		}
	}

}
