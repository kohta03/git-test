import java.util.Random;

public class Sword extends Weapon {

        public Sword(String name, int power) {
                // 親クラスの変数等を使う
                super(name, power);
        }

        public Sword() {
        	super("木の棒", 10);
        }

        @Override
        int attack( int hp ){
                hp -= this.getPower();
                System.out.println(this.getName() + "飛天御剣流奥義'龍槌閃'!!!" + this.getPower() + "のダメージを与えたぞ！");
                return hp;
        }

        @Override
        int Throw(int hp, Character hero) {

        	if(hero.isFlg() == false) {
        		System.out.println("投げる武器が見つからなかった...");
        		return hp;
        	}else {
        		Random rnd = new Random();
                int i = rnd.nextInt(2) + 1;

                if( i%2 == 2) {
                	System.out.println("あ、こいつ" + this.getName() + "を投げたぞ！" + this.getPower() + "のダメージを与えたぞ");
                    hp -= this.getPower();
                } else {
                    System.out.println("武器投げたけど当たらなかった。");
                }
                return hp;
        	}
        }
}
