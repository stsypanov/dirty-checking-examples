package com.luxoft.logeek.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class EntityWithManyStringFields {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String field1;

	@Column
	private String field2;

	@Column
	private String field3;

	@Column
	private String field4;

	@Column
	private String field5;

	@Column
	private String field6;

	@Column
	private String field7;

	@Column
	private String field8;

}
