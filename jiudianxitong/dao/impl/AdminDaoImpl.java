package org.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dao.IAdminDao;
import org.entity.Admin;
import org.util.DBUtil;

public class AdminDaoImpl implements IAdminDao {

	//添加
		public boolean addAdmin(Admin admin) {
			String sql="insert into Admin(adm_id,adm_name,adm_sex,adm_tel,adm_password) values(?,?,?,?,?)";
			Object[] params= {admin.getAdm_id(),admin.getAdm_name(),admin.getAdm_sex(),admin.getAdm_tel(),admin.getAdm_password()};
			return DBUtil.executeUpdate(sql, params);
		}
		 //修改
		public boolean updateAdmin(int adm_tel,Admin admin) {
			String sql="update Admin set adm_id=?,adm_name=?,adm_sex=?,adm_password=? where adm_tel=?";
			Object[] params= {admin.getAdm_id(),admin.getAdm_name(),admin.getAdm_sex(),admin.getAdm_password(),adm_tel};
			return DBUtil.executeUpdate(sql, params);
		}
		public boolean updatePassword(int adm_tel,Admin admin) {
			String sql="update Admin set adm_password=? where adm_tel=?";
			System.out.println(admin.getAdm_password());
			Object[] params= {admin.getAdm_password(),adm_tel};
			return DBUtil.executeUpdate(sql, params);
			
		}
		//删除
		public boolean deleteAdmin(int adm_tel) {
			String sql="delete from Admin where adm_tel=?";
			Object[] params= {adm_tel};
			return DBUtil.executeUpdate(sql, params);
		}

		//查询
		//全部
		public  List<Admin> queryAllAdmins(){
		    PreparedStatement pstmt=null;
		    Admin admin =null;
			ResultSet rs=null;
			List<Admin> admins=new ArrayList<Admin>();
			 try {
				 String sql="select * from admin";
				 rs=DBUtil.executeQuery(sql, null);
			
				 while(rs.next()){					 						
				  int adm_id=rs.getInt("adm_id");
				  String adm_name=rs.getString("adm_name");
				  String adm_sex=rs.getString("adm_sex");
				  int adm_tel=rs.getInt("adm_tel");
				  String adm_password=rs.getString("adm_password");
				  admin=new Admin(adm_id,adm_name,adm_sex,adm_tel,adm_password);
				  admins.add(admin);
				 }
				 return admins;
			 }catch(SQLException e) {
					e.getStackTrace();
					return null;
				}catch(Exception e) {
					e.getStackTrace();
					return null;
			}finally {
				DBUtil.closeAll(rs,pstmt,DBUtil.connection);
			}
		}
		
		public  List<Admin> queryAdminBytel(int adm_tel){
			PreparedStatement pstmt=null;
			Admin admin =null;
			ResultSet rs=null;
			List<Admin> admins=new ArrayList<>();
			 try {
				 String sql="select * from admin where adm_tel=?";
		         Object[] params= {adm_tel};	        	       
			     rs=DBUtil.executeQuery(sql, params);          
				 while(rs.next()){
					 int adm_id=rs.getInt("adm_id");
					 String adm_name=rs.getString("adm_name");
					 String adm_sex=rs.getString("adm_sex");
					 int adm_tel1=rs.getInt("adm_tel");
					 String adm_password=rs.getString("adm_password");
					 admin=new Admin(adm_id,adm_name,adm_sex,adm_tel,adm_password);
					 
					 System.out.println(adm_id+adm_name+adm_sex+adm_tel1+adm_password);
					
					 admins.add(admin);
				 }
				 return admins;
			 }catch(SQLException e) {
					e.getStackTrace();
					return null;
				}catch(Exception e) {
					e.getStackTrace();
					return null;
			}finally {
				DBUtil.closeAll(rs,pstmt,DBUtil.connection);
			}
			
		}

		public  int login(Admin admin) {
			int result=-1;
			int flag=-1;
			
			ResultSet rs=null;
			PreparedStatement pstmt=null;
			try {
				String sql="select count(*) from admin where adm_tel=? and adm_password=?";
				Object[] params= {admin.getAdm_tel(),admin.getAdm_password()};
				 rs=DBUtil.executeQuery(sql, params);	 
				 if(rs.next()) {
					 result=rs.getInt(1);
				 }
				 if(result>0) {
					 return 1;
				 }else {
					 return 0;
				 }
			}catch(SQLException e) {
				e.printStackTrace();
				return -1;
			}catch(Exception e){
				e.printStackTrace();
				return -1;
			}finally{
				DBUtil.closeAll(rs,pstmt,DBUtil.connection);
			}		
		}
		
	
		
	  
		@Override
		public int getTotalCount() {
			String sql="select count(1) from admin";
			return DBUtil.getTotalCount(sql);
		}
		
		@Override
		public List<Admin> queryAdminByPage(int currentPage, int pageSize) {
			PreparedStatement pstmt=null;
			Admin admin =null;
			ResultSet rs=null;
			List<Admin> admins=new ArrayList<Admin>();
			try {
				String sql="select * from "
						+"("+"select rownum r,t.* from"
						+"(select a.* from admin a order by adm_id asc)t"
						+"where rownum<=?"//页数*页面大小
						+")"
						+"where r>=?";//（页数-1）*页面大小+1
				Object[] params= {currentPage*pageSize,(currentPage-1)*pageSize+1};	
				rs=DBUtil.executeQuery(sql, params);
				System.out.println(rs);
				 while(rs.next()){					 						
					  int adm_id=rs.getInt("adm_id");
					  String adm_name=rs.getString("adm_name");
					  String adm_sex=rs.getString("adm_sex");
					  int adm_tel=rs.getInt("adm_tel");
					  String adm_password=rs.getString("adm_password");
					  admin=new Admin(adm_id,adm_name,adm_sex,adm_tel,adm_password);
					  System.out.println("^^"+adm_id+adm_name+adm_sex+adm_tel+adm_password);
					  admins.add(admin);
					 }
				 System.out.println("4444"+admins);
				 return admins;			
			}catch(SQLException e) {
				e.getStackTrace();
				return null;
			}catch(Exception e) {
				e.getStackTrace();
				return null;
		}finally {
			DBUtil.closeAll(rs,pstmt,DBUtil.connection);
		}
			
    }
	
	    
}
