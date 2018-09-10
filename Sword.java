import java.util.Random;

public class Sword extends Weapon {
	public Sword(String name, int power) {
		// 親クラスの変数等を使う
		super(name, power);
	}

	@Override
	int attack( int hp ){

		hp -= this.getPower();
		System.out.println("飛天御剣流奥義'龍槌閃'!!!" + this.getPower() + "のダメージを与えたぞ！");
		return hp;
	}

	@Override
	int Throw(int hp) {
		Random rnd = new Random();
		int i = rnd.nextInt(2) + 1;

		if( i%2 == 2) {
			System.out.println("あ、こいつ剣を投げたぞ！" + this.getPower() + "のダメージを与えたぞ");
			hp -= this.getPower();
		} else {
			System.out.println("武器投げたけど当たらなかった。");
		}
		return hp;
	}
}
