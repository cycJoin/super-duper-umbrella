package com.cn.base.common.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cn.base.common.dao.BaseDao;
import com.cn.base.common.dao.UnloginDao;
@Component("unloginDao")
public class UnloginDaoImpl implements UnloginDao {
    @Autowired
    private BaseDao baseDao;
	public List getUnloginUrl() {
		return (List) baseDao.queryForList("selectUnloginUrl",null);
	}

}
