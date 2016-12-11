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
public class Category2 {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long Categoryid2;
	private String name2;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category2")
	private List<Basketball2> bookstores2;
	
	public Category2() {}
	
	public Category2(String name2) {
		super();
		this.name2 = name2;
	}
	
	public Long getCategoryid2() {
		return Categoryid2;
	}
	
	public void setCategoryid2(Long Categoryid2) {
		this.Categoryid2 = Categoryid2;
	}
	
	public String getName2() {
		return name2;
	}
	
	public void setName2(String name2) {
		this.name2 = name2;
	}

	public List<Basketball2> getBookstores2() {
		return bookstores2;
	}

	public void setStudents(List<Basketball2> bookstores2) {
		this.bookstores2 = bookstores2;
	}

	@Override
	public String toString() {
		return "Department [Categoryid=" + Categoryid2 + ", name=" + name2 + "]";
	}
}
