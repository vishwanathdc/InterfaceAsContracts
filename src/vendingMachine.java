
class vendingMachine implements vendingMachineInterface{
	private int gummyballs;
	
	public vendingMachine(int gummyballs) {
		this.gummyballs = gummyballs;
	}
	public boolean checkgummys() {
		if(this.gummyballs <= 0) {
			System.out.println("out of gummyballs");
			return false;
		}		
		else{
			System.out.println("1 gummyball delivered");
			this.gummyballs--;
			return true;
		}
	}
}
