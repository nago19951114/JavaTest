package com.aiguona.imooc;

import java.util.HashSet;
import java.util.Set;
/**
 * 学生信息类
 * @author nago
 *
 */
public class student {
	
	private String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private String id;
	public Set<course> courses;
	
	
	public student(String id,String name)
	{
		this.name=name;
		this.id=id;
		this.courses=new HashSet<course>();
	}

}
