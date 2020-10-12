package health.bean;

import health.model.student;

import java.util.List;

/**
 * @author lifei
 * @date 2020/10/12 18:26
 */
public class delList {
    private List<student> delList;

    public List<student> getDelList() {
        return delList;
    }

    public void setDelList(List<student> delList) {
        this.delList = delList;
    }
    public int size(){
        return delList.size();
    }
}
