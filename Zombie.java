import java.util.Random;

public class Zombie extends Monster implements Human {

	@Override
	public void run() {
		System.out.println("ゾンビは逃げ出した");
	}

	@Override
	public int attack(int hp) {
		Random rnd = new Random();
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println("ゾンビがかみついた！！" + i + "のダメージ！");
		return hp;
	}

	@Override
	public void dead(int hp) {
		if(hp <= 0) {
			System.out.println("ゾンビは倒れた...");
		}
	}

}
