package org.util;

import java.util.List;

import org.entity.Admin;

public class Page {
	private int currentPage;//当前页
	private int pageSize;//页面大小
	private int totalCount;//总数据
	private int totalPage;//总页数
	


	private List<Admin> admins;//当前页的数据集合
	
	public Page(int currentPage, int pageSize, int totalCount, int totalPage,List<Admin> admins) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.admins = admins;
	}

	public Page() {

	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		//总页数=数据总数%页面大小==0？数据总数/页面大小：数据总数/页面大小+1
		this.totalPage=this.totalCount%this.pageSize==0?this.totalCount/this.pageSize:this.totalCount/this.pageSize+1;
	}
	public int getTotalPage() {
		return totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}

	}
	

