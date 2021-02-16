package rumfelt;

public class Person extends BaseContact {
	
	private String hobby;
	private int age;
	private String maritalStatus;
	private int numberInHousehold;
	

	public Person(String name, String description, int phone, String hobby, int age, String maritalStatus,
			int numberInHousehold) {
		super(name, description, phone);
		this.hobby = hobby;
		this.age = age;
		this.maritalStatus = maritalStatus;
		this.numberInHousehold = numberInHousehold;
	}



	public String getHobby() {
		return hobby;
	}



	public void setHobby(String hobby) {
		this.hobby = hobby;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getMaritalStatus() {
		return maritalStatus;
	}



	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}



	public int getNumberInHousehold() {
		return numberInHousehold;
	}



	public void setNumberInHousehold(int numberInHousehold) {
		this.numberInHousehold = numberInHousehold;
	}



	@Override
	public String toString() {
		return "Person [getHobby()=" + getHobby() + ", getAge()=" + getAge() + ", getMaritalStatus()="
				+ getMaritalStatus() + ", getNumberInHousehold()=" + getNumberInHousehold() + ", getName()=" + getName()
				+ ", getDescription()=" + getDescription() + ", getPhone()=" + getPhone() + "]";
	}

	


	

}

