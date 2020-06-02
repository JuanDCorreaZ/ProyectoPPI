package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!---->\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos1.css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Oswald:wght@300&family=Quicksand:wght@300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"icon\" type=\"image/svg\" href=\"imagenes/seguridad.svg\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>HOME</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"menu\">\n");
      out.write("\n");
      out.write("            <span id=\"nombre_app\">SEGURIDAD CON FRONTERAS</span> \n");
      out.write("\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"contenedor\" >\n");
      out.write("            <div class=\"slider-contenedor\">\n");
      out.write("\n");
      out.write("                <section class=\"contenido-slider\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <h1 id=\"title\">¡Bienvenido a Seguridad con fronteras!</h1>\n");
      out.write("                        <!--<h2>Reg&iacute;strate y podr&aacute;s hacer reportes</h2>-->\n");
      out.write("                        <h2>Reg&iacute;strate para poder reportar anomal&iacute;as.</h2>\n");
      out.write("                        <a href=\"registro.jsp\">Registrarse</a>\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"imagenes/Orangemapa_inicio.svg\" alt=\" \"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </section><!-- Contenido 1 -->\n");
      out.write("                <section class=\"contenido-slider\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <h1 id=\"title\">Inf&oacute;rmate de las fronteras invisibles de la ciudad.</h1>\n");
      out.write("                        <h2>Mira en el mapa posibles fronteras invisibles para saber por d&oacute;nde transitar con confianza</h2>\n");
      out.write("                        <!--<a href=\"#registrar\">Registrarse</a>-->\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"imagenes/camianr_rojo.svg\" alt=\" \"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </section><!-- Contenido 2 -->\n");
      out.write("                <section class=\"contenido-slider\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <h1 id=\"title\">La seguridad en los barrios de la ciudad</h1>\n");
      out.write("                        <h2>Consulta en el mapa el promedio de seguridad de los barrios de la ciudad de Medell&iacute;n</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"imagenes/green_map(1).svg\" alt=\" \"/>\n");
      out.write("\n");
      out.write("                </section><!-- Contenido 3-->\n");
      out.write("\n");
      out.write("                <section class=\"contenido-slider\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <h1 id=\"title\">Reporta</h1>\n");
      out.write("                        <h2>¿Tienes algo por reportar? <a id=\"hiper_login\" href=\"login.jsp\">Inicia sesi&oacute;n</a></h2>\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"imagenes/login_hip.svg\" alt=\" \"/>\n");
      out.write("\n");
      out.write("                </section><!-- Contenido 4-->\n");
      out.write("\n");
      out.write("                <section class=\"contenido-slider\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <h1 id=\"title\">¡Bienvenido a Seguridad con fronteras!</h1>\n");
      out.write("                        <h2>Reg&iacute;strate para poder reportar anomal&iacute;as.</h2>\n");
      out.write("                        <a href=\"#registrar\">Registrarse</a>\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"imagenes/Orangemapa_inicio.svg\" alt=\" \"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </section><!-- Contenido 1 que se repite -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div> <!-- Contenedor -->\n");
      out.write("        </div><!-- Slider-contenedor -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--<div class=\"areal\">\n");
      out.write("            <img id=\"mapa\" src=\"imagenes/mapa.home.png\"  />\n");
      out.write("        </div>-->\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/js1.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--<script type=\"text/javascript\">\n");
      out.write("    let slider = document.querySelector('.slider-contenedor');\n");
      out.write("    let sliderIndividual = document.querySelectorAll('.contenido-slider');\n");
      out.write("    let contador = 1;\n");
      out.write("    let width = sliderIndividual[0].clientWidth;\n");
      out.write("    let intervalo = 4000;\n");
      out.write("\n");
      out.write("    window.addEventListener(\"resize\", function () {\n");
      out.write("\n");
      out.write("        width = sliderIndividual[0].clientWidth;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    setInterval(function () {\n");
      out.write("\n");
      out.write("        slides();\n");
      out.write("\n");
      out.write("\n");
      out.write("    }, intervalo);\n");
      out.write("\n");
      out.write("\n");
      out.write("    function slides() {\n");
      out.write("\n");
      out.write("        slider.style.transform = \"translate( \" + (-width * contador) + \"px)\";\n");
      out.write("        slider.style.transition = \"transform 1s\";\n");
      out.write("\n");
      out.write("        contador++;\n");
      out.write("\n");
      out.write("\n");
      out.write("        if (contador === sliderIndividual.length) {\n");
      out.write("\n");
      out.write("            setTimeout(function () {\n");
      out.write("\n");
      out.write("                slider.style.transform = \"translate(0px)\";\n");
      out.write("                slider.style.transition = \"transform 0s\";\n");
      out.write("\n");
      out.write("                contador=1;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            },1500);\n");
      out.write("\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>-->");
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
