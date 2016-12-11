package fi.haagahelia.zeus.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Basketball2 {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id2;
    private String date2;
    private String time2;
    private String game2;
    private String place2;
    private String price2;
    
    @ManyToOne
    @JoinColumn(name = "Categoryid2")
    private Category2 category2;
    


    public Basketball2() {}

	public Basketball2(String date2, String time2 , String game2 , String place2 , String price2 , Category2 category2) {
		super();
		this.date2 = date2;
		this.time2 = time2;
		this.game2 = game2;
		this.place2 = place2;
		this.price2 = price2;
		this.category2 = category2;
		
	}

	public Long getId2() {
		return id2;
	}

	public void setId2(Long id2) {
		this.id2 = id2;
	}

	public String getDate2() {
		return date2;
	}

	public void setDate2(String date2) {
		this.date2 = date2;
	}

	public String getTime2() {
		return time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	public String getGame2() {
		return game2;
	}

	public void setGame2(String game2) {
		this.game2 = game2;
	}

	public String getPlace2() {
		return place2;
	}

	public void setPlace2(String place2) {
		this.place2 = place2;
	}

	public String getPrice2() {
		return price2;
	}

	public void setPrice2(String price2) {
		this.price2 = price2;
	}
	public Category2 getCategory2() {
		return category2;
	}

	public void setCategory2(Category2 category2) {
		this.category2 = category2;
	}

	@Override
	public String toString() {
		if (this.category2 != null)
			return "Basketball2 [id=" + id2 + ", date=" + date2 + ", time=" + time2 + ", game=" + game2 + ", place=" + place2 + ", price=" + price2 + " category =" + this.getCategory2() + "]";
		else
			return "Basketball2 [id=" + id2 + ", date=" + date2 + ", time=" + time2 + ", game=" + game2 + ", place=" + place2 + ", price=" + price2 + "]";
			
	}
}
