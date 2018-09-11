import java.util.Random;

public class Hero extends Character implements Human {

	private Sword sword;

	Hero(int lv, String name) {
		super(name, lv);
	}

	Hero() {
		super("ななしさん", 1);
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
	int dead(int hp) {
		if(hp <= 0) {
			System.out.println(super.getName() + "は倒れた...");
		}
		return 0;
	}

	public void quipmentSword(Sword sword) {
		this.sword = sword;
		System.out.println(this.getName() + "は" + sword.getName() + "を装備した");
	}

	@Override
	public void talk() {
		System.out.println("今日もいい天気ですね");
	}

	//レベルアップ
	public int levelUp(int exp, int lv, int hp) {
		if(this.getExpPoint() + exp >= 100) {
			lv += 1;
			this.setHp(100);
			return lv;
		}
		return lv;
	}

}
