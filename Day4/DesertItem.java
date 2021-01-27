package OOPAssignment;

public abstract class DesertItem {
	private String name;
	
	public DesertItem() {
		
	}
	
	public DesertItem(String name){
		this.name = name;
	}

	public abstract double returnCost();

	public final String getName() {
		return name;
	}

}
