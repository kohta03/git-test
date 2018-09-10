import java.util.Random;

	public class Hero extends Character implements Human {

		 String name;
		 int lv;

		Hero(){
            this.name = super.getName();
            this.lv = super.getLv();
		}
		@Override
		public void run() {
			System.out.println("勇者" + super.getName() +"は逃げ出した！");
		}

		@Override
		int attack(int hp) {
			Random rnd = new Random();
			int i = rnd.nextInt(100) + 1;
			hp -= i;
			System.out.println("勇者" + super.getName() + "の攻撃" + i + "のダメージ！");
			return hp;
		}

		@Override
		void dead(int hp) {
			if(hp <= 0) {
				System.out.println("勇者" + super.getName() + "は倒れた...");
			}
		}

	}
