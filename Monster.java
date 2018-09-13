abstract class Monster extends Life {

	String name;
	private int hp;
	private int exp = 100;

	Monster(String name, int hp){
		this.name = name;
		this.hp = hp;
	};

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getExp() {
		return exp;
	}

	abstract int attack(String name, int hp);

}
