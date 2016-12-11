package fi.haagahelia.zeus.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Basketball {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String date;
    private String time;
    private String game;
    private String place;
    private String price;
    
    @ManyToOne
    @JoinColumn(name = "Categoryid")
    private Category category;
    


    public Basketball() {}

	public Basketball(String date, String time , String game , String place , String price , Category category) {
		super();
		this.date = date;
		this.time = time;
		this.game = game;
		this.place = place;
		this.price = price;
		this.category = category;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		if (this.category != null)
			return "Basketball [id=" + id + ", date=" + date + ", time=" + time + ", game=" + game + ", place=" + place + ", price=" + price + " category =" + this.getCategory() + "]";
		else
			return "Basketball [id=" + id + ", date=" + date + ", time=" + time + ", game=" + game + ", place=" + place + ", price=" + price + "]";
			
	}
}
