package fi.haagahelia.zeus.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Basketball1 {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id1;
    private String date1;
    private String time1;
    private String game1;
    private String place1;
    private String price1;
    
    @ManyToOne
    @JoinColumn(name = "Categoryid1")
    private Category1 category1;
    


    public Basketball1() {}

	public Basketball1(String date1, String time1 , String game1 , String place1 , String price1 , Category1 category1) {
		super();
		this.date1 = date1;
		this.time1 = time1;
		this.game1 = game1;
		this.place1 = place1;
		this.price1 = price1;
		this.category1 = category1;
		
	}

	public Long getId1() {
		return id1;
	}

	public void setId1(Long id1) {
		this.id1 = id1;
	}

	public String getDate1() {
		return date1;
	}

	public void setDate1(String date1) {
		this.date1 = date1;
	}

	public String getTime1() {
		return time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public String getGame1() {
		return game1;
	}

	public void setGame1(String game1) {
		this.game1 = game1;
	}

	public String getPlace1() {
		return place1;
	}

	public void setPlace1(String place1) {
		this.place1 = place1;
	}

	public String getPrice1() {
		return price1;
	}

	public void setPrice1(String price1) {
		this.price1 = price1;
	}
	public Category1 getCategory1() {
		return category1;
	}

	public void setCategory1(Category1 category1) {
		this.category1 = category1;
	}

	@Override
	public String toString() {
		if (this.category1 != null)
			return "Basketball1 [id=" + id1 + ", date=" + date1 + ", time=" + time1 + ", game=" + game1 + ", place=" + place1 + ", price=" + price1 + " category =" + this.getCategory1() + "]";
		else
			return "Basketball1 [id=" + id1 + ", date=" + date1 + ", time=" + time1 + ", game=" + game1 + ", place=" + place1 + ", price=" + price1 + "]";
			
	}
}
