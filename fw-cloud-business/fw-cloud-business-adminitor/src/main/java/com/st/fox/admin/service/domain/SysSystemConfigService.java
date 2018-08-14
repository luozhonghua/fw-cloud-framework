package com.st.fox.admin.service.domain;

import com.st.fox.admin.service.model.SysSystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.fox.admin.service.base.BaseServiceImpl;
import com.st.fox.admin.service.dao.SysSystemConfigDao;
import tk.mybatis.mapper.common.Mapper;
@Service
public class SysSystemConfigService extends BaseServiceImpl<SysSystemConfig>{
	@Autowired
	private SysSystemConfigDao sysSystemConfigDao;
	
	@Override
	public Mapper<SysSystemConfig> getMapper() {
		return sysSystemConfigDao;
	}

}
