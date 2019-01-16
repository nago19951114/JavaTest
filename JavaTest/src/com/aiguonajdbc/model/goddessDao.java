package com.aiguonajdbc.model;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class goddessDao {
	public void addGoddess(Goddness g) throws SQLException
	{
		Connection conn=DBunit.getConnection();//拿到数据库的连接
		String sql=""+"insert into imooc_Goddess "+"(user_name,sex,age,birthday,email,mobile,create_user,create_date,update_user,update_date,isdel)"
		+"values(?,?,?,?,?,?,?,current_date(),?,current_date(),?)";
		PreparedStatement ptmt=conn.prepareStatement(sql);
		
		ptmt.setString(1, g.getUesr_name());
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBirthdat().getTime()));
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
		ptmt.setString(7, g.getCreate_user());
		ptmt.setString(8, g.getUpdate_user());
		ptmt.setInt(9, g.getIsdel());
		
		ptmt.execute();
	}
	public void updateGoddess(Goddness g) throws SQLException
	{
		Connection conn=DBunit.getConnection();//拿到数据库的连接
		String sql = " update imooc_goddess " + 
				" set user_name=?,sex=?,age=?,birthday=?,email=?,mobile=?, " +
				" update_user=?,update_date=current_date(),isdel=? " +
				" where id=? ";
		PreparedStatement ptmt=conn.prepareStatement(sql);
		
		ptmt.setString(1, g.getUesr_name());
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBirthdat().getTime()));
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
		ptmt.setString(7, g.getUpdate_user());
		ptmt.setInt(8, g.getIsdel());
		ptmt.setInt(9, g.getId());
		
		ptmt.execute();
	}
	public void delGoddess(Integer id) throws SQLException
	{
		Connection conn=DBunit.getConnection();//拿到数据库的连接
		String sql=" "+" delete from imooc_Goddess "+" where id=? ";
		PreparedStatement ptmt=conn.prepareStatement(sql);
		
		ptmt.setInt(1, id);
		
		ptmt.execute();
		
	}
	public List<Goddness> query(String name) throws SQLException
	{
		Connection conn=DBunit.getConnection();
		// 3.操作数据库
		Statement stmt = conn.createStatement();
		// 4.查询
		StringBuilder sb = new StringBuilder();
		sb.append("select * from imooc_goddess where user_name =?");
		
		PreparedStatement ptmt=conn.prepareStatement(sb.toString());
		ptmt.setString(1, name);
		ResultSet re= ptmt.executeQuery();
		List<Goddness> gs = new ArrayList<Goddness>();
		Goddness g=null;
		// 5.打印
		while (re.next()) {
			g=new  Goddness();
			g.setUesr_name(re.getString("user_name"));
			g.setAge(re.getInt("age"));
			g.setId(re.getInt("id"));
			g.setSex(re.getInt("sex"));
			g.setBirthdat(re.getDate("birthday"));
			g.setEmail(re.getString("email"));
			g.setMobile(re.getString("mobile"));
			g.setCreate_date(re.getDate("create_date"));
			g.setCreate_user(re.getString("Create_user"));
			g.setUpdata_data(re.getDate("update_date"));
			g.setUpdate_user(re.getString("Update_user"));
			g.setIsdel(re.getInt("Isdel"));
			gs.add(g);
			//System.out.println(re.getString("user_name") + "," + re.getInt("age"));
		}
		return gs;
	}
	public  Goddness get(Integer id) throws SQLException
	{			
		Goddness g= null;
		Connection conn=DBunit.getConnection();//拿到数据库的连接
		String sql=" "+" select * from  imooc_goddess "+" where id=? ";
		PreparedStatement ptmt=conn.prepareStatement(sql);
		ptmt.setInt(1, id);
		
		ResultSet re= ptmt.executeQuery();
		while(re.next())
		{
			g= new Goddness();
			g.setUesr_name(re.getString("user_name"));
			g.setAge(re.getInt("age"));
			g.setId(re.getInt("id"));
			g.setSex(re.getInt("sex"));
			g.setBirthdat(re.getDate("birthday"));
			g.setEmail(re.getString("email"));
			g.setMobile(re.getString("mobile"));
			g.setCreate_date(re.getDate("create_date"));
			g.setCreate_user(re.getString("Create_user"));
			g.setUpdata_data(re.getDate("update_date"));
			g.setUpdate_user(re.getString("Update_user"));
			g.setIsdel(re.getInt("Isdel"));
		}
		return g;	
	}
	
	public  List<Goddness> look() throws SQLException
	{			
		Goddness g= null;
		Connection conn=DBunit.getConnection();//拿到数据库的连接
		String sql=" "+" select * from  imooc_goddess ";
		PreparedStatement ptmt=conn.prepareStatement(sql);
		List<Goddness> gs = new ArrayList<Goddness>();
		ResultSet re= ptmt.executeQuery();
		while(re.next())
		{
			g= new Goddness();
			g.setUesr_name(re.getString("user_name"));
			g.setAge(re.getInt("age"));
			g.setId(re.getInt("id"));
			g.setSex(re.getInt("sex"));
			g.setBirthdat(re.getDate("birthday"));
			g.setEmail(re.getString("email"));
			g.setMobile(re.getString("mobile"));
			g.setCreate_date(re.getDate("create_date"));
			g.setCreate_user(re.getString("Create_user"));
			g.setUpdata_data(re.getDate("update_date"));
			g.setUpdate_user(re.getString("Update_user"));
			g.setIsdel(re.getInt("Isdel"));
			gs.add(g);
		}
		return gs;	
	}

}
