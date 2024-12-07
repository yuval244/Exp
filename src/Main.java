import java.util.Scanner;

public class Main {
	
	//blabla

	public static void main(String[] args) {
		// create users
		User u1 = new User("Tony Stark", "111111");
		User u2 = new User("peter parker", "222222");
		// create computers
		Tablet c1 = new Tablet("1", u1, 32, 3500, true, 1);
		Tablet c2 = new Tablet("2", u1, 16, 3222, true, 2);
		Leptop c3 = new Leptop("3", u1, 32, 4000, 18, "Dell");
		Leptop c4 = new Leptop("4", u1, 32, 4600, 13, "Lenovo");
		Tablet c5 = new Tablet("5", u2, 32, 3600, true, 1);
		Tablet c6 = new Tablet("6", u2, 16, 3400, true, 2);
		Leptop c7 = new Leptop("7", u2, 32, 4000, 18, "HP");
		Leptop c8 = new Leptop("8", u2, 32, 4000, 13, "Lenovo");
		
		// Added computers to customer in the classes
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Numbers:");
		int num = in.nextInt();
		u1.setCellularCode(num);
		u2.setCellularCode(num);
		// print users leptops:
		u1.printLeptops();
		u2.printLeptops();
		
		// All data
		System.out.println("All users data: ");
		System.out.println(u1.toString());
		System.out.println(u2.toString());
	}

}
