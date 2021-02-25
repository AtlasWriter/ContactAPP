package rumfelt;

import java.io.Serializable;

public class BusinessContact extends BaseContact implements Serializable {
	
	private int hours;
	private String url;
	private int years;
	private Location location;
	


	public BusinessContact(String name, String description, int phone, int hours, String url, int years, Location l) {
		super(name, description, phone);
		this.hours = hours;
		this.url = url;
		this.years = years;
		this.location = l;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public int getYears() {
		return years;
	}


	public void setYears(int years) {
		this.years = years;
	}


	@Override
	public String toString() {
		return "BusinessContact [getHours()=" + getHours() + ", getUrl()=" + getUrl() + ", getYears()=" + getYears()
				+ ", getName()=" + getName() + ", getDescription()=" + getDescription() + ", getPhone()=" + getPhone()
				+ "]";
	}


	
	

}
