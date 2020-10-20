package pers.zdl1004.exam.sys.services.impl;

import java.util.List;

import pers.zdl1004.exam.common.PageControl;
import pers.zdl1004.exam.common.Pager;
import pers.zdl1004.exam.model.Studentpaper;
import pers.zdl1004.exam.model.Subject;
import pers.zdl1004.exam.sys.dao.impl.StudentpaperDao;
import pers.zdl1004.exam.sys.dao.interfaces.IStudentpaperDao;
import pers.zdl1004.exam.sys.services.interfaces.IStudentpaperService;

public class StudentpaperService implements IStudentpaperService {
	IStudentpaperDao dao = new StudentpaperDao();

	@Override
	public Integer addPaper(Studentpaper studentpaper) {
		// TODO Auto-generated method stub
		return dao.addPaper(studentpaper);
	}

	@Override
	public Pager<Subject> list(Studentpaper studentpaper,PageControl pc){
		// TODO Auto-generated method stub
		return dao.list(studentpaper, pc);
	}

	@Override
	public List<Studentpaper> listByRightcount(Studentpaper studentpaper) {
		// TODO Auto-generated method stub
		return dao.listByRightcount(studentpaper);
	}

	@Override
	public List<Studentpaper> StudentPaperList(Studentpaper studentpaper) {
		// TODO Auto-generated method stub
		return dao.StudentPaperList(studentpaper);
	}



}
