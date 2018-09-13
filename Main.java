import java.util.Random;
import java.util.Scanner;

public class Hero extends Character implements Human {

	private Sword sword;

	Hero(String name, int lv) {
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
	int attack(int hp, boolean flg) {
		if(flg) {
			hp = sword.attack(hp);
		}else {
			Random rnd = new Random();
			int i = rnd.nextInt(10) + 1;
			hp -= i;
			System.out.println(super.getName() + "の攻撃" + i + "のダメージ！");
		}
		return hp;
	}

	@Override
	int dead(int hp) {
		if(hp <= 0) {
			System.out.println(super.getName() + "は倒れた...");
		}
		return 0;
	}

	//剣装備
	public boolean quipmentSword() {

		//装備品の名前、強さを入力
		System.out.println("装備する剣と強さを入力してください");
		Scanner scanner = new Scanner(System.in);
		String s_name = scanner.next();
		int s_power = Integer.parseInt(scanner.next());

		Sword sword = new Sword(s_name, s_power);
		this.sword = sword;
		System.out.println(this.getName() + "は" + sword.getName() + "を装備した");
		return true;
	}

	@Override
	public void talk() {
		System.out.println("今日もいい天気ですね");
	}

	//レベルアップ
	public int levelUp(int exp, int lv, int hp) {
		if(this.getExpPoint() + exp >= 100) {
			lv += 1;
			this.setHp(this.getMaxHp());
			return lv;
		}
		return lv;
	}

}
