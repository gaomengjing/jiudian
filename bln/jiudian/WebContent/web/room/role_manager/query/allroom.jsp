<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.List" %>
<%@ page import="org.entity.Room" %>
<%
	String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>queryAllroom</title>
<%-- <link rel="stylesheet" href="<%=basePath%>web/com/css/room.css" type="text/css" > --%>
<link rel="stylesheet" href="<%=basePath%>web/com/css/main.css" type="text/css" >
</head>
<body>
	<%@ include file="../../../basic/header.jsp"%>
	<%@ include file="../../leftmenue/left.jsp" %>
	
	

	<%			
			List<Room> list=(List<Room>)request.getAttribute("list");
            System.out.println(list);
            %>
				<%	for(Room room:list){
					 %>
 			 <div class="room"> 
             <a href="roomDetail.html"><img src="<%=basePath%>web/com/img/timg1.jpg" width="200px"></a> 
              <table class="table" id="alternatecolor" >
            
                
                <tr>
                    <th>房间编号</th><th>房间类型</th><th>房间价格</th><th>管理员编号</th><th>房间状态</th>
                </tr>
                    
                <tr>
                        <td>
                        <a href="roomDetail.html" style="text-decoration: none;">
                        <%=room.getRom_id() %></a></td>
                        <td><%=room.getRom_type() %></td>
                        <td><%= room.getRom_prise()%></td>
                        <td><%= room.getAdm_id()%></td>
                        <td><%= room.getRom_status()%></td>
                        
                </tr>
            
           
            </table>
            <%
					}
            %> 
        </div>
        


<%@ include file="../../../basic/footer.jsp"%> 

</body>
</html>