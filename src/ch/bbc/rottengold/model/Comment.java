package ch.bbc.rottengold.model;

import java.io.Serializable;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Named
@Entity
@NamedQueries({ @NamedQuery(name = "Comment.findAll", query = "SELECT c FROM Comment c"),
		@NamedQuery(name = "Comment.findWithWebsite", query = "SELECT c FROM Comment c WHERE c.id_website = :id_website"),
		@NamedQuery(name = "Comment.deleteComment", query = "DELETE FROM Comment c  WHERE c.id = :commentDeleteID"),
		@NamedQuery(name = "Comment.updateComment", query = "UPDATE Comment c SET c.title = :commentNewTitle , c.comment = :commentNewComment WHERE c.id = :id"),
		@NamedQuery(name = "Comment.deleteCommentByUserID", query = "DELETE FROM Comment c WHERE c.id_user = :userId") })

public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String comment;

	private String title;

	private int id_user;

	private int id_website;

	private String creationdate;

	public Comment() {

	}

	public Comment(String title, String comment) {
		this.comment = comment;
		this.title = title;
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

	public String getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

	public void clear() {
		this.setId(0);
		this.setComment("");
		this.setTitle("");
		this.setId_user(0);
		this.setId_website(0);
		this.setCreationdate("");
	}

}