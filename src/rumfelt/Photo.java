package rumfelt;

public class Photo extends AddressBook{
	
	private String photoName;
	private int date;
	
	public Photo(String photoName, int date) {
		super();
		this.photoName = photoName;
		this.date = date;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Photo [photoName=" + photoName + ", date=" + date + "]";
	}
	
	

}
