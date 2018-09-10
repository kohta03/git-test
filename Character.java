abstract class Character extends Life {

	private int lv;
	private String name;
	private Weapon weapon;

	Character(int lv, String name){
		this.lv = lv;
		this.name = name;
	}

	abstract int attack(int hp);

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
