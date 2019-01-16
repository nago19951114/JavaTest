package com.aiguonajdbc.model;

import java.sql.SQLException;
import java.util.List;

public class ActionTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		GoddessAction action = new GoddessAction();
		List<Goddness> result = action.look();
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i).getUesr_name());
			
		}
	}

}
