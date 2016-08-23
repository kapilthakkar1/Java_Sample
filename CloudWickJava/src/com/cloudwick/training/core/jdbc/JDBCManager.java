package com.cloudwick.training.core.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCManager {
	private static Connection con;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost/cloudwick","root","kapil");
	/*	InsertData("vjiij","oioiuh1");
		InsertData("jhkj","iiui"); */
		
	}
	private static void CreateConnection(String driver, String url, String uname, String pwd){	
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		try {
			con = DriverManager.getConnection(url, uname, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*	try {
			con.setAutoCommit(false);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} */
		
	}
	public static void InsertBatchData(String user, String pwd){
		
		PreparedStatement ps=null;
		try {
			ps=con.prepareStatement("Insert into user (USERNAME,PASSWORD) values (?,?)");
		
			ps.addBatch();
			ps.setString(1, "U111");
			ps.setString(2, "P222");
			ps.addBatch();
			
			ps.setString(1, "U222");
			ps.setString(2,"P222");
			ps.addBatch();
			
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void FetchData(int USERID){
		try {
			PreparedStatement ps=con.prepareStatement("select USERNAME, PASSWORD fron user where USERID=?" );
			ps.setInt(1,USERID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				System.out.println("username"+ rs.getString(1)+"\n");
				System.out.println("password"+ rs.getString(2)+"\n");
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}

