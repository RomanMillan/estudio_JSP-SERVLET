/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2023-03-02 17:54:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>Inicio</title>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("		<h1>Esta es la pagina de inicio</h1>\r\n");
      out.write("		<h2>Aquí se pinden los datos</h2>\r\n");
      out.write("		\r\n");
      out.write("		<form action=\"pagina2.jsp\" method=\"post\">\r\n");
      out.write("			\r\n");
      out.write("			<!-- datos personales -->\r\n");
      out.write("			Nombre: <input type=\"text\" name=\"nameUser\">	<br>\r\n");
      out.write("			Color favorito: <input type=\"text\" name=\"favoriteColor\"> <br>	\r\n");
      out.write("			Email: <input type=\"email\" name=\"email\"> <br>\r\n");
      out.write("			\r\n");
      out.write("			<!-- eleccion por radio button -->\r\n");
      out.write("			<p>Elige el transporte preferido</p>\r\n");
      out.write("			<input type=\"radio\" name=\"transport\" value=\"coche\"> Car\r\n");
      out.write("			<input type=\"radio\" name=\"transport\" value=\"avion\">Avión\r\n");
      out.write("			<input type=\"radio\" name=\"transport\" value=\"autobus\"> Autobus\r\n");
      out.write("			<br>\r\n");
      out.write("			\r\n");
      out.write("			<!-- eleccion por checkbox -->\r\n");
      out.write("			<p>Destino favorito</p>\r\n");
      out.write("			<input type=\"checkbox\" name=\"city\" value=\"ciudad\"> Ciudad <br>\r\n");
      out.write("			<input type=\"checkbox\" name=\"forest\" value=\"bosque\"> Bosque <br>\r\n");
      out.write("			<input type=\"checkbox\" name=\"beach\" value=\"playa\"> Playa <br>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			<!-- Poner un comentario -->\r\n");
      out.write("			<p>Escribe un comentario</p>\r\n");
      out.write("			<textarea name=\"comment\" rows=\"5\" cols=\"30\"></textarea>\r\n");
      out.write("			\r\n");
      out.write("			<!-- eleccion con un select -->\r\n");
      out.write("			<p>Eligue el idoma natal: </p>\r\n");
      out.write("			<select name=\"language\">\r\n");
      out.write("				<option>Español</option>\r\n");
      out.write("				<option>Inglés</option>\r\n");
      out.write("				<option>Frances</option>\r\n");
      out.write("				<option>Alemán</option>\r\n");
      out.write("			</select>\r\n");
      out.write("			<br>\r\n");
      out.write("			\r\n");
      out.write("			<!-- selector multiple -->\r\n");
      out.write("			<p>Eligue los lenguajes de programación que sepas: (Ctrl-click varias)</p>\r\n");
      out.write("			<select name=\"languageCode\" multiple>\r\n");
      out.write("				<option>Java</option>\r\n");
      out.write("				<option>C/C++</option>\r\n");
      out.write("				<option>Basic</option>\r\n");
      out.write("				<option>Phyton</option>\r\n");
      out.write("				<option>Pascal</option>\r\n");
      out.write("			</select>\r\n");
      out.write("			<br>\r\n");
      out.write("			\r\n");
      out.write("			<!-- botones para enviar y borrar -->\r\n");
      out.write("			<input type=\"reset\" value=\"Borrar\">\r\n");
      out.write("			<input type=\"submit\" value=\"Enviar\">\r\n");
      out.write("			\r\n");
      out.write("		</form>\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
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
}