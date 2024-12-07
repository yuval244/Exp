
public class Leptop extends Computer implements MethodsComputer, MethodsUser {

	private int screenSize;
	private String Company;

	public Leptop(String iD, User user, double memory, double price, int screenSize, String company) {
		super(iD, user, memory, price);
		this.screenSize = screenSize;
		Company = company;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	@Override
	public String toString() {
		return "Leptop [screenSize=" + screenSize + ", Company=" + Company + ", ID=" + ID + ", user=" + user.getID()
				+ ", memory=" + memory + ", price=" + price + "]";
	}

	@Override
	public double getNewPrice() {
		// returns 20% off the price
		return this.getPrice() * 0.8;
	}

	@Override
	public void setNewNumber(int newNumber) {
		this.setScreenSize(newNumber);
	}

	@Override
	public void setNewOwner(User user) {
		this.setUser(user);		
	}

}
