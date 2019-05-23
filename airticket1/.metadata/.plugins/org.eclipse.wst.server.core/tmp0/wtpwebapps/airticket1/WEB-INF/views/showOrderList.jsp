       <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
       <%@ include file="head.jsp" %>
  <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">我的订单</h1>

          

          <h2 class="sub-header">订单列表</h2>
         
        
        
          
          <div class="table-responsive">

            <table class="table table-striped">
       
              <thead>
                <tr>
                  <th>#</th>
                  <th>出发城市</th>
                  <th>到达城市</th>
                  <th>出发时间</th>
                  <th>到达时间</th>
                  <th>订票时间</th>
                  <th>座位号</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
            <c:forEach items="${orders}" var="order">
              
                 <tr>
                  <td>${order.id }</td>
                  <td>${order.fromCity }</td>
                  <td>${order.toCity } </td>
                  <td>${order.startTime }</td>
                  <td>${order.endTime }</td>
                  <td>${order.orderTime }</td>
                  <td>${order.seatNo }</td>
                  <td>
                  <a href="showOrder.do?orderId=${order.id }"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>&nbsp;</a>
                  <a  href="delOrder.do?orderId=${order.id }&userId=${loginUser.id}"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>&nbsp;</a>
                  </td>
                </tr>
              
           </c:forEach>
               
              </tbody>
            </table>
          </div>
        </div>
  
        
           <%@ include file="footer.jsp" %>