package com.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})

public class book {
	
	@Id 
	@SequenceGenerator(name="SeqBomBook", allocationSize=1)
	@GeneratedValue(generator="SeqBomBook", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private Long year;

	//@ManyToOne
	//@JoinColumn(name = "author_book_id")
	//private author author;
}
