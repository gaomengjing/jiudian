<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.List" %>
    <%@ page import="org.entity.Room" %>
         <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html public"-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="<%=basePath%>web/com/css/room.css" type="text/css" >
<link rel="stylesheet" href="<%=basePath%>web/com/css/main.css" type="text/css" >
<!-- <link rel="stylesheet" href="../../../com/css/main.css">
<link rel="stylesheet" href="../../../com/css/room.css"> -->
<title>房间信息</title>
        <script type="text/javascript">
            function altRows(id){
                if(document.getElementsByTagName){  
                    
                    var table = document.getElementById(id);  
                    var rows = table.getElementsByTagName("tr"); 
                    
                    for(i = 0; i < rows.length; i++){          
                        if(i % 2 == 0){
                            rows[i].className = "evenrowcolor";
                        }else{
                            rows[i].className = "oddrowcolor";
                        }      
                    }
                }
            }
            
            window.οnlοad=function(){
                altRows('alternatecolor');
            }
            </script>
            
</head>
<body>
<%@ include file="../../../basic/header.jsp"%> 

<%			
			List<Room> list=(List<Room>)request.getAttribute("list");
           
            System.out.println(list);
            %>
				<%	for(Room room:list){
					 %>
  		<div class="room"> 
             <a href="roomDetail.html"><img src="/jiudian/WebContent/web/com/img/timg1.jpg" width="200px"></a> 
              <table class="table" id="alternatecolor" >
            
                
                <tr>
                    <th>房间类型</th><th>房间设备</th><th>价格</th>
                </tr>
                    
                <tr>
                        <td><a href="roomDetail.html" style="text-decoration: none;">
                        <%=room.getRom_type() %></a></td>
                        <td>独卫、电视、能淋浴</td>
                        <td><%= room.getRom_prise()%></td>
                        
                </tr>
            
           
            </table>
            <%
					}
            %> 
        </div>


<%@ include file="../../../basic/footer.jsp"%> 
</body>
</html>