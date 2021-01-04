
public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
		System.out.println("");
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getFirstName() {

		if (this.firstName.isEmpty()) {
			return "";
		}

		return this.firstName;
	}

	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

	public String getLastName() {
		if (this.lastName.isEmpty()) {
			return "";
		}
		return this.lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		if(age < 0 || age > 100) {
			return 0;
		}
		return this.age;
	}

	public boolean isTeen() {

		if (this.age >= 13 && this.age <= 19) {
			return true;
		} else {
			return false;
		}
	}

	public String getFullName() {

		if (this.firstName == "" && this.lastName == "") {
			return "";
		}
		
		if(this.firstName.isEmpty()) {
			return this.lastName;
		}
		if(this.lastName.isEmpty()) {
			return this.firstName;
		}
		
		return this.firstName + " " + this.lastName;
	}

}
