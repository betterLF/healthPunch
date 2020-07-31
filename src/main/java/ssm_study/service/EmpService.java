package ssm_study.service;

import org.apache.ibatis.annotations.Param;
import ssm_study.model.employee;
import ssm_study.model.employeeExample;

import java.util.List;

public interface EmpService {

    List<employee> getAllEmp();

    employee getEmpByEID(Integer eid);

    int countByExample(employeeExample example);

    int deleteByExample(employeeExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(employee record);

    int insertSelective(employee record);

    List<employee> selectByExample(employeeExample example);

    employee selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") employee record, @Param("example") employeeExample example);

    int updateByExample(@Param("record") employee record, @Param("example") employeeExample example);

    int updateByPrimaryKeySelective(employee record);

    int updateByPrimaryKey(employee record);
}
