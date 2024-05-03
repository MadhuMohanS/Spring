package com.xworkz.springanno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor{

	public void processor() {
		// TODO Auto-generated method stub
		System.out.println("MediaTek : 2nd words best cpu");
		
	}

}
