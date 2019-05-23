  <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ include file="head.jsp" %>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">查看订单</h1>
          
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2">
	           <form class="form-horizontal"   id="advice" 
	           action="saveAdvice.do" 
	           method="post" >
	          
	         <input type="hidden" name="userId" value="${loginUser.id }">
	         
		    <fieldset>
		      <div id="legend" class="">
		        <legend class="">您的订单</legend>
		      </div>
		     <c:if test="${not empty(errorMessage)}">
		      <div class="alert alert-warning" role="alert">${errorMessage }</div>
		     </c:if> 
		     
		       
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">订单id：</label>
		          
		           <div class="controls">		          
		             <span>${order.id }</span>  
		            </div> 	
		             <label class="control-label" for="input01">航班编号：</label>
		           <div class="controls">		          
		             <span>${order.airLineId }</span>  
		            </div> 
		                    <!-- Text input-->
		          <label class="control-label" for="input01">出发时间：</label>
		           <div class="controls">		          
		             <span>${order.startTime }</span>  
		            </div> 	
		             <label class="control-label" for="input01">到达时间：</label>
		           <div class="controls">		          
		             <span>${order.endTime }</span>  
		            </div> 		
		            
		            <label class="control-label" for="input01">出发城市：</label>
		           <div class="controls">		          
		             <span>${order.fromCity }</span>  
		            </div> 	  

		            <label class="control-label" for="input01">到达城市：</label>
		           <div class="controls">		          
		             <span>${order.toCity }</span>  
		            </div>  
		          <label class="control-label" for="input01">票价：</label>
		           <div class="controls">		          
		             <span>${order.price }</span>  
		            </div>     
		    </div>
   
		
		    <div class="control-group">
		          <label class="control-label"></label>
		
		          <!-- Button -->
		          <div class="controls">
		           <a class="btn btn-primary btn-sm" href="myorder.do?userId=${loginUser.id }" role="button">返回订单列表</a>
		          </div>
		        </div>
		
		    </fieldset>
		  </form>
            </div>
                  
        </div>
        
          <%@ include file="footer.jsp" %>
