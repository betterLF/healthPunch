package health.service;

import com.github.pagehelper.PageInfo;
import health.bean.delList;
import health.model.student;

import java.util.List;

public interface StuService {
    int insert(student record);
    PageInfo<student> getStuList(int page,int limit);
    PageInfo<student> getStuList_fever(int page,int limit);
    PageInfo<student> getStuList_contact(int page,int limit);
    PageInfo<student> getStuList_situation(int page,int limit);
    void delByDateAndTelephone(delList data);
    int insertPseudoData(delList data);
    PageInfo<student> getStuListByClassId(int page,int limit,student student);
    PageInfo<student> getStuListByStudentName(int page,int limit,student student);
}
