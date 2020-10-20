package pers.zdl1004.exam.sys.services.impl;

import java.util.List;

import pers.zdl1004.exam.common.PageControl;
import pers.zdl1004.exam.common.Pager;
import pers.zdl1004.exam.model.Paper;
import pers.zdl1004.exam.model.Subject;
import pers.zdl1004.exam.sys.services.interfaces.IPaperService;
import pers.zdl1004.exam.sys.dao.interfaces.IPaperDao;
import pers.zdl1004.exam.sys.dao.impl.PaperDao;

public class PaperService implements IPaperService {
	
	IPaperDao dao = new PaperDao();
	@Override
	public Integer addpaper(Paper paper) {
		// TODO Auto-generated method stub
		return dao.addpaper(paper);
	}
	@Override
	public Pager<Paper> list(Paper paper, PageControl pc) {
		// TODO Auto-generated method stub
		return dao.list(paper, pc);
	}
	@Override
	public List<Subject> subjectlist(Paper paper) {
		// TODO Auto-generated method stub
		return dao.subjectlist(paper);
	}
	@Override
	public List<Paper> list(Paper paper) {
		// TODO Auto-generated method stub
		return dao.list(paper);
	}
}
