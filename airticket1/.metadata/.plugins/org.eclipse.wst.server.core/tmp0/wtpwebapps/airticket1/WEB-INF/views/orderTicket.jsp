  <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
 <%@ include file="head.jsp" %>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">确认订单信息</h1>
          
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2">
	           <form class="form-horizontal"   id="advice" 
	           action="saveAdvice.do" 
	           method="post" >
	          
	         <input type="hidden" name="userId" value="${loginUser.id }">
	         
		    <fieldset>
		      <div id="legend" class="">
		        <legend class="">确认订单信息</legend>
		      </div>
		     <c:if test="${not empty(errorMessage)}">
		      <div class="alert alert-warning" role="alert">${errorMessage }</div>
		     </c:if> 
		     
		       
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">出发城市：</label><span>${airLine.fromCity }</span><br>
		           <label class="control-label" for="input01">到达城市：</label><span>${airLine.toCity }</span><br> 
		            <label class="control-label" for="input01">出发时间：</label><span><fmt:formatDate value="${airLine.startTime }" pattern="hh:mm"/></span><br>
		           <label class="control-label" for="input01">到达时间：</label><span><fmt:formatDate value="${airLine.endTime }" pattern="hh:mm"/></span><br> 
		            <label class="control-label" for="input01">票价：</label><span><fmt:formatNumber value="${airLine.price }" type="currency"/></span><br> 
		          		        
		    </div>
   
		
		    <div class="control-group">
		          <label class="control-label"></label>
		
		          <!-- Button -->
		          <div class="controls">
		           <a class="btn btn-primary btn-sm" href="saveOrder.do?userId=${loginUser.id }&airLineId=${airLine.id}" role="button">支付</a>
		           <a class="btn btn-primary btn-sm" href="queryAirLine.do" role="button">返回</a>
		          </div>
		        </div>
		
		    </fieldset>
		  </form>
            </div>
                  
        </div>
        
          <%@ include file="footer.jsp" %>
