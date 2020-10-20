package pers.zdl1004.exam.sys.services.impl;

import pers.zdl1004.exam.common.PageControl;
import pers.zdl1004.exam.common.Pager;
import pers.zdl1004.exam.model.SysFunction;
import pers.zdl1004.exam.sys.dao.impl.FunDao;
import pers.zdl1004.exam.sys.dao.interfaces.IFunDao;
import pers.zdl1004.exam.sys.services.interfaces.IFunService;

public class FunService implements IFunService {

	IFunDao dao = new FunDao();
	
	public Integer addfun(SysFunction fun) {
		return dao.addfun(fun);
	}

	public Pager<SysFunction> list(SysFunction fun, PageControl pc) {
		return dao.list(fun, pc);
	}

	public SysFunction detail(SysFunction fun) {
		return dao.detail(fun);
	}

	public Integer edit(SysFunction fun) {
		return dao.edit(fun);
	}

}
