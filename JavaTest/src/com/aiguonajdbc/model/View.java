package com.aiguonajdbc.model;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class View {
	private static final String CONTEXT="欢迎来到女神禁区：\n" +
			"下面是女神禁区的功能列表：\n" +
			"[MAIN/M]:主菜单\n" +
			"[1]:查看全部女神的信息\n" +
			"[2]:查看某位女神的详细信息\n" +
			"[3]:添加女神信息\n" +
			"[4]:更新女神信息\n" +
			"[5]:删除女神信息\n" +
			"[6]:查询女神信息(根据姓名、手机号来查询)\n" +
			"[0]:退出女神禁区\n" ;


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
				System.out.println("退出成功");
				break;
			}
			else if(in==1)//查看所有信息
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
				System.out.println("请输入查询的的id");
				Integer step1=input.nextInt();
				gs=action.query(step1);
				System.out.println(gs.getUesr_name()+gs.getEmail());
			}
			else if(in==3)
			{
				Goddness g=null;
				
				String step1=input.next().toString();
				System.out.println("请输入女神的［姓名］");
				goddess.setUesr_name(step1);
				
				System.out.println("请输入女神的［年龄］");
				step1=input.next();
				goddess.setAge(Integer.valueOf(step1));
				
				System.out.println("请输入女神的［生日］，格式如：yyyy-MM-dd");
				step1=input.next();
				SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
				Date birthday=null;
				birthday = sf.parse(step1);
				goddess.setBirthdat(birthday);
				
				System.out.println("请输入女神的［邮箱］");
				step1=input.next();
				goddess.setEmail(step1);
				
				System.out.println("请输入女神的［手机号］");
				step1=input.next();
				goddess.setMobile(step1);
				
				action.add(goddess);
				System.out.println("新增女神成功");
			}
			else if(in==4)
			{
				Goddness g=null;
				
				String step1=input.next().toString();
				System.out.println("请输入女神的［姓名］");
				goddess.setUesr_name(step1);
				
				System.out.println("请输入女神的［年龄］");
				step1=input.next();
				goddess.setAge(Integer.valueOf(step1));
				
				System.out.println("请输入女神的［生日］，格式如：yyyy-MM-dd");
				step1=input.next();
				SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
				Date birthday=null;
				birthday = sf.parse(step1);
				goddess.setBirthdat(birthday);
				
				System.out.println("请输入女神的［邮箱］");
				step1=input.next();
				goddess.setEmail(step1);
				
				System.out.println("请输入女神的［手机号］");
				step1=input.next();
				goddess.setMobile(step1);
				
				action.edit(goddess);
				System.out.println("更新女神成功");
			}

			else if(in==5)
			{
				System.out.println("请输入删除的id");
				Integer step1=input.nextInt();
				action.del(step1);
				System.out.println("删除成功");
			}

			else if(in==6)
			{
				System.out.println("请输入女神的［姓名]");
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
