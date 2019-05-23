<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="head.jsp"%>
<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
	<h1 class="page-header">项目信息</h1>

	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2">
		<form class="form-horizontal" id="" action="doQueryContract.do"
			method="post">
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">项目名称</label>
				<div class="controls">
					<input type="text" name='projectName' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">金额</label>
				<div class="controls">
					<input type="text" name='money' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<br>
			<div class="control-group">
			<label class="control-label" for="input01">进度</label>
				<div class="progress progress-striped">
					<div class="progress-bar progress-bar-success" style="width: 90%;">
						<span class="sr-only">90%</span>
					</div>
				</div>
			
			</div>
			<br> <input class="btn btn-default" type="submit" value="提交">	
		</form>

	</div>

</div>

<%@ include file="footer.jsp"%>
