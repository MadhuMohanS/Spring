package com.xworkz.constructor;

import java.security.cert.Certificate;
import java.util.List;

public class Person {
private String name;
private int personId;
private Certi certi;
private List<String> addresses;

public Person(String name,int personId,Certi certi,List<String> addresses) {
	this.name=name;
	this.personId=personId;
	this.certi=certi;
	this.addresses=addresses;
}

@Override
	public String toString() {
	
		return "Name:"+this.name+"\nperson id:"+this.personId+"\nCerti:"+this.certi+"\naddress:"+this.addresses;
	}
}
