package com.aiguona.imooc;

import java.util.ArrayList;
import java.util.List;
/**
 * 应用泛型管理课程
 * @author nago
 *
 */
public class Generic {

	public List<course> courses;
	
	public Generic(){//构造
		this.courses=new ArrayList<course>();
	}
	
	public void foreach() {//foreach打印所有课程
		for (course obk : courses) {
			System.out.println("这是id为" + obk.id + "的课程" + obk.name);
		}
	}
	
	public void testAdd() {//添加
		course cr1 = new course("12345","大学语文");
		courses.add(cr1);
		System.out.println("成功添加"+cr1.name);
	}
	
	public void testchildAdd() {//添加子类
		ChildCourse ccr = new ChildCourse();
		ccr.id="10086";
		ccr.name="中国移动";
		courses.add(ccr);
	}
	
	public static void main(String[] args) {//main函数
		// TODO Auto-generated method stub
		Generic ge = new Generic();
		ge.testAdd();
		System.out.println("____________");
		ge.foreach();
		ge.testchildAdd();
		ge.foreach();

	}

}
