
class machine implements Coinable{
	private int gummyballs;
	
	public machine(int gummyballs) {
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
