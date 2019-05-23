
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="head.jsp"%>
<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
	<h1 class="page-header">合同录入</h1>

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
				<label class="control-label" for="input01">甲方</label>
				<div class="controls">
					<input type="text" name='firstName' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">乙方</label>
				<div class="controls">
					<input type="text" name='secondName' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">签订日期</label>
				<div class="controls">
					<input type="text" name='singedTime' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">合同金额</label>
				<div class="controls">
					<input type="text" name='money' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">期限</label>
				<div class="controls">
					<input type="text" name='limitTime' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">付款方式</label>
				<div class="controls">
					<input type="text" name='paymentMethod' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="input01">上传文件</label>
				<div class="control-group">
					<div class="controls">
						<input class="input-file" name="cardFaceImageFile"
							id="cardFaceImageFile" type="file">
					</div>
				</div>
			</div>

			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">录入人</label>
				<div class="controls">
					<input type="text" name='enteringPerson' placeholder="请输入"
						class="input-xlarge">
				</div>
			</div>
			<br> <input class="btn btn-default" type="submit" value="提交">
		</form>
	</div>

</div>

<%@ include file="footer.jsp"%>
