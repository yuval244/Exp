import java.util.Arrays;

public class User {
	private String name;
	private String ID;
	private Computer[] myComputers;
	private int countComputers;
	
	// full constructor
	public User(String name, String iD, Computer[] myComputers) {
		super();
		this.name = name;
		ID = iD;
		this.myComputers = myComputers;
		this.countComputers = myComputers.length;
	}
	
	// new customer (no computers)
	public User(String name, String iD) {
		super();
		this.name = name;
		ID = iD;
		this.myComputers = new Computer[0];
		this.countComputers = 0;
	}
	
	public void addComputer(Computer c) {
		c.setUser(this);
		this.myComputers = Arrays.copyOf(this.myComputers, this.countComputers+1);
		this.myComputers[this.countComputers] = c;
		this.countComputers ++;
	}
	
	public void setCellularCode(int newCode) {
		for (Computer c : this.myComputers) {
			if( c instanceof Tablet){
				((Tablet) c).setCode(newCode);
			}
		}
	}
	
	public void printLeptops() {
		System.out.println("User [name=" + name + ", ID=" + ID + "] Leptops: ");
		for (Computer c : this.myComputers) {
			if( c instanceof Leptop){
				System.out.println(((Leptop) c).toString());
			}
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Computer[] getMyComputers() {
		return myComputers;
	}
	public void setMyComputers(Computer[] myComputers) {
		this.myComputers = myComputers;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", ID=" + ID + ", myComputers=" + Arrays.toString(myComputers) + "]";
	}
	
	
}
