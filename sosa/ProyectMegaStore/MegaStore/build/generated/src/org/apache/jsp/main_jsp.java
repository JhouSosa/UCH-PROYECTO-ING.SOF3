package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link href=\"menu/menu.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <title>.:: WilsonStore ::.</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"egcc_page\">\n");
      out.write("      <header class=\"egcc_header\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("      </header>\n");
      out.write("      <section class=\"egcc_menu\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu/menu.jsp", out, false);
      out.write("\n");
      out.write("      </section>\n");
      out.write("      <section class=\"egcc_content\">\n");
      out.write("          \n");
      out.write("          <img src=\"Tiemda3.png\" alt=\"\"/>\n");
      out.write("        <h1>DATOS DEL CURSO</h1>\n");
      out.write("        Nombre: Concurente<br/>\n");
      out.write("        Profesor: Gustavo \"EL CORONEL EN PROGRAMACION\"<br/>\n");
      out.write("        Horario: TURNO TARDE<br/>\n");
      out.write("        Cilco: CUARTO CICLO<br/>\n");
      out.write("        Periodo:2016-II\n");
      out.write("        <h1>INTEGRANTE</h1>\n");
      out.write("        - Bruno Alexander Galvan Garcia<br/>\n");
      out.write("        - Jeyson Shapiama Mojino<br/>\n");
      out.write("        - Carlos Castillo<br/>\n");
      out.write("        - Muños<br/>\n");
      out.write("      </section>\n");
      out.write("      <footer class=\"egcc_pie\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pie.jsp", out, false);
      out.write("\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
