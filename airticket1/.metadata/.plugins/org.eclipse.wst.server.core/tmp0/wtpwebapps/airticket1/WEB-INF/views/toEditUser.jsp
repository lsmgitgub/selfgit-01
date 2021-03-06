    <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
 <%@ include file="head.jsp" %>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">个人中心</h1>
          
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2">
	           <form class="form-horizontal"   id="userInfo" 
	           action="saveUser.do" 
	           method="post" enctype="multipart/form-data">
	          
	         <input type="hidden" name="id" value="${loginUser.id }">
	         <input type="hidden" name="userName" value="${loginUser.userName }">
		    <fieldset>
		      <div id="legend" class="">
		        <legend class="">修改个人信息</legend>
		      </div>
		      <div class="alert alert-warning" role="alert">${errorMessage }</div>
		       
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">用户名</label>
		           <div class="controls">		          
		             
		            <input type="text" value="${loginUser.userName }" name='userName' placeholder="用户名"  class="input-xlarge" disabled >
		             <span>用户名注册后不可修改</span>  
		            </div> 		        
		    </div>
		    
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">请输入当前密码</label>
		           <div class="controls">		          
		             
		            <input type="password" value="" name='password' placeholder="当前密码"  class="input-xlarge" >
		             <span>密码至少8位</span>  
		            </div> 		        
		    </div>
		    
		    		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">密码</label>
		           <div class="controls">		          
		             
		            <input type="password" value="" name='newPassword' placeholder="新密码"  class="input-xlarge" >
		             <span>密码至少8位</span>  
		            </div> 		        
		    </div>
		    
		    	<div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">再次输入密码</label>
		           <div class="controls">		          
		             
		            <input type="password" value="" name='repassword' placeholder="密码"  class="input-xlarge" >
		             <span>密码至少8位</span>  
		            </div> 		        
		    </div>
		
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">姓名</label>
		         <div class="controls">
		            <input type="text" name="realName" value="${loginUser.realName }" placeholder="请输入真实姓名" class="input-xlarge">
		            <span ></span>
		         </div>
		        </div>
		
		   <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">身份证号码</label>
		          <div class="controls">
		            <input type="text" name="idCode" value="${loginUser.idCode }" placeholder="身份证号码" class="input-xlarge">
		            <span>身份证号码为18位</span>
		          </div>
		        </div>
		
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">联系电话</label>
		          <div class="controls">
		            
		           <input type="text" name="telPhone"  value="${loginUser.telPhone }" placeholder="电话号码" class="input-xlarge">
		            <span>请输入电话号码</span>
		          </div>
		        </div>
		       <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">email</label>
		          <div class="controls">
		            
		           <input type="text" name="email"  value="${loginUser.email }" placeholder="email" class="input-xlarge">
		            <span>请输入email</span>
		          </div>
		        </div>
		

		
		    <div class="control-group">
		          <label class="control-label">头像</label>
		          <br>
		<img src="images/idcard.jpg" width='150' height="150">
		          <!-- File Upload -->
		          <div class="controls">
		            <input class="input-file" name="cardFaceImageFile" id="cardFaceImageFile" type="file">
		          </div>
		        </div>
		
		   
		
		    <div class="control-group">
		          <label class="control-label"></label>
		
		          <!-- Button -->
		          <div class="controls">
		            <input type="submit" class="btn btn-primary" value="修改"/>
		          </div>
		        </div>
		
		    </fieldset>
		  </form>
            </div>
                  
        </div>
        
          <%@ include file="footer.jsp" %>
