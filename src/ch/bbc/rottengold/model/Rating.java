package ch.bbc.rottengold.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Rating.findAll", query = "SELECT r FROM Rating r"),
		@NamedQuery(name = "Rating.findRatingByWebsiteIdAndUserId", query = "SELECT r FROM Rating r WHERE r.id_user = :id_user AND r.id_website = :id_website"),
		@NamedQuery(name = "Rating.findRatingByWebsiteId", query = "SELECT r FROM Rating r WHERE r.id_website = :id_website"),
		@NamedQuery(name = "Rating.updateRating", query = "UPDATE Rating r SET r.rating = :rating WHERE r.id_website = :id_website AND r.id_user = :id_user")})

public class Rating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int id_user;

	private int id_website;

	private int rating;

	public Rating() {

	}

	public Rating(int id, int rating, int websiteId, int userId) {
		this.id = id;
		this.rating = rating;
		this.id_website = websiteId;
		this.id_user = userId;
	}

	public Rating(int rating, int website_id, int user_id) {
		this.rating = rating;
		this.id_website = website_id;
		this.id_user = user_id;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}