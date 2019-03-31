package com.test.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.user.model.User;
import com.test.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/get")
	public String get(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		User user = userService.getUserById(id);
		model.addAttribute("user", user.toString());
		return "user";
	}
	
	@RequestMapping(value="/getUserById", produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getUserById(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		User user = userService.getUserById(id);
		System.out.println(user.toString());
		return user.toString();
	}
	
	@RequestMapping(value="/getAllUser", produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getAllUser() {
		List<User> list = userService.getAllUser();
		return list.toString();
	}
	
}
