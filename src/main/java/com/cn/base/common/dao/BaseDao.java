package com.cn.base.common.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
//@Repository("baseDao")
public class BaseDao extends SqlSessionDaoSupport  {
  
	public Object queryForList(String sql,Object params){
		return this.getSqlSession().selectList(sql, params);
	}
}
