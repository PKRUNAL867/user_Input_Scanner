public class Employee {
	private String name,email;
	
	public  Employee()
	{
		System.out.println("i am a constter");
		name="payal defalut";
		email="default email";
		
	}

	public Employee(String name, String email) {
		
		this.name = name;
		this.email = email;
		System.out.println("paramiter");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		
	}
	

}
