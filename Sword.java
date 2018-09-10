import java.util.Random;

public class Sword extends Weapon {
	int attack( int hp ){
		Random rnd = new Random();
		int i = rnd.nextInt(100) + 1;
		hp -= i;
		System.out.println("飛天御剣流奥義'龍槌閃'!!!" + i + "のダメージを与えたぞ！");
		return hp;
	}
}
