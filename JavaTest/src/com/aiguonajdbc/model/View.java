package com.aiguonajdbc.model;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class View {
	private static final String CONTEXT="��ӭ����Ů�������\n" +
			"������Ů������Ĺ����б�\n" +
			"[MAIN/M]:���˵�\n" +
			"[1]:�鿴ȫ��Ů�����Ϣ\n" +
			"[2]:�鿴ĳλŮ�����ϸ��Ϣ\n" +
			"[3]:���Ů����Ϣ\n" +
			"[4]:����Ů����Ϣ\n" +
			"[5]:ɾ��Ů����Ϣ\n" +
			"[6]:��ѯŮ����Ϣ(�����������ֻ�������ѯ)\n" +
			"[0]:�˳�Ů�����\n" ;


	public static void main(String[] args) throws SQLException, ParseException {
		// TODO Auto-generated method stub
		System.out.println(CONTEXT);
		Scanner input = new Scanner(System.in);
		Goddness goddess = new Goddness();
		GoddessAction action = new GoddessAction();
		String pre=null;
		Integer step=1;
		while(input.hasNext())
		{
			int in=input.nextInt();
			if(in==0)
			{
				System.out.println("�˳��ɹ�");
				break;
			}
			else if(in==1)//�鿴������Ϣ
			{
				List<Goddness> gs=null;
				gs=action.look();
				for(int i=0;i<gs.size();i++)
				{
					System.out.println(gs.get(i).getUesr_name()+gs.get(i).getEmail());
				}
			}
			else if(in==2)
			{
				Goddness gs= null;
				System.out.println("�������ѯ�ĵ�id");
				Integer step1=input.nextInt();
				gs=action.query(step1);
				System.out.println(gs.getUesr_name()+gs.getEmail());
			}
			else if(in==3)
			{
				Goddness g=null;
				
				String step1=input.next().toString();
				System.out.println("������Ů��ģ�������");
				goddess.setUesr_name(step1);
				
				System.out.println("������Ů��ģ������");
				step1=input.next();
				goddess.setAge(Integer.valueOf(step1));
				
				System.out.println("������Ů��ģ����գݣ���ʽ�磺yyyy-MM-dd");
				step1=input.next();
				SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
				Date birthday=null;
				birthday = sf.parse(step1);
				goddess.setBirthdat(birthday);
				
				System.out.println("������Ů��ģ������");
				step1=input.next();
				goddess.setEmail(step1);
				
				System.out.println("������Ů��ģ��ֻ��ţ�");
				step1=input.next();
				goddess.setMobile(step1);
				
				action.add(goddess);
				System.out.println("����Ů��ɹ�");
			}
			else if(in==4)
			{
				Goddness g=null;
				
				String step1=input.next().toString();
				System.out.println("������Ů��ģ�������");
				goddess.setUesr_name(step1);
				
				System.out.println("������Ů��ģ������");
				step1=input.next();
				goddess.setAge(Integer.valueOf(step1));
				
				System.out.println("������Ů��ģ����գݣ���ʽ�磺yyyy-MM-dd");
				step1=input.next();
				SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
				Date birthday=null;
				birthday = sf.parse(step1);
				goddess.setBirthdat(birthday);
				
				System.out.println("������Ů��ģ������");
				step1=input.next();
				goddess.setEmail(step1);
				
				System.out.println("������Ů��ģ��ֻ��ţ�");
				step1=input.next();
				goddess.setMobile(step1);
				
				action.edit(goddess);
				System.out.println("����Ů��ɹ�");
			}

			else if(in==5)
			{
				System.out.println("������ɾ����id");
				Integer step1=input.nextInt();
				action.del(step1);
				System.out.println("ɾ���ɹ�");
			}

			else if(in==6)
			{
				System.out.println("������Ů��ģ�����]");
				String step1=input.next().toString();
				List<Goddness> gs=null;
				gs=action.queryList(step1);
				for(int i=0;i<gs.size();i++)
				{
					System.out.println(gs.get(i).getUesr_name()+gs.get(i).getEmail());
				}
			}
		}
	}
}
