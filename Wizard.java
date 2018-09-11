import java.util.Random;

public class Wizard extends Character implements Human {

	private Wand wand;

	Wizard(int lv, String name) {
		super(name, lv);
	}

	Wizard() {
		super("ななしさん", 1);
	}

	@Override
	public void run() {
		System.out.println("魔法使い" + super.getName() +  "は逃げ出した");
	}

	@Override
	int attack(int hp) {
		Random rnd = new Random();
		int i = rnd.nextInt(5) + 1;
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

	public void quipmentWand(Wand wand) {
		this.wand = wand;
		System.out.println(this.getName() + "は" + wand.getName() + "を装備した");
	}

	@Override
	public void talk() {
		System.out.println("元気ですか");
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
