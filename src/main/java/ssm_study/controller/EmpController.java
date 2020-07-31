package ssm_study.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ssm_study.model.employee;
import ssm_study.service.EmpService;
import ssm_study.mapper.PageUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author lifei
 * @date 2020/7/31 8:33
 */
@Controller
public class EmpController {
        @Autowired
        private EmpService empService;
//    @RequestMapping(value = "/emps",method = RequestMethod.GET)
//    public String getAllEmp(Map<String,Object> map){
//        List<employee> allEmp = empService.getAllEmp();
//        map.put("allEmp",allEmp);
//        return "list";
//    }
        @RequestMapping(value = "/emps/{pageNum}",method = RequestMethod.GET)
        public String getAllEmp(Map<String,Object> map, @PathVariable("pageNum") Integer pageNum, HttpServletRequest request){
           //通过PageHelper设置页面信息，第一个参数为页数，第二个参数为单页显示的条数
            PageHelper.startPage(pageNum,3);
            List<employee> allEmp = empService.getAllEmp();
            //pageInfo封装了分页相关的所有信息，当前页的页数，上一页的页数，下一页的页数，总页数总条数
            PageInfo<employee> pageInfo=new PageInfo<>(allEmp,5);
            String page = PageUtil.getPageInfo(pageInfo, request);
            map.put("allEmp",allEmp);
            map.put("page",page);
            return "list";
        }

        @RequestMapping(value = "/emp/{eid}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable("eid")Integer eid,Map<String,Object> map){
            employee empByEID = empService.getEmpByEID(eid);
            List<Integer> deptList=new ArrayList<>();
            deptList.add(1);
            deptList.add(2);
            deptList.add(3);
            Map<String,String> sex=new HashMap<>();
            sex.put("女","女");
            sex.put("男","男");
            map.put("emp",empByEID);
            map.put("sex",sex);
            map.put("deptList",deptList);
            return "update";
        }

        @RequestMapping(value = "/emp",method = RequestMethod.PUT)
       public String updateEmp(employee employee){
            empService.updateByPrimaryKey(employee);
            return "redirect:/emps/1";
        }

        @RequestMapping(value = "/emps",method = RequestMethod.DELETE)
         public String deleteMore(Integer []eid){
            //获取选中的值
            for (int i = 0; i <eid.length; i++) {
                empService.deleteByPrimaryKey(eid[i]);
            }
            return "redirect:/emps/1";
        }
        }

