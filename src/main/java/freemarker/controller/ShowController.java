package freemarker.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import freemarker.domain.User;

/**
 *freemarker常用数据类型展示测试
 *@author  wsz
 *@createdTime 2018年3月30日
*/
@Controller
public class ShowController {

	@RequestMapping("/show")
	public String show(@RequestParam(name="username",defaultValue="hahah") String username, Model model) {
		System.out.println(username);
		model.addAttribute("username", username);
		model.addAttribute("user", initUser());
		return "show";
	}
	
	public User initUser() {
		User user = new User();
		user.setId(321);
		user.setUsername("freemarker");
		user.setPrice(100.00d);
		user.setBirth(new Date());
		
		List<String> list = new ArrayList<String>();
		list.add("list1");
		list.add("list2");
		list.add("list3");
		list.add("list4");
		user.setList(list);
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(9);
		set.add(8);
		set.add(7);
		set.add(6);
		set.add(5);
		user.setSet(set);
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("map1", "map1");
		map.put("map2", "map2");
		map.put("map3", "map3");
		user.setMap(map);
		
		return user;
	}
}
