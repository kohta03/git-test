
import java.util.Random;

public class Battle {

	public void pvpBattle(Character c1, Character c2) {

		System.out.println(c1.getName() + " VS " + c2.getName());

		Character attack, defense;
		Random rnd = new Random();
		int i = rnd.nextInt(2) + 1;

		//先行を決定
		if(i == 1) {
			attack = c1;
			defense = c2;
		}else {
			attack = c2;
			defense = c1;
		}



		//どちらかが倒れるまで
		while(true) {

			//先攻の攻撃
			defense.setHp(attack.attack(defense.getHp(), attack.isFlg()));

			//死亡判定
			defense.dead(defense.getHp());

			if(defense.getHp() <= 0) {
				break;
			}

			//後攻の攻撃
			attack.setHp(defense.attack(attack.getHp(), defense.isFlg()));

			//死亡判定
			attack.dead(attack.getHp());

			if(attack.getHp() <= 0) {
				break;
			}

		}
	}

	public void pvmBatlle(Character attack, Monster defense) {

		System.out.println(attack.getName() + " VS " + defense.getName());

		//どちらかが倒れるまで
		while(true) {

			//先攻の攻撃
			defense.setHp(attack.attack(defense.getHp(), attack.isFlg()));

			//死亡判定
			attack.levelUp(defense.dead(defense.getHp()), attack.getLv(), attack.getHp());

			if(defense.getHp() <= 0) {
				break;
			}

			//後攻の攻撃
			attack.setHp(defense.attack(defense.getName(), attack.getHp()));

			//死亡判定
			attack.dead(attack.getHp());

			if(attack.getHp() <= 0) {
				if(attack.getName() == "zombie") {
					if(attack.getHp() <= -100) {
						break;
					}
				}else {
					break;
				}
			}

		}
	}

	public void mvmBattle(Monster m1, Monster m2) {

		System.out.println(m1.getName() + " VS " + m2.getName());

		Monster attack, defense;
		Random rnd = new Random();
		int i = rnd.nextInt(2) + 1;

		//先行を決定
		if(i == 1) {
			attack = m1;
			defense = m2;
		}else {
			attack = m2;
			defense = m1;
		}

		//どちらかが倒れるまで
		while(true) {

			//先攻の攻撃
			defense.setHp(attack.attack(attack.getName(), defense.getHp()));

			//死亡判定
			defense.dead(defense.getHp());

			if(defense.getHp() <= 0) {
				if(defense.getName() == "zombie") {
					if(defense.getHp() <= -100) {
						break;
					}
				}else {
					break;
				}
			}

			//後攻の攻撃
			attack.setHp(defense.attack(defense.getName(), attack.getHp()));

			//死亡判定
			attack.dead(attack.getHp());

			if(attack.getHp() <= 0) {
				if(attack.getName() == "zombie") {
					if(attack.getHp() <= -100) {
						break;
					}
				}else {
					break;
				}
			}

		}
	}


}
