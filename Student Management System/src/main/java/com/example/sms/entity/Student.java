package com.example.sms.entity;

import javax.persistence.*;
import lombok.*;

@Data
@RequiredArgsConstructor 
@NoArgsConstructor
@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NonNull
	@Column(name = "first_name",nullable = false)
	private String firstName;
	
	@NonNull
	@Column(name = "lastname")
	private String lastName;
	
	@NonNull
	@Column(name="email")
	private String email;
}
