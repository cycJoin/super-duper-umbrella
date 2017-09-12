package com.cn.base.common.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.base.common.dao.UnloginDao;
import com.cn.base.common.service.CommonService;

@Service("commonService")
public class CommonServiceImpl implements CommonService {
    @Autowired 
    private UnloginDao unloginDao;
	public void saveUser() {
		Map map = new HashMap();
       System.out.println("saveUser");
	}
	public List getUnloginUrl(){
		return unloginDao.getUnloginUrl();
	}

}
