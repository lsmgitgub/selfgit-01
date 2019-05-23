.
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">


    <title>Dashboard Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

   
    <!-- Custom styles for this template -->
    <link href="css/main.css" rel="stylesheet">

  </head>

  <body>


        
<!-- head end -->
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">注册系统</h1>
          
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2">
	           <form class="form-horizontal"   id="userInfo" 
	           action="doRegister.do" 
	           method="post" enctype="multipart/form-data">
	          
	         
		    <fieldset>
		      <div id="legend" class="">
		        <legend class="">请输入注册信息</legend>
		      </div>
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">用户名</label>
		           <div class="controls">		          
		             
		            <input type="text" value="" name='userName' placeholder="用户名"  class="input-xlarge" >
		             <span>用户名注册后不可修改</span>  
		            </div> 		        
		    </div>
		    
		    		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">密码</label>
		           <div class="controls">		          
		             
		            <input type="text" value="" name='password' placeholder="密码"  class="input-xlarge" >
		             <span>密码至少8位</span>  
		            </div> 		        
		    </div>
		    
		    	<div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">再次输入密码</label>
		           <div class="controls">		          
		             
		            <input type="text" value="" name='repassword' placeholder="密码"  class="input-xlarge" >
		             <span>密码至少8位</span>  
		            </div> 		        
		    </div>
		
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">姓名</label>
		         <div class="controls">
		            <input type="text" name="realName" value="" placeholder="请输入真实姓名" class="input-xlarge">
		            <span >真实姓名保存后将不可修改</span>
		         </div>
		        </div>
		
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">身份证号码</label>
		          <div class="controls">
		            <input type="text" name="idCode" value="" placeholder="身份证号码" class="input-xlarge">
		            <span>身份证号码为18位</span>
		          </div>
		        </div>
		
		    <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">联系电话</label>
		          <div class="controls">
		            
		           <input type="text" name="telPhone"  value="" placeholder="电话号码" class="input-xlarge">
		            <span>请输入电话号码</span>
		          </div>
		        </div>
		       <div class="control-group">
		
		          <!-- Text input-->
		          <label class="control-label" for="input01">email</label>
		          <div class="controls">
		            
		           <input type="text" name="email"  value="" placeholder="email" class="input-xlarge">
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
		            <input type="submit" class="btn btn-primary" value="注册"/>
		          </div>
		        </div>
		
		    </fieldset>
		  </form>
            </div>
                  
        </div>
				<!-- footer begin -->
		
		    
  

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
