  <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ include file="head.jsp" %>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">查看投诉建议</h1>
          
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2">
	           <form class="form-horizontal"   id="advice" 
	           action="saveAdvice.do" 
	           method="post" >
	          
	         <input type="hidden" name="userId" value="${loginUser.id }">
	         
		    <fieldset>
		      <div id="legend" class="">
		        <legend class="">查看投诉建议</legend>
		      </div>
		     <c:if test="${not empty(errorMessage)}">
		      <div class="alert alert-warning" role="alert">${errorMessage }</div>
		     </c:if> 
		     
		       
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">建议内容：</label>
		           <div class="controls">		          
		             <span>${advice.content }</span>  
		            </div> 		        
		    </div>
   
		
		    <div class="control-group">
		          <label class="control-label"></label>
		
		          <!-- Button -->
		          <div class="controls">
		           <a class="btn btn-primary btn-sm" href="listAdvice.do?userid=${loginUser.id }" role="button">返回建议列表</a>
		          </div>
		        </div>
		
		    </fieldset>
		  </form>
            </div>
                  
        </div>
        
          <%@ include file="footer.jsp" %>
