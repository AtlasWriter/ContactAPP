package rumfelt;

public class BaseContact {
	
	private String name;
	private String description;
	private int phone;
	
	
	public BaseContact(String name, String description, int phone) {
		super();
		this.name = name;
		this.description = description;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "BaseContact [name=" + name + ", description=" + description + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
	
	

}
