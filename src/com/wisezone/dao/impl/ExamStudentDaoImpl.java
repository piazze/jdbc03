package com.wisezone.dao.impl;

import com.wisezone.bean.ExamStudent;
import com.wisezone.dao.ExamStudentDao;
import com.wisezone.util.DataSourceUtil;

import java.util.List;

public class ExamStudentDaoImpl implements ExamStudentDao {
    //指定数据源
    private DataSourceUtil util = DataSourceUtil.getInstance();

    @Override
    public int add(ExamStudent student) {
        //向examstudent表中插入数据的sql语句
        String sql = "insert into examstudent (type,id_card,exam_card,student_name,location,grade) values (?,?,?,?,?,?)";
        Object[] params = {student.getType(),student.getIdCard(),student.getExamCard(),student.getStudentName()
                ,student.getLocation(),student.getGrade()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int update(ExamStudent student) {
        String sql = "update examstudent set type=?,id_card=?,exam_card=?,student_name=?,location=?,grade=? where flow_id=?";
        Object[] params = {student.getType(),student.getIdCard(),student.getExamCard(),student.getStudentName()
                ,student.getLocation(),student.getGrade(),student.getFlowId()};
        return util.executeUpdate(sql,params);
    }

    @Override
    public int remove(int id) {
        String sql = "delete from examstudent where flow_id=?";
        return util.executeUpdate(sql,id);
    }

    @Override
    public ExamStudent queryOne(int id) {
        String sql = "select t.flow_id flowId,t.type,t.student_name studentName, t.exam_card examCard,t.grade,t.id_card idCard,t.location from examstudent t "
                + " where t.flow_id = ?";

        return util.queryOne(ExamStudent.class,sql,id);
    }

    @Override
    public List<ExamStudent> queryAll() {
        String sql = "select t.flow_id flowId,t.type,t.student_name studentName, t.exam_card examCard,t.grade,t.id_card idCard,t.location from examstudent t";
        List<ExamStudent> examStudents = util.queryList(ExamStudent.class, sql);
        return examStudents;
    }
}
