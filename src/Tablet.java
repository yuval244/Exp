
public class Tablet extends Computer implements MethodsComputer, MethodsUser {
	private boolean isGPS;
	private int code;

	public Tablet(String iD, User user, double memory, double price, boolean isGPS, int code) {
		super(iD, user, memory, price);
		this.isGPS = isGPS;
		this.code = code; //Cellular Code
	}

	public boolean isGPS() {
		return isGPS;
	}

	public void setGPS(boolean isGPS) {
		this.isGPS = isGPS;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Tablet [isGPS=" + isGPS + ", code=" + code + ", ID=" + ID + ", user=" + user.getID() + ", memory=" + memory
				+ ", price=" + price + "]";
	}

	@Override
	public double getNewPrice() {
		// returns 30% off the price
		return this.getPrice() * 0.7;

	}

	@Override
	public void setNewNumber(int newNumber) {
		this.setCode(newNumber);
	}

	@Override
	public void setNewOwner(User user) {
		this.setUser(user);
	}

}
