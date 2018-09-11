public abstract class Monster extends Life {
	private int exp;
	
	abstract int attack(int hp);

	public int getExp() {
		return exp;
	}
}