package icsd;

import java.sql.Date;

public class movieid {

	
	
	int movieid;
	String moviename;
	String rating;
	Date startdate;
	Date enddate;
	String slot912;
	String slot1215;
	String slot1518;
	int gold;
	int silver;
	String image;
	String language;
	
	
	public int getMovieid() {
		return movieid;
	}


	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}


	public String getMoviename() {
		return moviename;
	}


	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public Date getStartdate() {
		return startdate;
	}


	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}


	public Date getEnddate() {
		return enddate;
	}


	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	public String getSlot912() {
		return slot912;
	}


	public void setSlot912(String slot912) {
		this.slot912 = slot912;
	}


	public String getSlot1215() {
		return slot1215;
	}


	public void setSlot1215(String slot1215) {
		this.slot1215 = slot1215;
	}


	public String getSlot1518() {
		return slot1518;
	}


	public void setSlot1518(String slot1518) {
		this.slot1518 = slot1518;
	}


	public int getGold() {
		return gold;
	}


	public void setGold(int gold) {
		this.gold = gold;
	}


	public int getSilver() {
		return silver;
	}


	public void setSilver(int silver) {
		this.silver = silver;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public movieid() {
		super();
		// TODO Auto-generated constructor stub
	}


	public movieid(int movieid, String moviename, String rating, Date startdate, Date enddate, String slot912,
			String slot1215, String slot1518, int gold, int silver, String image, String language) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.rating = rating;
		this.startdate = startdate;
		this.enddate = enddate;
		this.slot912 = slot912;
		this.slot1215 = slot1215;
		this.slot1518 = slot1518;
		this.gold = gold;
		this.silver = silver;
		this.image = image;
		this.language = language;
	}
	
	
	
	
	
	
	
}
