import java.util.Random;

public class Wand extends Weapon {
	public Wand(String name, int power) {
		super(name, power);
	}
	
	int attack(int hp){
		hp -= this.getPower();
		System.out.println("杖で攻撃！" + this.getPower() + "のダメージを与えたぞ！");
		return hp;
	}
	
	int Throw(int hp) {
		Random rnd = new Random();
		int i = rnd.nextInt(2) + 1;
		
		if(i % 2 == 2){
			 System.out.println("あ、こいつ杖を投げたぞ！" + this.getPower() + "のダメージを与えたぞ！");
			 hp -= this.getPower();
		} else {
			System.out.println("杖が当たらなかった。");
		}
		return hp;
	}
}
