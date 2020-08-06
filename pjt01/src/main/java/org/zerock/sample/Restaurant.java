package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;
import lombok.Setter;
//TODO:lomnbok onmethod 안먹혀서 사용을하지않아 상위 롬복 임폴트에 사용하지않음 에러 뜸
//import lombok.Setter;

//@SuppressWarnings("unused")
@Component
@Data
public class Restaurant {

	@Autowired
	private Chef chef;

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

//	public class Restaurant{
//	 @Setter(onMethod =@_({ @Autowired}))
//	 b private Chef chef;
//}

// TODO: 자바1.8 에서는 작동안한당
//	 @Setter(onMethod =@_({ @Autowired}))
//	 private Chef chef;
//	

}
