<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>table模块快速使用</title>
    <link rel="stylesheet" href="layui-v2.5.6/layui/css/layui.css" media="all">
</head>
<body>
<div style="display:none;" id="userToolBar">
    <button type="button" class="layui-btn layui-btn-sm">增加</button>
    <button type="button" class="layui-btn layui-btn-sm ">编辑</button>
    <button type="button" class="layui-btn layui-btn-sm">删除</button>
</div>
<table id="demo" lay-filter="test.GeneratorSqlmap"></table>

<script src="layui-v2.5.6/layui/layui.js"></script>
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
                    {field: 'uploadDate', title: '日期', width:200,sort: true}
                    ,{field: 'studentName', title: '姓名', width:100}
                    ,{field: 'classId', title: '班级', width:100}
                    ,{field: 'telephone', title: '电话', width:200}
                    ,{field: 'temperature', title: '体温', width: 100}
                    ,{field: 'fever', title: '症状', width: 100}
                    ,{field: 'feverDetail', title: '症状详情', width: 200}
                    ,{field: 'contact', title: '接触', width: 100}
                    ,{field: 'contactDetail', title: '接触详情', width: 200}
                    ,{field: 'situation', title: '情况', width: 100}
                    ,{field: 'situationDetail', title: '情况详情', width: 200}
                ]]
            });

    });
</script>
</body>
</html>