package cc.ngback.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cc.ngback.model.User;
import cc.ngback.util.JsonResult;

@Controller
@ResponseBody
public class UserController {
	@RequestMapping(value="/user/list", method = RequestMethod.GET)
	public JsonResult listUser() {
		List<User> users= new ArrayList<User>();
		users.add(new User("a", "1"));
		users.add(new User("b", "2"));
		return JsonResult.build(200, "ok", users);
	}
}
