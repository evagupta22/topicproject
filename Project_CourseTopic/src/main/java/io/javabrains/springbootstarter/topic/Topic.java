package io.javabrains.springbootstarter.topic;
import javax.persistence.Entity;
import javax.persistence.Id;
//@entity depicts the table and @id depicts the primary key..annotation

@Entity
public class Topic {
	@Id
	private String id;
	private String name;
	private String description;
	
	public Topic() {
	}
	
	public Topic(String id2, String name2, String description2) {
		super();
		id = id2;
		name = name2;
		description = description2;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
