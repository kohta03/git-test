import java.util.Random;

public class Yatagarasu extends Monster implements Bird {

	Yatagarasu(String name, int hp) {
		super(name, hp);
	}

	@Override
	public void run() {
		System.out.println("八咫烏は逃げ出した！");
	}
	@Override
	public void fly() {
		System.out.println("八咫烏は飛び出した！");
	}

	@Override
	int attack(String name, int hp) {
		Random rnd = new Random();
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println(name + "の攻撃" + i + "のダメージ！");
		return hp;
	}

	@Override
	int dead(int hp) {
		if(hp <= 0) {
			System.out.println(super.getName() + "は倒れた...");
			return getExp();
		}
		return 0;
	}

}
