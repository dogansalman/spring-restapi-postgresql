package com.restapi.entity;
import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/*
 *  Bu entity author entity'si ile bire cok baglanti ile joinlenmektedir. 
 *  .NET'deki model nesneleri gibi bu sekilde entity'ler tanimlayarak veritabani modellemesini saglayabiliyoruz.
 *  Encapsulation islemini get set functionlari yazmadan @Getter @Setter Annontation ile kolaylikla yapabiliyoruz. 
 *  Bu ozelik lombok kutuphanesinden gelmektedir.
 * */


@Table(name="authors")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class author implements Serializable {
	
	@Id
	@SequenceGenerator(name="sec_author", allocationSize = 1)
	@GeneratedValue(generator="sec_author", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(length=300)
	private String fullName;

	@OneToMany
	@JoinColumn(name = "author_book_id")
	private List<book> books;

}
