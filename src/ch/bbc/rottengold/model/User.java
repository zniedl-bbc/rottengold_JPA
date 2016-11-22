package ch.bbc.rottengold.model;

import java.io.Serializable;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the user database table.
 * 
 */
@Named
@Entity
@NamedQueries({
	@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
	@NamedQuery(name = "User.checkLogin", query = "SELECT u FROM User u WHERE u.username = :userUsername AND u.password = :userPassword"),
	@NamedQuery(name = "User.getUserByUserName", query = "SELECT u FROM User u WHERE u.username = :userUsername"),
	@NamedQuery(name = "User.deleteAccount", query = "DELETE FROM User u  WHERE u.username = :userUsername")
})
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String email;

	private String password;

	private String username;

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getIdAsString(){
		return ""+getId();
	}

}