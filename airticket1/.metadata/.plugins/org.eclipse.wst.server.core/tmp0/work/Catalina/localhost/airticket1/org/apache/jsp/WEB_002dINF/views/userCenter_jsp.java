/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2018-01-14 03:38:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;

public final class userCenter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/head.jsp", Long.valueOf(1515901053582L));
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1524129010000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("       \r\n");
      out.write("       ");
      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>航空订票系统</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">飞天航空订票系统</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/toUserCenter.do\">个人中心</a></li>\r\n");
      out.write("            <li><a href=\"helpout.do\">帮助中心</a></li>\r\n");
      out.write("           <!--  <li><a href=\"#\"></a></li>  -->\r\n");
      out.write("            <li><a href=\"logout.do\">注销</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <form class=\"navbar-form navbar-right\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-3 col-md-2 sidebar\">\r\n");
      out.write("          <ul class=\"nav nav-sidebar\">\r\n");
      out.write("            <li class=\"firstmenu\"><a href=\"queryAirLine.do\" >查询航班信息</a></li>          \r\n");
      out.write("            <li  class=\"active\"><a href=\"queryAirLine.do\">我要订票</a></li>\r\n");
      out.write("            <li><a href=\"myorder.do?userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">我的订单</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/listAdvice.do?userid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">投诉建议</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("<!-- head end -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\r\n");
      out.write("          <h1 class=\"page-header\">个人中心</h1>\r\n");
      out.write("          \t<div class=\"row placeholders\">\r\n");
      out.write("\t            <div class=\"col-xs-8 col-sm-4 placeholder\">\r\n");
      out.write("\t              <img src=\"uploadImages/jerry1.jpg\" width=\"200\" height=\"200\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\r\n");
      out.write("\t              <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.userName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h4>\r\n");
      out.write("\t              <span class=\"text-muted\">最后登陆：2018-4-17</span>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t            <div class=\"col-xs-9 col-sm-6 placeholder\">\t             \r\n");
      out.write("\t              <h4>账号信息</h4>\r\n");
      out.write("\t              <span class=\"text-primary\">姓名：</span>\r\n");
      out.write("\t              <span class=\"text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.realName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\t              <span class=\"text-muted\">|</span>\r\n");
      out.write("\t              <span class=\"text-primary\">余额：</span>\r\n");
      out.write("\t              <span class=\"text-muted\">9999999.99元</span>\r\n");
      out.write("\t             \r\n");
      out.write("\t               <br>\r\n");
      out.write("\t                <span class=\"text-primary\">身份证号码：</span>\r\n");
      out.write("\t                <span class=\"text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.idCode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span><br>\r\n");
      out.write("\t                <span class=\"text-primary\">邮箱：</span>\r\n");
      out.write("\t                <span class=\"text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\t              <span class=\"text-muted\">|</span>\r\n");
      out.write("\t              <span class=\"text-primary\">手机号码：</span>\r\n");
      out.write("\t              <span class=\"text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.telPhone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\t             \r\n");
      out.write("\t               <br>\r\n");
      out.write("\t              <div class=\"control-group\">\r\n");
      out.write("\t              <a class=\"btn btn-primary btn-sm\" href=\"toEditUser.do\" role=\"button\">修改个人信息</a>\r\n");
      out.write("\t               <a class=\"btn btn-default btn-sm\" href=\"#\" role=\"button\">账户充值</a>\r\n");
      out.write("\t       \r\n");
      out.write("\t               \r\n");
      out.write("\t                </div>\r\n");
      out.write("           \t \t</div>\r\n");
      out.write("          </div>\r\n");
      out.write("           <h2 class=\"sub-header\">认证情况</h2>\r\n");
      out.write("           <div class=\"col-xs-6 col-sm-4 placeholder\">\t \r\n");
      out.write("\t            <div class=\"thumbnail\">\r\n");
      out.write("\t                  \r\n");
      out.write("\t                  <div class=\"caption\">\r\n");
      out.write("\t                  <img src=\"images/idcard.jpg\" width=\"200\" height=\"200\" >\r\n");
      out.write("\t                    <h3>实名认证</h3>\r\n");
      out.write("\t                    <p>只有实名认证的用户才可以在购买机票！</p>\r\n");
      out.write("\t                    <p><a href=\"#\" class=\"btn btn-primary\">立即认证</a> <a href=\"#\" class=\"btn\">尚未认证</a></p>\r\n");
      out.write("\t                  </div>\r\n");
      out.write("\t                  \r\n");
      out.write("\t            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("           <div class=\"col-xs-6 col-sm-4 placeholder\">\t \r\n");
      out.write("\t            <div class=\"thumbnail\">\r\n");
      out.write("\t                  \r\n");
      out.write("\t                  <div class=\"caption\">\r\n");
      out.write("\t                  <img src=\"images/phone.jpg\" width=\"200\" height=\"200\" >\r\n");
      out.write("\t                    <h3>手机认证</h3>\r\n");
      out.write("\t                    <p>可收到航班信息，账号变动提醒！</p>\r\n");
      out.write("\t                    <p><a href=\"#\" class=\"btn btn-primary\">立即认证</a> <a href=\"#\" class=\"btn\">尚未认证</a></p>\r\n");
      out.write("\t                  </div>\r\n");
      out.write("\t                  \r\n");
      out.write("\t            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("           <div class=\"col-xs-6 col-sm-4 placeholder\">\t \r\n");
      out.write("\t            <div class=\"thumbnail\">\r\n");
      out.write("\t                  \r\n");
      out.write("\t                  <div class=\"caption\">\r\n");
      out.write("\t                  <img src=\"images/email.jpg\" width=\"200\" height=\"200\" >\r\n");
      out.write("\t                    <h3>邮箱认证</h3>\r\n");
      out.write("\t                    <p>你可以收到订票信息，找回密码！</p>\r\n");
      out.write("\t                    <p><a href=\"#\" class=\"btn btn-primary\">立即认证</a> <a href=\"#\" class=\"btn\">尚未认证</a></p>\r\n");
      out.write("\t                  </div>\r\n");
      out.write("\t                  \r\n");
      out.write("\t            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("           ");
      out.write("\t\t<!-- footer begin -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JavaScript\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
