import java.time.Year;

public class Book {

	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getprice() {
		return price;
	}
	
	public void setPublishyear(int publishyear) {
		this.publishyear = publishyear;
	}
	
	public int getPublishyear() {
		return publishyear;
	}
	
	public int getTotalyear() {
		int Totalyear=(Year.now().getValue())-(publishyear);
		return Totalyear;
	}
	
	public String toString() {
		return ("Title:"+title+" published for "+getTotalyear()+" year ("+price+"baht).");
	}
}
