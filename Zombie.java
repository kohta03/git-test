import java.util.Random;

public class Zombie extends Monster implements Human {

	Zombie(String name, int hp) {
		super(name, hp);
	}


	//Zombieのコンストラクタ
	Zombie(String name, int hp) {
		super(name, hp);
	}

	Zombie(String name) {
		super(name, 100);
	}

	Zombie() {
		super("zombie", 100);
	}


	//ゾンビ逃げ出す

	@Override
	public void run() {
		System.out.println("ゾンビは逃げ出した");
	}

	/*攻撃*/
	@Override
	int attack(String name,int hp) {
		//ランダムでダメージを算出
		Random rnd = new Random();
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println(name + "の攻撃!" + i + "のダメージ！");
		return hp;
	}

	//ゾンビ死ぬ
	@Override
	public int dead(int hp) {

		//Hpが-100以下になったら死ぬ
		if(hp <= -100) {
			System.out.println("ゾンビは倒れた...");
			return this.getExp();
		}
		return 0;
	}

	//ゾンビ呻く
	@Override
	public void talk() {
		System.out.println("ｱｧｱｧｧｧｧ～～");

	}

}
