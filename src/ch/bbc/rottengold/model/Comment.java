package ch.bbc.rottengold.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ 
	@NamedQuery(name = "Comment.findAll", query = "SELECT c FROM Comment c"),
	@NamedQuery(name = "Comment.findWithWebsite", query = "SELECT c FROM Comment c WHERE c.id_website = :id_website")
})

public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String comment;

	private String title;

	private int id_user;

	private int id_website;

	public Comment() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_website() {
		return id_website;
	}

	public void setId_website(int id_website) {
		this.id_website = id_website;
	}

}