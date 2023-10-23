package com.mannager.football.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "avatar_login")
public class AvatarLogin implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_avatar_login")
	private Long idAvatarLogin;
	
	@ManyToOne
	@JoinColumn(name="id_avatar")
	private Avatar avatar;
	
	@ManyToOne
	@JoinColumn(name="id_login")
	private Login login;
	
}
