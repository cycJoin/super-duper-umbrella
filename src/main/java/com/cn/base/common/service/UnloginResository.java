package com.cn.base.common.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cn.base.common.dto.Unlogin;

public interface UnloginResository extends JpaRepository<Unlogin, Long> {
      
}
