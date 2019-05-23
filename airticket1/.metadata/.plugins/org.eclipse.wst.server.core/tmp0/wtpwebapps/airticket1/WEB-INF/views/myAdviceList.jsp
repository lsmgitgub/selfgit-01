       <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
       <%@ include file="head.jsp" %>
  <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">我的投诉建议</h1>

          

          <h2 class="sub-header">建议列表</h2>
         
        
        
          
          <div class="table-responsive">
          <table width="100%" >
          <tr><td align="right"><a class="btn btn-primary btn-sm" href="toAddAdvice.do" role="button">我要建议</a></td></tr>
          </table>
            <table class="table table-striped">
       
              <thead>
                <tr>
                  <th>#</th>
                  <th>建议内容</th>
                  <th>提出时间</th>
                  <th>回复</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach items="${advices }" var="advice">
              
                 <tr>
                  <td>${advice.id }</td>
                  <td>${advice.content }</td>
                  <td><fmt:formatDate value="${advice.advTime }" pattern="yyyy-MM-dd hh:mm:ss"/>   </td>
                  <td>&nbsp;</td>
                  <td>
                  <a href="showAdvice.do?adviceId=${advice.id }"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>&nbsp;</a>
                  <a  href="toEditAdvice.do?adviceId=${advice.id }"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;</a>
                  <a  href="delAdvice.do?adviceId=${advice.id }&userId=${loginUser.id}"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>&nbsp;</a>
                  </td>
                </tr>
              
              </c:forEach>

               
              </tbody>
            </table>
          </div>
        </div>
  
        
           <%@ include file="footer.jsp" %>