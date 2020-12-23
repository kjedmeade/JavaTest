package wf.contacts.model;

import java.time.LocalDateTime;

public class User {

	private Integer id;
	private String profileUrl;
	private String imageUrl;
	private String name;
	
	public User() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", profileUrl=" + profileUrl + ", imageUrl=" + imageUrl + ", name=" + name + "]";
	}
	
	// Generate Getters and Setters...


}
