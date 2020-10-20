package pers.zdl1004.exam.sys.services.interfaces;

import java.util.List;

import pers.zdl1004.exam.common.PageControl;
import pers.zdl1004.exam.common.Pager;
import pers.zdl1004.exam.model.Paper;
import pers.zdl1004.exam.model.Subject;

public interface IPaperService {
	/**
	 * 生成试卷功能
	 * @param paper
	 * @return
	 */
	public Integer addpaper(Paper paper);
	/**
	 * 查询全部试题
	 * @param paper
	 * @return
	 */
	public Pager<Paper> list(Paper paper, PageControl pc);
	
	/**
	 * 查询试题内容
	 * @param paper
	 * @return
	 */
	public List<Subject> subjectlist(Paper paper);
	
	/**
	 * 查询全部试题(首页)
	 * @param paper
	 * @return
	 */
	public List<Paper> list(Paper paper);
}
