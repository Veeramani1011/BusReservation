package busresv;

public class Bus {
	
	private int busNo;
	private boolean AC;
	private int capacity;    // To ready with get and set methods
	
	Bus(int no,boolean AC, int Cap){
		this.busNo= no;
		this.AC = AC;
		this.capacity = Cap;
}
	public int getbusNo() {         // Its a Accessor Method
		return busNo;
	}
	
	public boolean isAC() {    
		return AC;
		
	}

	public int getCapacity() {         // Its a Accessor Method
		return capacity;
	}
	
	public void setC(boolean val) {    // Mutator
		AC = val;
	}
	
	public void setCapacity(int cap) {       // Mutator 
		capacity = cap;
		
	}
	
	public void displayBusInfo() {
		System.out.println("Bus NO:" + busNo + " AC:" + AC + " Capacity is:" + capacity);
	}
}


