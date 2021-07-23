package com.restapi;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* SpingBoot context'inde veritabani baglantisi Configuration Annontation'unu kullanarak
 * javax.sql.DataSource'deki DataSourceBuilder class'i ile bir anlamda connectionString'ini tanimliyoruz.
 * @Bean
 * Configuration annotation'u ile tanimli bir sinifin function'lari Bean annoatation ile kullanilmaktadir.
 * Spring tarafindan yonetilen bir bean'olan getDataSource'u kullaniyoruz.
 * */

@Configuration
public class dbconfig {	
	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder dsb = DataSourceBuilder.create();
		dsb.driverClassName("org.postgresql.Driver");
		dsb.url("jdbc:postgresql://localhost:5432/book");
		dsb.username("book_db_user");
		dsb.password("m2m3m4");
		return dsb.build();
	}
}

