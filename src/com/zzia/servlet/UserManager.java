package com.zzia.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzia.beans.User;
import com.zzia.dao.IUserDAO;
import com.zzia.daoimp.UserDAOimp;

@WebServlet("/userManager")
public class UserManager extends HttpServlet {

	private static final long serialVersionUID = 1582057846594285258L;

	public UserManager() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		// 查看操作

		int currentPage = 1;// 默认当前页面为1
		int pageSize = 3; // 默认每页显示3条数据
		String temp1 = request.getParameter("currentPage");
		String temp2 = request.getParameter("pageSize");

		if (temp1 != null) {
			currentPage = Integer.parseInt(temp1);
			// 设置下一页的属性
		}
		if (temp2 != null) {
			pageSize = Integer.parseInt(temp2);
		}

		// 开始设置当前页
		request.setAttribute("currentPage", currentPage);

		// 如果点击了下一页
		String nextPage = request.getParameter("nextPage");
		if (nextPage != null) {

			currentPage = Integer.parseInt(nextPage);
			request.setAttribute("currentPage", currentPage);

		}

		// 如果点击了上一页
		String frontPage = request.getParameter("frontPage");
		if (frontPage != null) {

			currentPage = Integer.parseInt(frontPage);
			request.setAttribute("currentPage", currentPage);
		}

		// 已知当前页，开始调取数据

		IUserDAO userDAO = new UserDAOimp();

		// 得到一共有多少条数据
		int count = userDAO.getAllCount(1);
		request.setAttribute("count", count);

		// 得到当前页面该显示的数据，放到一个result里面,条件是当pageSize和currentPage都大于0时
		if (pageSize > 0 && currentPage > 0) {
			List<User> list = userDAO.showCurrentPage(currentPage, pageSize, 1);
			request.setAttribute("result", list);

			// 设置每页显示多少条数据
			request.setAttribute("pageSize", pageSize);

			// 进行跳转
			request.getRequestDispatcher("/show_haidai.jsp").forward(request,
					response);
		}
	}

}
