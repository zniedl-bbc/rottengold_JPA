package ch.bbc.rottengold.model;

import java.io.Serializable;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Named
@Entity
@NamedQueries({ @NamedQuery(name = "Website.findAll", query = "SELECT w FROM Website w"),
		@NamedQuery(name = "Website.findByWebsiteName", query = "SELECT w FROM Website w WHERE w.name LIKE :webName"),
		@NamedQuery(name = "Website.findByWebsiteId", query = "SELECT w FROM Website w WHERE w.id LIKE :webId"),
		@NamedQuery(name = "Website.findBiggestId", query = "SELECT w.id FROM Website w ORDER BY w.id DESC")})

public class Website implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	private String url;

	private String description;

	public Website() {

	}

	public Website(String name, String url, String description) {
		this.name = name;
		this.url = url;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
