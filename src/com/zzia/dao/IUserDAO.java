package com.zzia.dao;

import java.util.List;

import com.zzia.beans.User;


public interface IUserDAO {
		//获取所有的用户信息(海带，还是普通用户)
		public abstract List<User> getAllUser(int type);
		//得到用户的总量
		public abstract int getAllCount(int type);
		//增加一个用用户
		public abstract boolean doInsert(User user);
		//删除某一个用户的信息
		public abstract boolean doDelete(int id);
		
		//修改某一个用户的信息,根据id修改电话
		public abstract boolean doUpdate(int id,String telephone);
		
		//查询某一个用户是否存在
		public abstract boolean doQuery(int id);
		
		//查询登录是否成功
		public abstract boolean doLogin(String telephone,String password);
		
		//显示当前页面的数据
		
		public abstract List<User> showCurrentPage(int currentPage,int pageSize,int type);
		//其中currentPage代表当前页，而pageSize代表每页显示多少条数据
}
