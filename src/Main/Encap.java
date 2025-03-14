package Main;

public class Encap{
	private String fname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	public static void main(String[] args) {
		Encap newObject = new Encap();
		newObject.setFname("Vishnu");
		System.out.println (newObject.getFname());
	
}



}

