package health.controller;

/**
 * @author lifei
 * @date 2020/10/11 7:42
 */

import health.model.student;
import health.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * 用于提交打卡登记表后的数据到数据库
 */
@Controller
public class submitController {
    @Autowired
    private StuService stuService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//写上你要的日期格式
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(value = "/healthPunch",method = RequestMethod.GET)
    public String InStu(student student){
        System.out.println(student.toString());
        return "";
    }

    @RequestMapping(value = "/healthPunch",method = RequestMethod.POST)
    public String InsertStu(@ModelAttribute student student){
        System.out.println(student.toString());
        stuService.insert(student);
        return "healthpunch";
    }
}
