package com.aiguonajdbc.model;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class GoddessAction {
	public void add(Goddness goddess) throws SQLException
	{
		goddessDao dao=new goddessDao();
		dao.addGoddess(goddess);
	}
	public void edit(Goddness goddess) throws SQLException
	{
		goddessDao dao=new goddessDao();
		dao.updateGoddess(goddess);
	}
	public void del(Integer id) throws SQLException
	{
		goddessDao dao=new goddessDao();
		dao.delGoddess(id);
	}
	public Goddness query(Integer id) throws SQLException
	{
		goddessDao dao=new goddessDao();
		return dao.get(id);
	}
	public List<Goddness> queryList(String name) throws SQLException
	{
		goddessDao dao=new goddessDao();
		return dao.query(name);
	}
	public List<Goddness> look() throws SQLException
	{
		goddessDao dao=new goddessDao();
		return dao.look();
	}
	
	
	public static void main(String[] args) throws SQLException {
		goddessDao g = new goddessDao();
		List<Goddness> gs=g.query("Сϼ");
		for(Goddness goddess:gs)
		{
			System.out.println(goddess.getUesr_name()+","+goddess.getAge());
		}
		

	}
	
}
