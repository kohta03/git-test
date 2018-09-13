import java.util.Random;
import java.util.Scanner;

public class Wizard extends Character implements Human {

	public Wand wand;

	Wizard(String name, int lv) {
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
	int attack(int hp, boolean flg) {
		if(flg) {
			hp = wand.attack(hp);
		}else {
			Random rnd = new Random();
			int i = rnd.nextInt(5) + 1;
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

	//杖装備
	public boolean quipmentWand() {
		//装備品の名前、強さを入力
		System.out.println("装備する杖と強さを入力してください");
		Scanner scanner = new Scanner(System.in);
		String w_name = scanner.next();
		int w_power = Integer.parseInt(scanner.next());
		if(w_power <= 0) {
			System.out.println("攻撃力が低すぎて装備できません");
			return false;
		}else {
			Wand wand = new Wand(w_name, w_power);

			this.wand = wand;
			System.out.println(this.getName() + "は" + wand.getName() + "を装備した");
			return true;
		}
	}

	@Override
	public void talk() {
		System.out.println("元気ですか");
	}

	//レベルアップ
		public int levelUp(int exp, int lv, int hp) {

			if(this.getExpPoint() + exp >= 100) {
				lv += 1;
				this.setLv(lv);
				this.setHp(this.getMaxHp());
				System.out.println(this.getName() + "のレベルが上がりました！");
				System.out.println(this.getName() + "の体力が全回復しました！");
			}
			return lv;
		}
}
