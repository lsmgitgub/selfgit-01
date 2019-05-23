<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="head.jsp"%>
<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
	<h1 class="page-header">项目信息</h1>

	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2">
		<form class="form-horizontal" id="" action="toaddproject.do"
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
				<label class="control-label" for="input01">到货日期</label>
				<div class="controls">
					<input type="text" name='arriveDate' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">开工日期</label>
				<div class="controls">
					<input type="text" name='beginDate' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">完工日期</label>
				<div class="controls">
					<input type="text" name='completionDate' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">验收日期</label>
				<div class="controls">
					<input type="text" name='acceptanceDate' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<br> <input class="btn btn-default" type="submit" value="提交">
		</form>
			
	</div>

</div>

<%@ include file="footer.jsp"%>
