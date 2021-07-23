package com.restapi.dto;

import lombok.Data;

/*
 * DTO data-transfer-object api'den donen veriyi dis dunyaya DTO araciligi ile aciyoruz. 
 * Database tarafindaki field isimleri degismesi durumuna karsin bu noktada DTO kullanarak bir katman ilave ediyoruz. 
 * */

/*
 * Data Annotation'u ile getter,setter toString gibi ozellikleri entity'ye kazandiriyor.
 * */
@Data
public class bookDto {
	
	private Long id;
	private String name;
	private Long year;
	private com.restapi.entity.author author;
	
}
