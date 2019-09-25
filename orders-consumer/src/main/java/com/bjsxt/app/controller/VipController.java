package com.bjsxt.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bjsxt.app.service.VipService;

@Controller
public class VipController {

	//注入VipService
	@Autowired
	private VipService vipService;
	
	/***
	 * 处理会员订单信息分页查询请求
	 */
	@GetMapping("/vips")
	public String loadVipOrdersList(
			@RequestParam(defaultValue="1") Integer page,
			@RequestParam(defaultValue="3") Integer rows,
			String token,
			Model model){
		Map<String, Object> result = vipService.loadVipOrdersList(page, rows,token);
		model.addAttribute("list", result.get("list"));
		model.addAttribute("pages", result.get("pages"));
		model.addAttribute("total", result.get("total"));
		model.addAttribute("page", page);
		model.addAttribute("token", token);
		
		return "/index.jsp";
	}
}
