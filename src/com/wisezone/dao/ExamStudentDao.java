package com.wisezone.dao;

import com.wisezone.bean.ExamStudent;

import java.util.List;

/**
 * ExamStudentDao
 * 包括对数据库examstudent表的基本的
 * 增、删、改、查的方法
 */
public interface ExamStudentDao extends CommonDao<ExamStudent>{
    /**
     * 全查
     * @return
     */
    List<ExamStudent> queryAll();
}
