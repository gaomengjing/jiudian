<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>zhu</title>
<link rel="stylesheet" href="../com/css/main.css"> 
 <script src="../com/js/main.js"></script> 
</head>
<body>

		<div class="index">
            <ul class="menu">
                <li><a href="../basic/main.jsp">首页</a></li>
                <li><a href="#">酒店介绍</a></li>
                <li><a href="#">房间信息</a></li>
                <li><a href="#">我的订单</a></li>
                <li><a href="../customer/leftmenue/menue.jsp">个人中心</a></li>
            </ul>
        </div>
        
      
        <!--轮播-->
        <div class="banner" onmouseover="stop()" onmouseout="start()"><!-- 在box上添加鼠标移入和移出事件 -->
            
            <img class="slide" src="../com/img/timg3.jpg" >
           
         
            <img class="slide" src="../com/img/timg1.jpg"  >
          
           
        </div>
     
         <!--图片廊-->
        <div class="hot" >
            <h2>热门推荐</h2>
            <div class="responsive">
            <div class="img">
                <a target="_blank" href="#">
                <img src="../com/img/timg.jpg" alt="图片文本描述" width="300" height="200">
                </a>
                <div class="desc">这里添加图片文本描述</div>
            </div>
            </div>
            
            <div class="responsive">
            <div class="img">
                <a target="_blank" href="#">
                <img src="../com/img/timg.jpg" alt="图片文本描述" width="300" height="200">
                </a>
                <div class="desc">这里添加图片文本描述</div>
            </div>
            </div>
            
            <div class="responsive">
            <div class="img">
                <a target="_blank" href="#">
                <img src="../com/img/timg.jpg" alt="图片文本描述" width="300" height="200">
                </a>
                <div class="desc">这里添加图片文本描述</div>
            </div>
            </div>
            
            <div class="responsive">
            <div class="img">
                <a target="_blank" href="#">
                <img src="../com/img/timg.jpg" alt="图片文本描述" width="300" height="200">
                </a>
                <div class="desc">这里添加图片文本描述</div>
            </div>
            </div>
            <div class="responsive">
                <div class="img">
                    <a target="_blank" href="#">
                    <img src="../com/img/timg.jpg" alt="图片文本描述" width="300" height="200">
                    </a>
                    <div class="desc">这里添加图片文本描述</div>
                </div>
                </div>
        </div>

       <%--   <%@ include file="../basic/footer.jsp" %> --%>
</body>
</html>