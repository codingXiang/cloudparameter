package com.digiwin.cloudparameter.service;

import com.digiwin.app.data.DWDataSet;
import com.digiwin.app.service.AllowAnonymous;
import com.digiwin.app.service.DWService;

public interface ICloudParameterService extends DWService {
	@AllowAnonymous
	public Object getDomainName() throws Exception;
	@AllowAnonymous
	public Object postApplicationName(DWDataSet dataset) throws Exception;
}
