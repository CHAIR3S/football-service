package com.mannager.football.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "avatar")
public class Avatar implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_avatar")
	private Integer idAvatar;
	
	@Column(name = "url_avatar")
	private String urlAvatar;
	
}
