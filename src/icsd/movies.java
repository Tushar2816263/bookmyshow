package icsd;

import java.sql.Date;

public class movies {

	
	int strmovieid;
	String strmoviename;
	int goldprice;
	int silverprice;
	Date strdate;
	String img;
	Date endate;

	String slot1;
	String slot2;
	String slot3;
	public int getStrmovieid() {
		return strmovieid;
	}
	public void setStrmovieid(int strmovieid) {
		this.strmovieid = strmovieid;
	}
	public String getStrmoviename() {
		return strmoviename;
	}
	public void setStrmoviename(String strmoviename) {
		this.strmoviename = strmoviename;
	}
	public int getGoldprice() {
		return goldprice;
	}
	public void setGoldprice(int goldprice) {
		this.goldprice = goldprice;
	}
	public int getSilverprice() {
		return silverprice;
	}
	public void setSilverprice(int silverprice) {
		this.silverprice = silverprice;
	}
	public Date getStrdate() {
		return strdate;
	}
	public void setStrdate(Date strdate) {
		this.strdate = strdate;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getEndate() {
		return endate;
	}
	public void setEndate(Date endate) {
		this.endate = endate;
	}
	public String getSlot1() {
		return slot1;
	}
	public void setSlot1(String slot1) {
		this.slot1 = slot1;
	}
	public String getSlot2() {
		return slot2;
	}
	public void setSlot2(String slot2) {
		this.slot2 = slot2;
	}
	public String getSlot3() {
		return slot3;
	}
	public void setSlot3(String slot3) {
		this.slot3 = slot3;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	String rating;
	String language;
	
	public movies(int strmovieid, String strmoviename, int goldprice, int silverprice, Date strdate, String img,
			Date endate, String slot1, String slot2, String slot3, String rating, String language) {
		super();
		this.strmovieid = strmovieid;
		this.strmoviename = strmoviename;
		this.goldprice = goldprice;
		this.silverprice = silverprice;
		this.strdate = strdate;
		this.img = img;
		this.endate = endate;
		this.slot1 = slot1;
		this.slot2 = slot2;
		this.slot3 = slot3;
		this.rating = rating;
		this.language = language;
	}
	public movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
