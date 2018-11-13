package com.digiwin.cloudparameter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.digiwin.app.dao.DWDao;
import com.digiwin.app.dao.DWQueryInfo;
import com.digiwin.app.dao.DWServiceResultBuilder;
import com.digiwin.app.data.DWDataSet;
import com.digiwin.cloudparameter.service.ICloudParameterService;

public class CloudParameterServiceImpl implements ICloudParameterService {
	@Autowired
	@Qualifier("Dao")
	private DWDao dao;

	public Object getDomainName() throws Exception {
		// TODO Auto-generated method stub
		DWQueryInfo queryInfo = new DWQueryInfo();

		Object result = this.dao.select(queryInfo, "select * from cloudparameter");
		return DWServiceResultBuilder.build(result);
	}

	@Override
	public Object postApplicationName(DWDataSet dataset) throws Exception {
		// TODO Auto-generated method stub
		Object result = this.dao.execute(dataset);
		return DWServiceResultBuilder.build(result);

	}
}
