package com.bjsxt.app.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bjsxt.app.service.VipService;

@Service
public class VipServiceImpl implements VipService{

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public Map<String, Object> loadVipOrdersList(Integer page,
			Integer rows,String token) {
		//consumer向zuul网关发送请求
		String url="http://zuul-server/ords/orders?page="+page+
				"&rows="+rows+"&token="+token;
		return restTemplate.getForObject(url, Map.class);
		 
	}

}
