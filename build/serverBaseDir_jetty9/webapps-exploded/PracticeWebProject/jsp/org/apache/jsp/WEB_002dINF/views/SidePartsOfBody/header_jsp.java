package org.apache.jsp.WEB_002dINF.views.SidePartsOfBody;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("    <div  class=\"row header fixed-top\">\r\n");
      out.write("      <div class=\"col-1 col-sm-1 col-md-1 col-lg-1 col-xl-1\"></div>\r\n");
      out.write("      <div class=\"col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4\"></div>\r\n");
      out.write("      <div class=\"col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3\"></div>\r\n");
      out.write("      <div class=\"col-2 col-sm-2 col-md-2 col-lg-2 col-xl-2\"></div>\r\n");
      out.write("      <div class=\"col-2 col-sm-2 col-md-2 col-lg-2 col-xl-2\">\r\n");
      out.write("         <nav class=\"navbar navbar-expand-sm navbar-dark\">\r\n");
      out.write("           <ul class=\"navbar-nav\">\r\n");
      out.write("             <li class=\"nav-item\">\r\n");
      out.write("               <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath() );
      out.write("\">Home</a>\r\n");
      out.write("             </li>\r\n");
      out.write("             <li class=\"nav-item\">\r\n");
      out.write("               <a class=\"nav-link\" data-toggle=\"modal\" id=\"loginlink\">Login</a>\r\n");
      out.write("             </li>\r\n");
      out.write("             <li class=\"nav-item\">\r\n");
      out.write("               <a class=\"nav-link\" data-toggle=\"modal\" id=\"loginlink\">Logout</a>\r\n");
      out.write("             </li>\r\n");
      out.write("           </ul>\r\n");
      out.write("         </nav>\r\n");
      out.write("     </div></div>\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../views/body/Login.jsp", out, false);
      out.write("\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../views/body/new_user_details.jsp", out, false);
      out.write("\r\n");
      out.write("     \r\n");
      out.write("     <script type=\"text/javascript\">\r\n");
      out.write("     /*when use will click the Login link or want to buy something and user is not logged in then for sign in popup displaying  */\r\n");
      out.write("         $(document).ready(function(){\r\n");
      out.write("\t        $(\"#loginlink\").click(function(){\r\n");
      out.write("\t\t    $(\"#login\").modal(); \r\n");
      out.write("\t     });\r\n");
      out.write("\t  \r\n");
      out.write("     /* when user will click the new to pet shop button then to close the log in pop up and open user details popup */\t  \r\n");
      out.write("\t    $(\"#newUserLogin\").click(function(){\r\n");
      out.write("\t\t\t $(\"#login\").modal(\"hide\");\r\n");
      out.write("\t\t\t $(\"#newUserDetails\").modal();\r\n");
      out.write("\t\t });\r\n");
      out.write("      });\r\n");
      out.write("  </script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
