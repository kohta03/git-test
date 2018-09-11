public abstract class Character extends Life {

	private String name;
	private int lv;

	private int expPoint = 0;

	Character(String name, int lv){
		this.lv = lv;
		this.name = name;
	}

	abstract int attack(int hp);

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		if(lv >= 1) {
			this.lv = lv;
		}else {
			System.out.println("1以上を入力してください");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.length() <= 1 || name.length() >= 8){
			System.out.println("0文字以上, 8文字以下で入力してください");
		}else {
			this.name = name;
		}
	}

	public int getExpPoint() {
		return expPoint;
	}

	public void setExpPoint(int expPoint) {
		this.expPoint = expPoint;
	}

}
