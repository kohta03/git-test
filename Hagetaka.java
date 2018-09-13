
import java.util.Random;

public class Hagetaka extends Monster implements Bird {


	/***
	 * コンストラクタ
	 * @param name
	 * @param hp
	 */
	Hagetaka(String name, int hp) {
		super(name, hp);
	}

	Hagetaka(String name) {
		super(name, 100);
	}

	Hagetaka() {
		super("ハゲタカ", 100);
	}



	@Override
	public void run() {
		System.out.println(this.getName() + "は逃げ出した！");
	}

	@Override
	public void fly() {
		System.out.println(this.getName() + "は飛んだ");
	}


	/*攻撃*/
	@Override
	int attack(String name,int hp) {
		Random rnd = new Random();
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println(name + "の攻撃" + i + "のダメージ！");
		return hp;
	}

	@Override
	int  dead(int hp) {
		if(hp <= 0) {
			System.out.println(this.getName() + "は倒れた...");
			return getExp();
		}
		return 0;
	}

}