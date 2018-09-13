import java.util.Random;

public class Zombie extends Monster implements Human {

	Zombie(String name, int hp) {
		super(name, hp);
	}

	@Override
	public void run() {
		System.out.println("ゾンビは逃げ出した");
	}

	@Override
	public int attack(String name, int hp) {
		Random rnd = new Random();
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println(name + "かみついた！！" + i + "のダメージ！");
		return hp;
	}

	@Override
	public int dead(int hp) {
		if(hp <= -100) {
			System.out.println("ゾンビは倒れた...");
			return this.getExp();
		}
		return 0;
	}

	@Override
	public void talk() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("話す");
	}

}
