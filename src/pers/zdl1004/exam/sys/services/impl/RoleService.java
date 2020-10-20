package pers.zdl1004.exam.sys.services.impl;

import java.util.ArrayList;
import java.util.List;

import pers.zdl1004.exam.common.PageControl;
import pers.zdl1004.exam.common.Pager;
import pers.zdl1004.exam.model.SysFunction;
import pers.zdl1004.exam.model.Sysrole;
import pers.zdl1004.exam.sys.dao.impl.RoleDao;
import pers.zdl1004.exam.sys.dao.interfaces.IRoleDao;
import pers.zdl1004.exam.sys.services.interfaces.IRoleService;

public class RoleService implements IRoleService {

	IRoleDao dao = new RoleDao();
	
	public Pager<Sysrole> list(Sysrole role, PageControl pc) {
		return dao.list(role, pc);
	}

	public Integer add(Sysrole role) {
		return dao.add(role);
	}

	public List<SysFunction> initfunlist(Sysrole role) {
		return dao.initfunlist(role);
	}

	public Sysrole detail(Sysrole role) {
		return dao.detail(role);
	}

	public Integer saveright(String roleid, String[] funids) {
		return dao.saveright(roleid, funids);
	}
	public Integer edit(Sysrole role) {
		return dao.edit(role);
	}

	public ArrayList<Sysrole> getALL() {
		// TODO Auto-generated method stub
		return dao.getALL();
	}
}
