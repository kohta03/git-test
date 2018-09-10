import java.util.Random;

public class Wand extends Weapon {
	public void attack(){
		int hp;
		Random rnd = new Random();
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println("まるふぉい！");
	}
}