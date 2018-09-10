
public abstract class Weapon {

	private String name;
	private int power;


	//コンストラクタ
	public Weapon(String name,int power) {

		this.name = name;
		this.power = power;

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
