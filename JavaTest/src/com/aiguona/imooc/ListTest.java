package com.aiguona.imooc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 备选课程类
 * 
 * @author nago
 *
 */
public class ListTest {

	public List coursesToSelect;

	public ListTest()// 构造函数
	{
		this.coursesToSelect = new ArrayList();
	}

	public void testAdd() { // 添加备选课程
		course cr1 = new course("123", "数据结构");
		coursesToSelect.add(cr1);
		course temp = (course) coursesToSelect.get(0);
		System.out.println(temp.name + "OK");

		course cr2 = new course("456", "C语言");
		coursesToSelect.add(0, cr2);
		course temp2 = (course) coursesToSelect.get(0);
		System.out.println(temp2.name + "OK");

		course[] ncourse = { new course("3", "汇编语言"), new course("4", "离散数学") };
		coursesToSelect.addAll(Arrays.asList(ncourse));

	}

	public void print() {//for循环打印所有课程
		int nsize = coursesToSelect.size();
		for (int i = 0; i < nsize; i++) {
			course cs = (course) coursesToSelect.get(i);
			System.out.println("这是id为" + cs.id + "的课程" + cs.name);
		}
	}

	public void foreach() {//foreach打印所有课程
		for (Object obk : coursesToSelect) {
			course obj = (course) obk;
			System.out.println("这是id为" + obj.id + "的课程" + obj.name);
		}
	}

	public void testIt() {//it打印所有课程
		Iterator it = coursesToSelect.iterator();
		while (it.hasNext()) {
			course cr = (course) it.next();
			System.out.println("这是id为" + cr.id + "的课程" + cr.name); 
		}
	}

	public void Modify()//修改
	{
		coursesToSelect.set(0, new course("000","独特"));
	}
	
	public void delete() {//删除
		course cr=(course)coursesToSelect.get(1);
		System.out.println("删除：这是id为" + cr.id + "的课程" + cr.name);
		coursesToSelect.remove(cr);
	}
	
	public static void main(String[] args) {//main函数
		ListTest it = new ListTest();
		it.testAdd();
		it.print();
		System.out.println("____________");
		it.testIt();
		System.out.println("____________");
		it.foreach();
		System.out.println("____________");
		it.Modify();
		it.foreach();
		System.out.println("____________");
		it.delete();
	}
}
