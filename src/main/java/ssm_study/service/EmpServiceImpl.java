package ssm_study.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ssm_study.mapper.employeeMapper;
import ssm_study.model.employee;
import ssm_study.model.employeeExample;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lifei
 * @date 2020/7/31 8:35
 */
@Service("empService")
public class EmpServiceImpl implements EmpService {
      @Resource
      private employeeMapper employeeMapper;

      @Override
      public employee getEmpByEID(Integer eid){
          return employeeMapper.getEmpByEID(eid);
      }

    @Override
    public List<employee> getAllEmp() {
        return employeeMapper.getAllEmp();
    }
    @Override
        public int countByExample(employeeExample example) {

        return employeeMapper.countByExample(example);
        }

        @Override
        public int deleteByExample(employeeExample example) {
            return 0;
        }

        @Override
        public int deleteByPrimaryKey(Integer eid) {
            return employeeMapper.deleteByPrimaryKey(eid);
        }

        @Override
        public int insert(employee record) {
            return 0;
        }

        @Override
        public int insertSelective(employee record) {
            return 0;
        }

        @Override
        public List<employee> selectByExample(employeeExample example) {
            return null;
        }

        @Override
        public employee selectByPrimaryKey(Integer eid) {
            return null;
        }

        @Override
        public int updateByExampleSelective(employee record, employeeExample example) {
            return 0;
        }

        @Override
        public int updateByExample(employee record, employeeExample example) {
            return 0;
        }

        @Override
        public int updateByPrimaryKeySelective(employee record) {
            return 0;
        }

        @Override
        public int updateByPrimaryKey(employee record) {
            return employeeMapper.updateByPrimaryKey(record);
        }
    }

