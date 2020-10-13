package health.mapper;

import health.bean.delList;
import health.model.student;

import java.util.List;

public interface studentMapper {
    int insert(student record);
    List<student> getAllStudents();
    List<student> getStudents_fever();
    List<student> getStudents_contact();
    List<student> getStudents_situation();
    List<student> getStudentsByClassId(student record);
    List<student> getStudentsByStudentName(student record);
    void delByDateAndTelephone(delList data);
    int insertPseudoData(delList data);

}