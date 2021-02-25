package rumfelt;

import java.io.Serializable;

public class Person extends BaseContact implements Serializable {
	
	private String hobby;
	private int age;
	private String maritalStatus;
	private int numberInHousehold;
	private Photo photo;

	public Person(String name, String description, int phone, String hobby, int age, String maritalStatus,
			int numberInHousehold, Photo p) {
		super(name, description, phone);
		
		this.hobby = hobby;
		this.age = age;
		this.maritalStatus = maritalStatus;
		this.numberInHousehold = numberInHousehold;
		this.photo = p;
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




	public Photo getPhoto() {
		return photo;
	}




	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	


	

}

