package com.aiguona.imooc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class scoreSet {

	public List<course> coursesToSelect;

	public scoreSet() {
		coursesToSelect = new ArrayList<course>();
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

	public void print() {// for循环打印所有课程
		int nsize = coursesToSelect.size();
		for (int i = 0; i < nsize; i++) {
			course cs = (course) coursesToSelect.get(i);
			System.out.println("这是id为" + cs.id + "的课程" + cs.name);
		}
	}
	
	public void printSTU(student stu)
	{
		//输出小明的所有课程
		System.out.println("我是"+stu.getName());
		for (course obk : stu.courses) {// 添加课程
			System.out.println("选课成功" + obk.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scoreSet scs = new scoreSet();
		scs.testAdd();
		scs.print();

		student stu = new student("1", "xiaoming");
		System.out.println("欢迎选课");
		Scanner input = new Scanner(System.in);
		while(true)// 输入三门课程
		{
			int flag=0;
			System.out.println("请输入课程Id:");
			String courseID = input.next();
			for (course obk : scs.coursesToSelect) {// 添加课程
				if (courseID.equals(obk.id)) {
					if(stu.courses.contains(obk))
					{
						System.out.println("已经选择该课程，请勿重复选择");
						flag=1;
						break;
					}
					stu.courses.add(obk);
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println("没有此门课程");
			}
			if(stu.courses.size()>=3)
				break;
		}
		scs.printSTU(stu);

	}
}
