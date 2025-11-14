<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.ChuDe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="card mb-3">
    <h3 class="card-header">Chủ đề</h3>  
       <div class="list-group">
            <%
                ArrayList<ChuDe> dsChuDe = (ArrayList<ChuDe>)request.getAttribute("dsChuDe");
                for(ChuDe c: dsChuDe)
                {
            %>            
             <a href="san-pham?macd=<%=c.getMacd() %>" class="list-group-item list-group-item-action"> <i class="bi bi-arrow-right-circle"></i> <%=c.getTencd() %> </a>
            <%
                }
            %>
        </div>   
</div>
