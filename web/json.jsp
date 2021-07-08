<%--
  Created by IntelliJ IDEA.
  User: 杯杯
  Date: 2021/7/5
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSON</title>
    <script type="text/javascript" src="jquery-3.6.0.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#btn").click(function(){
                $.post("jsonServlet",null,function(msg){
                    console.log(msg);
                    //解析对象类型
                    //console.log(msg.sname+","+msg.phone);
                    //解析数组类型
                    /*for(var i=0;i<msg.length;i++){
                        console.log(msg[i]);
                    }*/
                    //解析混合类型
                    /*for(var i=0;i<msg.length;i++){
                        console.log(msg[i].sname+","+msg[i].email);
                    }*/
                    //jQuery封装的遍历方法：each()
                    $.each(msg,function(index,content){
                        console.log(content.sname+","+content.email);
                    });

                    $(msg).each(function(index,content){
                        console.log(content.sid+","+content.sex);
                    });
                },"json");
            });
        });
    </script>
</head>
<body>
<input type="button" value="测试JSON" id="btn">
</body>
</html>
