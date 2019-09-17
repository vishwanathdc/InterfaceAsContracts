public class person {
	private int coins;
	public person(int coins) {
		this.coins = coins;
	}
	public void delivergummy(vendingMachineInterface vmi) {
		if(this.coins <= 0) {
			System.out.println("out of coins");
		}
		else {
			boolean isgummyavail = vmi.checkgummys();
			if(isgummyavail) {
				this.coins--;
			}
		}
	}
	
	public static void main(String[] args) {
		person p1 = new person(3);
		vendingMachine m1 = new vendingMachine(2);
		
		p1.delivergummy(m1);
		p1.delivergummy(m1);
		p1.delivergummy(m1);
	
	}
}
