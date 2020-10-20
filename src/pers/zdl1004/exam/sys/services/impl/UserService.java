package pers.zdl1004.exam.sys.services.impl;

import java.util.List;

import pers.zdl1004.exam.common.PageControl;
import pers.zdl1004.exam.common.Pager;
import pers.zdl1004.exam.model.SysFunction;
import pers.zdl1004.exam.model.Sysrole;
import pers.zdl1004.exam.model.Sysuser;
import pers.zdl1004.exam.sys.dao.impl.UserDao;
import pers.zdl1004.exam.sys.dao.interfaces.IUserDao;
import pers.zdl1004.exam.sys.services.interfaces.IUserService;

public class UserService implements IUserService {

	IUserDao dao = new UserDao();
	
	public Sysuser login(Sysuser user) {
		return dao.login(user);
	}

	public List<SysFunction> initpage(Sysuser user) {
		return dao.initpage(user);
	}
	public Pager<Sysuser> list(Sysuser user, PageControl pc) {
		return dao.list(user, pc);
	}

	public Integer add(Sysuser user) {
		try{
			return dao.add(user);
		}catch(Exception e){
			throw new RuntimeException();
		}
		
	}
	public Sysuser detail(Sysuser user) {
		return dao.detail(user);
	}
	public Integer edit(Sysuser user) {
		return dao.edit(user);
	}

	public Integer editpwd(Sysuser user) {
		// TODO Auto-generated method stub
		return dao.editpwd(user);
	}
	public Sysuser stulogin(Sysuser user) {
		return dao.stulogin(user);
	}
}
