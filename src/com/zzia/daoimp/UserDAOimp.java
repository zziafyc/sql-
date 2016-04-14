package com.zzia.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zzia.beans.User;
import com.zzia.dao.IUserDAO;
import com.zzia.utils.C3P0Util;

public class UserDAOimp implements IUserDAO {

	@Override
	public List<User> getAllUser(int type) {

		List<User> list = new ArrayList<User>();
		Connection connection = C3P0Util.getConnection();
		PreparedStatement psmt = null;
		ResultSet result = null;
		String sql = "select * from user where type=?";
		try {
			psmt = connection.prepareStatement(sql);
			psmt.setInt(1, type);
			result = psmt.executeQuery();
			while (result.next()) {
				int id = result.getInt(1);
				String telephone = result.getString(2);
				String password = result.getString(3);
				String realName = result.getString(4);
				String nickName = result.getString(5);
				String sex = result.getString(6);
				int age = result.getInt(7);
				int myType = result.getInt(8);
				String image_url = result.getString(9);
				String qr_code_url = result.getString(10);
				User user = new User(id, telephone, password, realName,
						nickName, sex, age, myType, image_url, qr_code_url);
				list.add(user);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			C3P0Util.close(result, psmt, connection);
		}

		return list;
	}

	// 找到所有海带，或者普通人的信息
	public int getAllCount(int type) {

		Connection connection = C3P0Util.getConnection();
		PreparedStatement psmt = null;
		ResultSet result = null;
		int count = 0;
		String sql = "select count(*) from user where type=?";
		try {
			psmt = connection.prepareStatement(sql);
			psmt.setInt(1, type);
			result = psmt.executeQuery();
			if (result.next()) {
				count = result.getInt(1);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			C3P0Util.close(result, psmt, connection);
		}

		return count;
	}

	@Override
	public boolean doInsert(User user) {
		boolean flag = false;
		Connection connection = C3P0Util.getConnection();
		PreparedStatement psmt = null;
		String sql = "insert into user(telephone,password,realname,nickname, sex,age, type,image_url,qr_code_url)"
				+ " values(?,?,?,?,?,?,?,?,?)";
		try {
			psmt = connection.prepareStatement(sql);

			psmt.setString(1, user.gettelephone());
			psmt.setString(2, user.getPassword());
			psmt.setString(3, user.getRealName());
			psmt.setString(4, user.getNickName());
			psmt.setString(5, user.getSex());
			psmt.setInt(6, user.getAge());
			psmt.setInt(7, user.getType());
			psmt.setString(8, user.getImage_url());
			psmt.setString(9, user.getQr_code_url());
			if (psmt.executeUpdate() > 0) {
				flag = true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			C3P0Util.close(null, psmt, connection);
		}
		return flag;
	}

	@Override
	public boolean doDelete(int id) {

		boolean flag = false;
		Connection connection = C3P0Util.getConnection();
		PreparedStatement psmt = null;
		String sql = "delete from user where id=?";
		try {
			psmt = connection.prepareStatement(sql);
			psmt.setInt(1, id);
			if (psmt.executeUpdate() > 0) {
				flag = true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			C3P0Util.close(null, psmt, connection);
		}
		return flag;
	}

	@Override
	public boolean doUpdate(int id,String telephone){

		boolean flag = false;
		Connection connection = C3P0Util.getConnection();
		PreparedStatement psmt = null;
		String sql = "update user set telephone=? where id=?";
		try {
			psmt = connection.prepareStatement(sql);
			psmt.setString(1, telephone);
			psmt.setInt(2, id); 
			if (psmt.executeUpdate() > 0) {
				flag = true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			C3P0Util.close(null, psmt, connection);
		}
		return flag;
	}

	@Override
	public boolean doQuery(int id) {

		boolean flag = false;
		Connection connection = C3P0Util.getConnection();
		PreparedStatement psmt = null;
		ResultSet result = null;
		String sql = "select * from user where id=? limit 1";
		try {

			psmt = connection.prepareStatement(sql);
			psmt.setInt(1, id);
			result = psmt.executeQuery();
			if (result.next()) {
				flag = true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			C3P0Util.close(result, psmt, connection);
		}
		return flag;
	}

	@Override
	public boolean doLogin(String telephone, String password) {

		boolean flag = false;
		Connection connection = C3P0Util.getConnection();
		PreparedStatement psmt = null;
		ResultSet result = null;
		String sql = "select * from user where telephone=? and password=? limit 1";
		try {

			psmt = connection.prepareStatement(sql);
			psmt.setString(1, telephone);
			psmt.setString(2, password);
			result = psmt.executeQuery();
			if (result.next()) {
				flag = true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			C3P0Util.close(result, psmt, connection);
		}
		return flag;
	}

	@Override
	public List<User> showCurrentPage(int currentPage, int pageSize,
			int type) {

		List<User> list = new ArrayList<User>();

		Connection connection = C3P0Util.getConnection();
		PreparedStatement psmt = null;
		ResultSet result = null;
		String sql = "select * from user where type=?  limit ?,?";
		try {
			psmt = connection.prepareStatement(sql);
			psmt.setInt(1, type);
			psmt.setInt(2, (currentPage - 1) * pageSize);
			psmt.setInt(3, pageSize);
			
			result = psmt.executeQuery();
			while (result.next()) {
				int id = result.getInt(1);
				String telephone = result.getString(2);
				String password = result.getString(3);
				String realName = result.getString(4);
				String nickName = result.getString(5);
				String sex = result.getString(6);
				int age = result.getInt(7);
				int myType = result.getInt(8);
				String image_url = result.getString(9);
				String qr_code_url = result.getString(10);
				User student = new User(id, telephone, password, realName,
						nickName, sex, age, myType, image_url, qr_code_url);
				list.add(student);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			C3P0Util.close(result, psmt, connection);
		}

		return list;
	}

}
