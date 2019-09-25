package com.bjsxt.app.service;

import java.util.Map;

public interface VipService {

	/***
	 * 实现会员订单信息分页查询
	 */
	public Map<String,Object> loadVipOrdersList(Integer page,Integer rows,String token);
}
