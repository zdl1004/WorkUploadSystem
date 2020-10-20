package pers.zdl1004.exam.sys.dao.interfaces;

import pers.zdl1004.exam.common.PageControl;
import pers.zdl1004.exam.common.Pager;
import pers.zdl1004.exam.model.Subject;


public interface ISubjectDao {

	/**
	 * 增加一个试题
	 * @param subject
	 * @return
	 */
	public Integer addsubject(Subject subject);
	/**
	 * 查询全部试题列表
	 * @param subject
	 * @return
	 */
	public Pager<Subject> list(Subject subject, PageControl pc);
	/**
	 * 修改试题
	 * @param fun
	 * @return
	 */
	public Integer edit(Subject subject);
	
	/**
	 * 查询一个试题详情
	 * @param fun
	 * @return
	 */
	public Subject detail(Subject subject);
	
}
