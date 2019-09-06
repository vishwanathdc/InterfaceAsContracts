public class person {
	private int coins;
	public person(int coins) {
		this.coins = coins;
	}
	public void delivergummy(Coinable cn) {
		if(this.coins <= 0) {
			System.out.println("out of coins");
		}
		else {
			boolean isgummyavail = cn.checkgummys();
			if(isgummyavail) {
				this.coins--;
			}
		}
	}
	
	public static void main(String[] args) {
		person p1 = new person(3);
		machine m1 = new machine(2);
		
		p1.delivergummy(m1);
		p1.delivergummy(m1);
		p1.delivergummy(m1);
	
	}
}
