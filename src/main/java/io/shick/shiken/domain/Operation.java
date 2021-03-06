package io.shick.shiken.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.Property;

/**
 * An authority (a security role) used by Spring Security.
 */
@Entity
@Table(name = "JHI_OPERATION")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Operation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8783689208002274800L;


	@Property
	@Id
	@NotNull
    @Size(min = 0, max = 25)
    @Column(length = 15)
	String name;
	
	@Property
	@NotNull
    @Size(min = 4, max = 35)
    @Column(length = 25,nullable=true)
	private String title;

	@Property
    @Column
	private String description;
	
	@NotNull
	@Column
	@Property
	String groupName;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	@Override
	public String toString() {
		return Pojomatic.toString(this);
	}
	@Override
	public int hashCode() {
		return Pojomatic.hashCode(this);
	}
	@Override
	public boolean equals(Object other) {
		return Pojomatic.equals(this, other);
	}

}
