package com.luxoft.logeek.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Setter
@Getter
@Entity
@DynamicUpdate
public class EntityWithManyStringFieldsDynamicUpdate {
	
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
