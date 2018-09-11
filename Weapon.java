public abstract class Weapon {

	private String name;
	private int power;

	Weapon(String name,int power) {
        this.name = name;
        this.power = power;
	}

	Weapon() {
		this.name = "木の棒";
		this.power = 10;
	}

	//Throwメソッド
	abstract int Throw(int hp);

	//attackメソッド
	abstract int attack(int hp);

	//ゲッター
	public String getName() {
	        return this.name;
	}

	public int getPower() {
        return this.power;
	}

}
