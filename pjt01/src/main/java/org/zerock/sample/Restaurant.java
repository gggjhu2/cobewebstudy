package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;
//TODO:책에나온대로 SETTER를 사용하지않아 서 작동안하여 삭제함
//import lombok.Setter;

//@SuppressWarnings("unused")
@Component
@Data
public class Restaurant {
	
	  @Autowired
	   private Chef chef;

//	public Chef getChef() {
//		return chef;
//	}
//
//	public void setChef(Chef chef) {
//		this.chef = chef;
//	}
	 	
		
//	public class Restaurant{
//	 @Setter(onMethod =@_({ @Autowired}))
//	 private Chef chef;
//}
	  
	  
	  
// TODO: 밑의 해당 명령어는 java version 1.8초과에서	  
//	 @Setter(onMethod =@_({ @Autowired}))
//	 private Chef chef;
//	
	
}
