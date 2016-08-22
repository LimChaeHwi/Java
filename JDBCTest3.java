package test_jdbc;

import java.sql.*;

public class JDBCTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBCTest3 obj = new JDBCTest3();
//		obj.searchEmp("SMITH");
		obj.searchEmp3(2000,3000);
	}
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		return con;
	}
	public void searchEmp(String name){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			
			JDBCTest3 obj2 = new JDBCTest3();
			con = obj2.getConnection();
			pstmt = con.prepareStatement("select empno, ename,job,sal from emp where ename=?");
			pstmt.setString(1, name);
			rs =pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "
						+ ""+rs.getString(3)+" : "+rs.getDouble(4));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs!=null) try{rs.close();}catch(Exception e){e.getMessage();}
			if(pstmt!=null) try{pstmt.close();}catch(Exception e){e.getMessage();}
			if(con!=null) try{con.close();}catch(Exception e){e.getMessage();}
		}
	}
	public void searchEmp3(int sal1, int sal2){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		JDBCTest3 obj3 = new JDBCTest3();
		try{
			
			con = obj3.getConnection();
			pstmt = con.prepareStatement("select empno, ename, sal from emp where sal between ? and ?");
			pstmt.setInt(1, sal1);
			pstmt.setInt(2, sal2);
			rs = pstmt.executeQuery();
			System.out.println("empno  ename   sal");
			System.out.println("===================");
			while(rs.next()){
				System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getInt(3));
			}
					
		}catch(Exception e){
			System.out.println(e.getMessage());				
		}finally{
			if(rs!=null) try{rs.close();}catch(Exception e){e.printStackTrace();}
			if(pstmt!=null) try{pstmt.close();}catch(Exception e){e.printStackTrace();}
			if(con!=null) try{con.close();}catch(Exception e){e.printStackTrace();}
		}
	}
}
