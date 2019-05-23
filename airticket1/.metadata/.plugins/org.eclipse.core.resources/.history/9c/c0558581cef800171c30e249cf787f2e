  <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
 <%@ include file="head.jsp" %>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">航班查询</h1>
          
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2">
	           <form class="form-horizontal"   id="" 
	           action="doQueryAirLine.do" 
	           method="post" >
	          
	        
	         
		    <fieldset>
		      <div id="legend" class="">
		        <legend class="">查询航班信息</legend>
		      </div>
		     <c:if test="${not empty(errorMessage)}">
		      <div class="alert alert-warning" role="alert">${errorMessage }</div>
		     </c:if> 
		     
		       
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">出发城市：</label>
		           <input type="text" name="fromCity" value="">
		            <label class="control-label" for="input01">到达城市：</label>
		           <input type="text" name="toCity" value="">
		           &nbsp;<input type="submit" class="btn btn-xs btn-primary" value="查询">
		                
		    </div>
		    </fieldset>
		  </form>
            </div>
            
            <h2 class="sub-header">航班列表</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>#</th>
                  <th>出发时间</th>
                  <th>到达时间</th>
                  <th>出发城市</th>
                  <th>到达城市</th>
                  <th>座位数</th>
                  <th>票价</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach items="${airLines }" var="airLine">
                <tr>
                 <td>${airLine.id }</td>
                  <td><fmt:formatDate value="${airLine.startTime }" pattern="hh:mm"/></td>
                  <td><fmt:formatDate value="${airLine.endTime }" pattern="hh:mm"/></td>
                  <td>${airLine.fromCity }</td>
                  <td>${airLine.toCity }</td>
                  <td>${airLine.seatCount }</td>
                   <td>${airLine.price }</td>
                 
                  <td><a href="orderTicket.do?airLineId=${airLine.id }">订票</a></td>
                </tr>
                </c:forEach>
              
              </tbody>
            </table>
          </div>
                  
        </div>
        
          <%@ include file="footer.jsp" %>
