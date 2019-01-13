package com.aiguonajdbc.model;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class GoddessAction {
	public static void main(String[] args) throws SQLException {
		goddessDao g = new goddessDao();
		List<Goddness> gs=g.query("Сϼ");
		for(Goddness goddess:gs)
		{
			System.out.println(goddess.getUesr_name()+","+goddess.getAge());
		}
		

	}
	
}
