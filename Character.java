public abstract class Character extends Life {

	private int lv;
	private String name;

	Character(int lv, String name){
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

}}
