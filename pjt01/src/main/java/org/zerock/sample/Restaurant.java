package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;
//TODO:å�����´�� SETTER�� ��������ʾ� �� �۵����Ͽ� ������
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
	  
	  
	  
// TODO: ���� �ش� ��ɾ�� java version 1.8�ʰ�����	  
//	 @Setter(onMethod =@_({ @Autowired}))
//	 private Chef chef;
//	
	
}
