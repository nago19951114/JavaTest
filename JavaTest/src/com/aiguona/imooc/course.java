package com.aiguona.imooc;
/**
 * �γ���
 * @author nago
 *
 */
public class course {
	public String id;
	public String name;

	public course(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public course() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
