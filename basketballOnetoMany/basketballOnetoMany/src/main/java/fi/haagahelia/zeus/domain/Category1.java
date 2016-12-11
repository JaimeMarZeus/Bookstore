package fi.haagahelia.zeus.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category1 {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long Categoryid1;
	private String name1;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category1")
	private List<Basketball1> bookstores1;
	
	public Category1() {}
	
	public Category1(String name1) {
		super();
		this.name1 = name1;
	}
	
	public Long getCategoryid1() {
		return Categoryid1;
	}
	
	public void setCategoryid1(Long Categoryid1) {
		this.Categoryid1 = Categoryid1;
	}
	
	public String getName1() {
		return name1;
	}
	
	public void setName1(String name1) {
		this.name1 = name1;
	}

	public List<Basketball1> getBookstores1() {
		return bookstores1;
	}

	public void setStudents(List<Basketball1> bookstores1) {
		this.bookstores1 = bookstores1;
	}

	@Override
	public String toString() {
		return "Department [Categoryid=" + Categoryid1 + ", name=" + name1 + "]";
	}
}
