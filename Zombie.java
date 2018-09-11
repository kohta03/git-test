import java.util.Random;

public class Zombie extends Monster implements Human {


	//逃げ出す
	@Override
	public void run() {
		System.out.println("ゾンビは逃げ出した");
	}

	//かみつく
	@Override
	public int attack(int hp) {
		Random rnd = new Random();
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println("ゾンビがかみついた！！" + i + "のダメージ！");
		return hp;
	}

	//死ぬ
	@Override
	public int dead(int hp) {
		if(hp <= -100) {
			System.out.println("ゾンビは倒れた...");

			return this.getExp();
		}
		return 0;
	}

	//しゃべる
	@Override
	public void talk() {
		System.out.println("ｱｧｱｱｱ～～");

	}

}
