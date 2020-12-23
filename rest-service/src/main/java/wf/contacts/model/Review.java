package wf.contacts.model;

import java.time.LocalDateTime;

public class Review {

	private Integer id;
	private String url;
	private String text;
	private Integer rating;
	private LocalDateTime timeCreated;
	private User user;
	
	
	public Review() {
		super();
	}

	
	

	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getUrl() {
		return url;
	}




	public void setUrl(String url) {
		this.url = url;
	}




	public String getText() {
		return text;
	}




	public void setText(String text) {
		this.text = text;
	}




	public Integer getRating() {
		return rating;
	}




	public void setRating(Integer rating) {
		this.rating = rating;
	}




	public LocalDateTime getTimeCreated() {
		return timeCreated;
	}




	public void setTimeCreated(LocalDateTime timeCreated) {
		this.timeCreated = timeCreated;
	}




	public User getUser() {
		return user;
	}




	public void setUser(User user) {
		this.user = user;
	}




	@Override
	public String toString() {
		return "Review [id=" + id + ", url=" + url + ", text=" + text + ", rating=" + rating + ", timeCreated="
				+ timeCreated + ", user=" + user + "]";
	}
	
	// Generate Getters and Setters...
	
	
}


