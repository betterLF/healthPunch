package ssm_study.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ssm_study.model.employee;
import ssm_study.model.employeeExample;

public interface employeeMapper {
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