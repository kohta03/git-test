public abstract class Character extends Life {

	private String name;
	private int lv;
	private int hp;
	private int maxHp;
	private boolean flg = false;
	private int expPoint = 0;

	Character(String name, int lv){
		this.name = name;
		this.lv = lv;
		this.hp = lv * 3;
		this.maxHp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.length() <= 1 || name.length() >= 8){
			throw new IllegalArgumentException("0文字以上, 8文字以下で入力してください");
		}else {
			this.name = name;
		}
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		if(lv >= 1) {
			this.lv = lv;
		}else {
			throw new IllegalArgumentException("１レベル以上で入力してください");
		}
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getExpPoint() {
		return expPoint;
	}

	public void setExpPoint(int expPoint) {
		this.expPoint = expPoint;
	}

	public boolean isFlg() {
		return flg;
	}

	public void setFlg(boolean flg) {
		this.flg = flg;
	}

	abstract int attack(int hp, boolean flg);

	abstract public int levelUp(int exp, int lv, int hp);

}
