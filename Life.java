public abstract class Life {

	private int hp = 100;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	abstract void dead(int hp);
	
}

