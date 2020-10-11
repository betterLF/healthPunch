package health.service;

import health.mapper.studentMapper;
import health.model.student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lifei
 * @date 2020/10/11 7:35
 */
@Service("stuService")
public class StuServiceImpl implements StuService {
    @Resource
    private studentMapper studentMapper;

    @Override
    public int insert(student record) {
        return studentMapper.insert(record);
    }
}
