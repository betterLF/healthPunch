<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>table模块快速使用</title>
    <link rel="stylesheet" href="WEB-INF/layui-v2.5.6/layui/css/layui.css" media="all">
</head>
<body>
<div style="display:none;" id="userToolBar">
    <button type="button" class="layui-btn layui-btn-sm">增加</button>
    <button type="button" class="layui-btn layui-btn-sm ">编辑</button>
    <button type="button" class="layui-btn layui-btn-sm">删除</button>
</div>
<table id="demo" lay-filter="test.GeneratorSqlmap"></table>

<script src="WEB-INF/layui-v2.5.6/layui/layui.js"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#demo'
            ,height: 312
            ,url: '/demo/table/user/' //数据接口
            ,page: true //开启分页
            ,toolbar:"#userToolBar"
            ,cols: [[ //表头
                {field: 'number', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'studentName', title: '学生名', width:80}
                ,{field: 'uploadDate', title: '日期', width:80,sort: true}
                ,{field: 'classId', title: '班级', width:80, sort: true}
                ,{field: 'city', title: '城市', width:80}
                ,{field: 'sign', title: '签名', width: 177}
                ,{field: 'experience', title: '积分', width: 80, sort: true}
                ,{field: 'score', title: '评分', width: 80, sort: true}
                ,{field: 'classify', title: '职业', width: 80}
                ,{field: 'wealth', title: '财富', width: 135, sort: true}
            ]]
        });

    });
</script>
</body>
</html>