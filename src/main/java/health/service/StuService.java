package health.service;

import com.github.pagehelper.PageInfo;
import health.bean.delList;
import health.model.student;

import java.util.List;

public interface StuService {
    int insert(student record);
    PageInfo<student> getStuList(int page,int limit);
       void delByDateAndTelephone(delList data);
}
