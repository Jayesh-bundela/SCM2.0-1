package com.scm.entities;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Contact {
  
	@Id
	private String id;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	private String picture;
	@Column(length=10000)
	private String destruction;
	private boolean favorite=false;
	private String instagramLink;
	private String websiteLink;
		
	//private List<SocialLink> socialLink=new ArrayList<>() ;
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Contact contact;
	
    @OneToMany(mappedBy = "contact",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<SocialLink> links=new ArrayList<>();
	
	
	
}
