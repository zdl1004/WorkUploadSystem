package pers.zdl1004.exam.sys.services.impl;

import pers.zdl1004.exam.common.PageControl;
import pers.zdl1004.exam.common.Pager;
import pers.zdl1004.exam.model.Subject;

import pers.zdl1004.exam.sys.dao.impl.SubjectDao;

import pers.zdl1004.exam.sys.dao.interfaces.ISubjectDao;

import pers.zdl1004.exam.sys.services.interfaces.ISubjectService;

public class SubjectService implements ISubjectService {

	ISubjectDao dao = new SubjectDao();
	
	public Integer addsubject(Subject subject) {
		try{
			return dao.addsubject(subject);
		}catch(Exception e){
			throw new RuntimeException();
		}
		
	}

	public Pager<Subject> list(Subject subject, PageControl pc) {
		return dao.list(subject, pc);
	}

	public Integer edit(Subject subject) {
		return dao.edit(subject);
	}

	public Subject detail(Subject subject) {
		// TODO Auto-generated method stub
		return dao.detail(subject);
	}

}

