package pers.zdl1004.exam.sys.services.interfaces;

import pers.zdl1004.exam.common.PageControl;
import pers.zdl1004.exam.common.Pager;
import pers.zdl1004.exam.model.Subject;


public interface ISubjectService {

	/**
	 * 增加一个试题
	 * @param subject
	 * @return
	 */
	public Integer addsubject(Subject subject);
	
	/**
	 * 查询试题列表
	 * @param subject
	 * @param pc
	 * @return
	 */
	public Pager<Subject> list(Subject subject, PageControl pc);
	
	
	/**
	 * 获取试题详细信息
	 * @param subject
	 * @return
	 */
	public Subject detail(Subject subject);
	
	/**
	 * 修改试题
	 * @param subject
	 * @return
	 */
	public Integer edit(Subject subject);
}
