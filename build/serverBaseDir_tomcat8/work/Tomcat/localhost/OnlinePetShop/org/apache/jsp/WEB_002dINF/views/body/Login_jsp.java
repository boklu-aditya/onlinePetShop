/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2018-06-17 17:23:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.body;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("file:/C:/Users/dell/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar", Long.valueOf(1521638773711L));
    _jspx_dependants.put("jar:file:/C:/Users/dell/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("file:/C:/Users/dell/.gradle/caches/modules-2/files-2.1/org.springframework/spring-webmvc/4.2.4.RELEASE/cf4317be9c83b4c1c65ce2d3bb96673ac546030a/spring-webmvc-4.2.4.RELEASE.jar", Long.valueOf(1522950660543L));
    _jspx_dependants.put("jar:file:/C:/Users/dell/.gradle/caches/modules-2/files-2.1/org.springframework/spring-webmvc/4.2.4.RELEASE/cf4317be9c83b4c1c65ce2d3bb96673ac546030a/spring-webmvc-4.2.4.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1450293450000L));
    _jspx_dependants.put("/WEB-INF/views/body/../../tagLibraries/tagLibraries.jsp", Long.valueOf(1529252293315L));
    _jspx_dependants.put("jar:file:/C:/Users/dell/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("jar:file:/C:/Users/dell/.gradle/caches/modules-2/files-2.1/org.springframework/spring-webmvc/4.2.4.RELEASE/cf4317be9c83b4c1c65ce2d3bb96673ac546030a/spring-webmvc-4.2.4.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1450293450000L));
    _jspx_dependants.put("jar:file:/C:/Users/dell/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005faction;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005faction.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"modal fade\" id=\"login\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered \">\r\n");
      out.write("    \r\n");
      out.write("      <div class=\"modal-content  bg-warning border border-warning\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("         <div class=\"col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4 modal-sideHeader \">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("               <h1>Login</h1>\r\n");
      out.write("               <br/><br/>\r\n");
      out.write("              <span>Get Access to your Orders, Wishlist and Recommendations</span> \r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"col-7 col-sm-7 col-md-8 col-lg-7 col-xl-7 \">\r\n");
      out.write("          ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("           ");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"col-1 col-sm-1 col-md-1 col-lg-1 col-xl-1\">\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("         </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div> \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  $(document).ready(function(){\r\n");
      out.write("\t \t  $(\"#loginSubmit\").click(function (e){\r\n");
      out.write("\t \t\t e.preventDefault();\r\n");
      out.write("\t \t\t $(\"#loginForm\").ajaxSubmit({\r\n");
      out.write("\t \t \t\tbeforeSubmit : function(formData, jqForm, options) {\r\n");
      out.write("\t \t \t\t\treturn true;\r\n");
      out.write("\t \t \t\t},\r\n");
      out.write("\t \t \t\tsuccess : function(responseText) {\r\n");
      out.write("\t \t \t\t\t$(\"#login\").modal(\"hide\");\r\n");
      out.write("\t \t \t\t\t$.gritter.add({\r\n");
      out.write("\t \t \t\t\t\ttitle :\"Login successfully :)\",\r\n");
      out.write("\t \t \t\t\t\tfade_in_speed:\"medium\",\r\n");
      out.write("\t \t \t\t\t\tfade_out_speed:1000\r\n");
      out.write("\t \t \t\t\t\t\r\n");
      out.write("\t \t \t\t\t});\r\n");
      out.write("\t \t \t\t},\r\n");
      out.write("\t \t \t\terror: function(){\r\n");
      out.write("\t \t \t\t\t$.gritter.add({\r\n");
      out.write("\t \t \t\t\t\ttitle :\"Login Failed! :(\",\r\n");
      out.write("\t \t \t\t\t\ttext  :\"Please try again\",\t\t\r\n");
      out.write("\t \t \t\t\t\tfade_in_speed:\"medium\",\r\n");
      out.write("\t \t \t\t\t\tfade_out_speed:1000\r\n");
      out.write("\t \t \t\t\t\t\r\n");
      out.write("\t \t \t\t\t});\r\n");
      out.write("\t \t \t\t}\r\n");
      out.write("\t \t \t});\r\n");
      out.write("\t \t  });\r\n");
      out.write("\t \t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  </script>\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/body/Login.jsp(16,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("loginData");
    // /WEB-INF/views/body/Login.jsp(16,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/auth/login_check?targetUrl=${targetUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/views/body/Login.jsp(17,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setId("loginForm");
    // /WEB-INF/views/body/Login.jsp(17,11) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setName("loginForm");
    // /WEB-INF/views/body/Login.jsp(17,11) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginData}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    // /WEB-INF/views/body/Login.jsp(17,11) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("POST");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <div class=\"form-body\">\r\n");
          out.write("            \r\n");
          out.write("             <div class=\"form-group\">\r\n");
          out.write("              <label for=\"username\" class=\"badge badge-pill\"><b>Username</b></label>\r\n");
          out.write("              <input type=\"text\" class=\"form-control\" placeholder=\"Enter Username\" id=\"username\" name=\"username\" required>\r\n");
          out.write("             </div>\r\n");
          out.write("             \r\n");
          out.write("             <div class=\"form-group\">\r\n");
          out.write("              <label for=\"password\" class=\"badge badge-pill\"><b>Password</b></label>\r\n");
          out.write("              <input type=\"password\" class=\"form-control\" placeholder=\"Enter Password\" id=\"password\" name=\"password\" required>\r\n");
          out.write("             </div>\r\n");
          out.write("             \r\n");
          out.write("             <div class=\"form-group\">\r\n");
          out.write("              <table>\r\n");
          out.write("                <tr>\r\n");
          out.write("                  <td>Remember Me:</td>\r\n");
          out.write("                  <td><input type=\"checkbox\" class=\"form-control\"  id=\"remember-me\" name=\"remember-me\"></td>\r\n");
          out.write("                </tr>\r\n");
          out.write("              </table>\r\n");
          out.write("             </div>\r\n");
          out.write("  \r\n");
          out.write("            \r\n");
          out.write("             <div class=\"form-group\">\r\n");
          out.write("               <button type=\"button\" id=\"loginSubmit\" class=\"form-control btn btn-primary\">Login</button>\r\n");
          out.write("             </div>\r\n");
          out.write("             \r\n");
          out.write("             <div class=\"form-group\">\r\n");
          out.write("               <button type=\"button\" id=\"newUserLogin\" class=\"form-control btn btn-default\">New to Pet Shop?Sign up</button>\r\n");
          out.write("             </div>\r\n");
          out.write("            <input type=\"hidden\" name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" /> \r\n");
          out.write("            </div>\r\n");
          out.write("           ");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
