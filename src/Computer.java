
public class Computer {
	protected String ID;
	protected User user;
	protected double memory;
	protected double price;
	
	public Computer(String iD, User user, double memory, double price) {
		super();
		ID = iD;
		this.user = user;
		this.memory = memory;
		this.price = price;
		user.addComputer(this);
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public double getMemory() {
		return memory;
	}
	public void setMemory(double memory) {
		this.memory = memory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Computer [ID=" + ID + ", user=" + user + ", memory=" + memory + ", price=" + price + "]";
	}
	
	
}
