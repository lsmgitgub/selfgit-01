<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="head.jsp"%>
<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
	<h1 class="page-header">合同页面</h1>
	<div class="container">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>项目名称</th>
					<th>甲方</th>
					<th>乙方</th>
					<th>签订日期</th>
					<th>合同金额</th>
					<th>期限</th>
					<th>付款方式</th>
					<th>录入人</th>
				</tr>
			</thead>
			
			<tbody>
				<tr>
					<td><a href="doAllProject.do"><%=request.getParameter("projectName")%></td>
					<td><%=request.getParameter("firstName")%></td>
					<td><%=request.getParameter("secondName")%></td>
					<td><%=request.getParameter("signedTime")%></td>
					<td><%=request.getParameter("money")%></td>
					<td><%=request.getParameter("limitTime")%></td>
					<td><%=request.getParameter("paymentMethod")%></td>
					<td><%=request.getParameter("enteringPerson")%></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>

<%@ include file="footer.jsp"%>