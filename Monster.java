abstract class Monster extends Life {

	String name;
	private int hp;
	private int exp = 100;

	Monster(String name, int hp){

		if(name.length() > 0) {
			this.name = name;
		}else if(name.length() <= 0) {
			System.out.println("初期設定エラー : NAMEが入力されていません。名前を テストモンスター にします。");
			this.name = "テストモンスター";
		}

		//HPの判定
		if(hp > 0) {
			this.hp = hp;
		}else if( hp < 0 ) {
			System.out.println("初期設定エラー : HPにマイナス値が設定されました。100を代入します。");
			this.hp = 100;
		}

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
