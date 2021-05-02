package Latihan7;
public abstract class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	
	// Sets up a staff member
	public StaffMember (String eName, String eAddress, String ePhone) {
		name = eName;
		address = eAddress;
		phone = ePhone;
	}
	//return a string
	public String toString() {
		String result = "Name : " + name + "\n";
		result += "Address: " + address + "\n";
		result += "Phone: " + phone;
		return result;
	}
	
	public abstract double pay();
}
