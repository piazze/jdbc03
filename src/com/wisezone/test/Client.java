package com.wisezone.test;

import com.wisezone.bean.ExamStudent;
import com.wisezone.biz.ExamStudentBiz;
import com.wisezone.biz.impl.ExamStudentBizImpl;

import java.util.List;

public class Client {
    //调用业务逻辑层
    public static ExamStudentBiz biz = new ExamStudentBizImpl();

    public static void add(){
        ExamStudent student = new ExamStudent();
        student.setExamCard("222222");
        student.setIdCard("33333");
        student.setGrade(85);
        student.setLocation("北京");
        student.setStudentName("王大錘");
        student.setType(4);
        int result = biz.add(student);
        System.out.println(result > 0 ? "插入成功！" : "插入失败!");
    }

    public static void queryOne(){
        ExamStudent examStudent = biz.queryOne(6);
        System.out.println(examStudent);
    }

    public static void update(){
        ExamStudent examStudent = biz.queryOne(6);
        examStudent.setStudentName("李麻子");
        examStudent.setLocation("渝中区");
        int update = biz.update(examStudent);
        System.out.println(update > 0 ? "修改成功！":"修改失败！");
    }

    public static void remove(){
        int remove = biz.remove(6);
        System.out.println(remove > 0 ? "删除成功！":"删除失败！");
    }

    public static void queryAll(){
        List<ExamStudent> list = biz.queryAll();
        for (ExamStudent student : list) {
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
        //测试添加
        //add();

        //测试根据id查询
        //queryOne();

        //测试修改的方法
        //update();

        //测试根据id删除
        //remove();

        //测试查询全部
        queryAll();
    }
}
