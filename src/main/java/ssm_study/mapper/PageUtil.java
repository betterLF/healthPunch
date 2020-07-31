package ssm_study.mapper;

/**
 * @author lifei
 * @date 2020/7/29 19:40
 */

import com.github.pagehelper.PageInfo;
import ssm_study.model.employee;

import javax.servlet.http.HttpServletRequest;

/**
 * 首页 上一页 1 2 3 4 5 下一页 末页
 */
public class PageUtil {
    public static String  getPageInfo(PageInfo<employee> pageInfo, HttpServletRequest request){
      String path=request.getContextPath()+"/";
        StringBuilder sb=new StringBuilder();
        //拼接首页
        sb.append("<a href='"+path+"emps/1'>首页</a>");
        sb.append("&nbsp;&nbsp;");
        //拼接上一页
        if(pageInfo.isHasPreviousPage()){
            sb.append("<a href='"+path+"emps/"+pageInfo.getPrePage()+"'>上一页</a>");
            sb.append("&nbsp;&nbsp;");
        }else{
            sb.append("上一页");
            sb.append("&nbsp;&nbsp;");
        }
        //拼接其他页码
        int[] navigatepageNums = pageInfo.getNavigatepageNums();
        for (int i:navigatepageNums) {
            if(i==pageInfo.getPageNum()){
                sb.append("<a style='color:red;' href='" + path + "emps/" + i + "'>" + i + "</a>");
                sb.append("&nbsp;&nbsp;");
            }else {
                sb.append("<a href='" + path + "emps/" + i + "'>" + i + "</a>");
                sb.append("&nbsp;&nbsp;");
            }
        }
        //拼接下一页
        if(pageInfo.isHasNextPage()){
            sb.append("<a href='"+path+"emps/"+pageInfo.getNextPage()+"'>下一页</a>");
            sb.append("&nbsp;&nbsp;");
        }else{
            sb.append("下一页");
            sb.append("&nbsp;&nbsp;");
        }
        //拼接末页
        if(pageInfo.isIsLastPage()){
            sb.append("末页");
            sb.append("&nbsp;&nbsp;");
        }else{
            sb.append("<a href='"+path+"emps/"+pageInfo.getPages()+"'>末页</a>");
            sb.append("&nbsp;&nbsp;");
        }
        return sb.toString();
    }
}
