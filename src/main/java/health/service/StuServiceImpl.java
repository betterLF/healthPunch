package health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import health.bean.delList;
import health.mapper.studentMapper;
import health.model.student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lifei
 * @date 2020/10/11 7:35
 */
//@Service("stuService")
@Service
public class StuServiceImpl implements StuService {
    @Resource
    private studentMapper studentMapper;

    @Override
    public int insert(student record) {
        return studentMapper.insert(record);
    }

    @Override
    public PageInfo<student> getStuList(int page, int limit) {
        PageHelper.startPage(page, limit);
        List<student> allStudents = studentMapper.getAllStudents();
        PageInfo<student> pageInfo=new PageInfo<student>(allStudents);
        return pageInfo;
    }

    @Override
    public void delByDateAndTelephone(delList data) {
        studentMapper.delByDateAndTelephone(data);
    }
}
