package rumfelt;

import java.io.Serializable;

public class Location implements Serializable{
	
	private String street;
	private int number;
	private String state;
	private int zip;
	private String city;
	
	public Location(String street, int number, String state, int zip, String city) {
		super();
		this.street = street;
		this.number = number;
		this.state = state;
		this.zip = zip;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Location [street=" + street + ", number=" + number + ", state=" + state + ", zip=" + zip + ", city="
				+ city + "]";
	}
	

}
