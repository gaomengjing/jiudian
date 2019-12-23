package org.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.entity.Customer;

public class DBUtil {
	private  static final String DRIVERNAME="oracle.jdbc.OracleDriver";
	private  static final String URL="jdbc:oracle:thin:@localhost:1521:ORCL";
	private  static final String USERNAME="scott";
	private  static final String PASSWORD="itshaorui.cn";
	public static PreparedStatement pstmt=null;
	public static Connection connection=null;
	public static ResultSet rs=null;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVERNAME);
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);		
	}
	
	public static PreparedStatement createPreparedStatement(String sql,Object[] params) throws ClassNotFoundException, SQLException {
		//获取链接
		 //getConnection();
		 //pstmt=connection.prepareStatement(sql);
		pstmt=getConnection().prepareStatement(sql);
		 //String sql="insert into college(StuDepNo,StuDep) values(?,?)";
		// pst.setString(1, college.getStuDepNo());
		 if(params!=null) {
			 for(int i=0;i<params.length;i++) {
				 //问号的个数等于数组元素的个数，而问号从1开始，数组从0开始，故i+1
				 pstmt.setObject(i+1, params[i]);
			 }
		 }
		 return pstmt;
	}
	
	//通用的增删改
	public static boolean executeUpdate(String sql,Object[] params) {
		//Object[] params:存放sql语句里的值		
		 try {
			 pstmt=createPreparedStatement(sql, params);
			 int count=pstmt.executeUpdate();
			 if(count>0)
				 return true;
			 else
				 return false;
		 }catch(ClassNotFoundException e){
			 e.getStackTrace();
				return false;
		 }catch(SQLException e) {
				e.getStackTrace();
				return false;
			}catch(Exception e) {
				e.getStackTrace();
				message("错误信息！");
				return false;
			}finally {
				closeAll(null, pstmt, connection);
			}
	}

	//通用的查：返回值是一个集合
	public static ResultSet executeQuery(String sql,Object[] params){
		 try {		
			 pstmt=createPreparedStatement(sql, params);
			 rs=pstmt.executeQuery();
			 return rs;
		 }catch(ClassNotFoundException e){
			 e.getStackTrace();
				return null;
		 }catch(SQLException e) {
				e.getStackTrace();
				return null;
			}catch(Exception e) {
				e.getStackTrace();
				message("错误信息！");
				return null;
		}
			
	}

	//查询总数
	public static int getTotalCount(String sql) {
		int count=-1;
		try {
			pstmt=createPreparedStatement(sql, null);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				count=rs.getInt(1);
			}		
		}catch(ClassNotFoundException e){
			 e.getStackTrace();				
		 }catch(SQLException e) {
				e.getStackTrace();				
			}catch(Exception e) {
				e.getStackTrace();				
		}
		return count;
	}
	
	public static void closeAll(ResultSet rs,Statement stmt,Connection connection) {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(connection!=null) connection.close();
		}catch (SQLException e) {
			e.getStackTrace();
		}
		
	}
	
	private static void message(String msg) {
		int type=JOptionPane.YES_NO_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null, msg,title,type);		
	}
}
