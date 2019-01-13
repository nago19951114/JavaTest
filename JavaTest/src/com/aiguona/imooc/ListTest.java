package com.aiguona.imooc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ��ѡ�γ���
 * 
 * @author nago
 *
 */
public class ListTest {

	public List coursesToSelect;

	public ListTest()// ���캯��
	{
		this.coursesToSelect = new ArrayList();
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

	public void print() {//forѭ����ӡ���пγ�
		int nsize = coursesToSelect.size();
		for (int i = 0; i < nsize; i++) {
			course cs = (course) coursesToSelect.get(i);
			System.out.println("����idΪ" + cs.id + "�Ŀγ�" + cs.name);
		}
	}

	public void foreach() {//foreach��ӡ���пγ�
		for (Object obk : coursesToSelect) {
			course obj = (course) obk;
			System.out.println("����idΪ" + obj.id + "�Ŀγ�" + obj.name);
		}
	}

	public void testIt() {//it��ӡ���пγ�
		Iterator it = coursesToSelect.iterator();
		while (it.hasNext()) {
			course cr = (course) it.next();
			System.out.println("����idΪ" + cr.id + "�Ŀγ�" + cr.name); 
		}
	}

	public void Modify()//�޸�
	{
		coursesToSelect.set(0, new course("000","����"));
	}
	
	public void delete() {//ɾ��
		course cr=(course)coursesToSelect.get(1);
		System.out.println("ɾ��������idΪ" + cr.id + "�Ŀγ�" + cr.name);
		coursesToSelect.remove(cr);
	}
	
	public static void main(String[] args) {//main����
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
