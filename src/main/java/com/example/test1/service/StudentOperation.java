package com.example.test1.service;


import com.example.test1.dao.entity.Student;

import java.util.List;

public interface StudentOperation {
    public List<Student> getStudentList();

    public void addStudent(Student student);

    //获取分页数据
    public List<Student> getStudentList(int page, int perPage);

    //获取学生总数
    public int getStudentCount();

    public boolean deleteStudent(List<Student> data);
    //Amis框架单个更新学生
    public int updateStudent(Student student);

    //Amis框架单个删除学生
    public boolean deleteStudentAmis(Long id);

    //Amis框架添加单个学生
    public boolean addStudentAmis(Student student);

    //Amis框架搜索学生
    public List<Student> searchStudent(Long sno, String name, Integer sage, String ssex, String grade, Integer classs, Boolean isAnd);
}
