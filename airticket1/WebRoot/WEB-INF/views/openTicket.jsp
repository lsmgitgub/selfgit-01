
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="head.jsp"%>
<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
	<h1 class="page-header">开票录入</h1>

	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2">
		<form class="form-horizontal" id="" action="doQueryContract.do"
			method="post">
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">票号</label>
				<div class="controls">
					<input type="text" name='ticketNumber' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">日期</label>
				<div class="controls">
					<input type="text" name='date' placeholder="请输入"
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
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">税率</label>
				<div class="controls">
					<input type="text" name='taxRate' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			
			<br> <input class="btn btn-default" type="submit" value="提交">
		</form>
	</div>

</div>

<%@ include file="footer.jsp"%>
