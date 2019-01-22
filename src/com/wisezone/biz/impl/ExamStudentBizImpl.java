package com.wisezone.biz.impl;

import com.wisezone.bean.ExamStudent;
import com.wisezone.biz.ExamStudentBiz;
import com.wisezone.dao.ExamStudentDao;
import com.wisezone.dao.impl.ExamStudentDaoImpl;

import java.util.List;

public class ExamStudentBizImpl implements ExamStudentBiz {
    //调用数据访问层的对象
    private ExamStudentDao dao = new ExamStudentDaoImpl();

    @Override
    public int add(ExamStudent student) {
        return dao.add(student);
    }

    @Override
    public int update(ExamStudent student) {
        return dao.update(student);
    }

    @Override
    public int remove(int flowId) {
        return dao.remove(flowId);
    }

    @Override
    public List<ExamStudent> queryAll() {
        return dao.queryAll();
    }

    @Override
    public ExamStudent queryOne(int flowId) {
        return dao.queryOne(flowId);
    }
}
