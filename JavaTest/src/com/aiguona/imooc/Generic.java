package com.aiguona.imooc;

import java.util.ArrayList;
import java.util.List;
/**
 * Ӧ�÷��͹���γ�
 * @author nago
 *
 */
public class Generic {

	public List<course> courses;
	
	public Generic(){//����
		this.courses=new ArrayList<course>();
	}
	
	public void foreach() {//foreach��ӡ���пγ�
		for (course obk : courses) {
			System.out.println("����idΪ" + obk.id + "�Ŀγ�" + obk.name);
		}
	}
	
	public void testAdd() {//���
		course cr1 = new course("12345","��ѧ����");
		courses.add(cr1);
		System.out.println("�ɹ����"+cr1.name);
	}
	
	public void testchildAdd() {//�������
		ChildCourse ccr = new ChildCourse();
		ccr.id="10086";
		ccr.name="�й��ƶ�";
		courses.add(ccr);
	}
	
	public static void main(String[] args) {//main����
		// TODO Auto-generated method stub
		Generic ge = new Generic();
		ge.testAdd();
		System.out.println("____________");
		ge.foreach();
		ge.testchildAdd();
		ge.foreach();

	}

}
