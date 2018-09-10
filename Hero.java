import java.util.Random;

public class Hero extends Character implements Human {

	private Sword sword;

	Hero(int lv, String name) {
		super(lv, name);
	}

	@Override
	public void run() {
		System.out.println("勇者" + super.getName() +  "は逃げ出した");
	}

	@Override
	int attack(int hp) {
		Random rnd = new Random();
		int i = rnd.nextInt(10) + 1;
		hp -= i;
		System.out.println(super.getName() + "の攻撃" + i + "のダメージ！");
		return hp;
	}

	@Override
	void dead(int hp) {
		if(hp <= 0) {
			System.out.println(super.getName() + "は倒れた...");
		}
	}

	public void quipmentSword(Sword sword) {
		this.sword = sword;
		System.out.println(this.getName() + "は" + sword.getName() + "を装備した");
	}
}
