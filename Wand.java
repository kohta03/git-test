import java.util.Random;

public class Wand extends Weapon {

        public Wand(String name, int power) {
        	super(name, power);
        }

        public Wand() {
        	super("木の棒", 10);
        }

        int attack(int hp){
                hp -= this.getPower();
                System.out.println(this.getName() + "で攻撃！" + this.getPower() + "のダメージを与えたぞ！");
                return hp;
        }

        int Throw(int hp, Character wizard) {

        	if(wizard.isFlg() == false) {
        		System.out.println("投げる武器が見つからなかった...");
        		return hp;
        	}

            Random rnd = new Random();
            int i = rnd.nextInt(2) + 1;
            wizard.setFlg(false);

            if(i % 2 == 0){
            	System.out.println("あ、こいつ" + this.getName() + "を投げたぞ！" + this.getPower() + "のダメージを与えたぞ！");
                hp -= this.getPower();
            } else {
                System.out.println(this.getName() + "が当たらなかった。");
            }
            return hp;
        }

}
