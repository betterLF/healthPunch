<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/10/10
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <!--视口，考虑到移动端，手机，平板-->
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>学校学生体温每日上报登记表</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/check.js"></script>
    <!-- 设置网页的默认边距，统一样式 -->
</head>
<body>

<div class="container">
    <!-- log图 -->
    <img src="img/南邮.jpg">
<%--    <a href="back.jsp">wiai</a>--%>
    <!-- 内容区 -->
    <div class="content">
        <h3>南邮学生体温每日登记表</h3>
        <p>为了做好新冠状病毒感染肺炎的防控，请每日如实填写身体健康情况，谢谢配合。</p>
        <hr>
        <!-- 表单 -->
        <form action="/healthPunch" method="post" onsubmit="return checkForm()" >
<%--            <input type="hidden" name="_method" value="PUT">--%>
    <div class="row">
        填报日期 <span>*</span>
    </div>
    <div class="input_row">
        <input type="date" name="uploadDate" required>
    </div>

    <div class="row">
        学生姓名 <span>*</span>
    </div>
    <div class="input_row">
        <input type="text" name="studentName" required>
    </div>

    <div class="row">
        学生班级 <span>*</span>
    </div>
    <div class="input_row">
        <input type="text" name="classId" required>
    </div>

    <div class="row">
        体温（°C） <span>*</span>
    </div>
    <div class="input_row">
        <input type="text" name="temperature" required>
    </div>

    <div class="row">
        今日是否出现发热、干咳、乏力、呼吸困难等症状? <span>*</span>
    </div>
    <div class="multiple_row">
        <input type="radio" name="fever" value="yes">是（请简单描述）<input type="text" name="feverDetail"></input><br>
        <input type="radio" name="fever" value="no">否
    </div>

    <div class="row">
        今日是否与来自湖北（尤其是武汉）的人员有过较为密切的接触？ <span>*</span>
    </div>
    <div class="multiple_row">
        <input type="radio" name="contact" value="yes">是（请简单描述）<input type="text" name="contactDetail"></input><br>
        <input type="radio" name="contact" value="no">否
    </div>

    <div class="row">
        所在地（学习、生活场所）是否出现任何与疫情相关的、值得注意的情况<span>*</span>
    </div>
    <div class="multiple_row">
        <input type="radio" name="situation" value="yes">是（请简单描述）<input type="text" name="situationDetail"></input><br>
        <input type="radio" name="situation" value="no">否
    </div>

    <div class="row">
        填报人联系方式 <span>*</span>
    </div>
    <div class="row">
        <input type="text" name="telephone" required>
    </div>
    <br>
    <button type="submit" onsubmit="return sub()">提交</button>
        </form>
    </div>
</div>

</body>
</html>
