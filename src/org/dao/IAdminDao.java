package org.dao;

import java.util.List;

import org.entity.Admin;

public interface  IAdminDao {


	//添加
	public boolean addAdmin(Admin admin);
	 //修改
	public boolean updateAdmin(int adm_tel,Admin admin);
	public boolean updatePassword(int adm_tel,Admin admin);
	//删除
	public boolean deleteAdmin(int adm_tel);
	//查询
	//全部
	public  List<Admin> queryAllAdmins();
	
	public  List<Admin> queryAdminBytel(int adm_tel);

	public  int login(Admin admin);
	
	//查询总数
	public  int getTotalCount();
		
		//currentPage:当前页（页码）pagesize页面大小（每一页的数据条数）
	public List<Admin> queryAdminByPage(int currentPage,int pageSize);
}
