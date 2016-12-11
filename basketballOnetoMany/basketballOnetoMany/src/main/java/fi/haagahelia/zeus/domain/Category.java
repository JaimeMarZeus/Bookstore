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
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long Categoryid;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private List<Basketball> basketballs;
	
	public Category() {}
	
	public Category(String name) {
		super();
		this.name = name;
	}
	
	public Long getCategoryid() {
		return Categoryid;
	}
	
	public void setCategoryid(Long Categoryid) {
		this.Categoryid = Categoryid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<Basketball> getBookstores() {
		return basketballs;
	}

	public void setStudents(List<Basketball> basketballs) {
		this.basketballs = basketballs;
	}

	@Override
	public String toString() {
		return "Department [Categoryid=" + Categoryid + ", name=" + name + "]";
	}
}
