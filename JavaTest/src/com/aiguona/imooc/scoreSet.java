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

	public void testAdd() { // ��ӱ�ѡ�γ�
		course cr1 = new course("123", "���ݽṹ");
		coursesToSelect.add(cr1);
		course temp = (course) coursesToSelect.get(0);
		System.out.println(temp.name + "OK");

		course cr2 = new course("456", "C����");
		coursesToSelect.add(0, cr2);
		course temp2 = (course) coursesToSelect.get(0);
		System.out.println(temp2.name + "OK");

		course[] ncourse = { new course("3", "�������"), new course("4", "��ɢ��ѧ") };
		coursesToSelect.addAll(Arrays.asList(ncourse));

	}

	public void print() {// forѭ����ӡ���пγ�
		int nsize = coursesToSelect.size();
		for (int i = 0; i < nsize; i++) {
			course cs = (course) coursesToSelect.get(i);
			System.out.println("����idΪ" + cs.id + "�Ŀγ�" + cs.name);
		}
	}
	
	public void printSTU(student stu)
	{
		//���С�������пγ�
		System.out.println("����"+stu.getName());
		for (course obk : stu.courses) {// ��ӿγ�
			System.out.println("ѡ�γɹ�" + obk.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scoreSet scs = new scoreSet();
		scs.testAdd();
		scs.print();

		student stu = new student("1", "xiaoming");
		System.out.println("��ӭѡ��");
		Scanner input = new Scanner(System.in);
		while(true)// �������ſγ�
		{
			int flag=0;
			System.out.println("������γ�Id:");
			String courseID = input.next();
			for (course obk : scs.coursesToSelect) {// ��ӿγ�
				if (courseID.equals(obk.id)) {
					if(stu.courses.contains(obk))
					{
						System.out.println("�Ѿ�ѡ��ÿγ̣������ظ�ѡ��");
						flag=1;
						break;
					}
					stu.courses.add(obk);
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println("û�д��ſγ�");
			}
			if(stu.courses.size()>=3)
				break;
		}
		scs.printSTU(stu);

	}
}
