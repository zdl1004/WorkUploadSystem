package pers.zdl1004.exam.sys.services.interfaces;

import java.util.List;

import pers.zdl1004.exam.common.PageControl;
import pers.zdl1004.exam.common.Pager;
import pers.zdl1004.exam.model.SysFunction;
import pers.zdl1004.exam.model.Sysrole;
import pers.zdl1004.exam.model.Sysuser;

public interface IUserService {

	/**
	 * 登陆
	 * @param user
	 * @return
	 */
	public Sysuser login(Sysuser user);
	/**
	 * 初始化用户功能列表
	 * @param user
	 * @return
	 */
	public List<SysFunction> initpage(Sysuser user);
	/**
	 * 增加用户
	 * @param user
	 * @return
	 */
	public Integer add(Sysuser user);
	/**
	 * 获取系统用户列表
	 * @param user
	 * @return
	 */
	public Pager<Sysuser> list(Sysuser user, PageControl pc);
	/**
	 * 获取用户详细信息
	 * @param user
	 * @return
	 */
	public Sysuser detail(Sysuser user);
	/**
	 * 修改用户功能
	 * @param user
	 * @return
	 */
	public Integer edit(Sysuser user);
	/**
	 * 修改用户密码功能
	 * @param user
	 * @return
	 */
	public Integer editpwd(Sysuser user);
	
	/**
	 * 学生登陆
	 * @param user
	 * @return
	 */
	public Sysuser stulogin(Sysuser user);
}
