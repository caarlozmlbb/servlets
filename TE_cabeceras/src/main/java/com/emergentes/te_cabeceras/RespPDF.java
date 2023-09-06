
package com.emergentes.te_cabeceras;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "RespPDF", urlPatterns = {"/RespPDF"})
public class RespPDF extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=archivo.pdf");
        PrintWriter out = response.getWriter();
        try {
            out.println("%PDF-1.4");
            out.println("1 0 obj");
            out.println("<< /Title (Mi PDF) /Author (Mi Nombre) /Creator (Mi Aplicación) >>");
            out.println("endobj");
            out.println("2 0 obj");
            out.println("<< /Type /Catalog /Pages 3 0 R >>");
            out.println("endobj");
            out.println("3 0 obj");
            out.println("<< /Type /Pages /Kids [4 0 R] /Count 1 >>");
            out.println("endobj");
            out.println("4 0 obj");
            out.println("<< /Type /Page /Parent 3 0 R /MediaBox [0 0 612 792] /Contents 5 0 R >>");
            out.println("endobj");
            out.println("5 0 obj");
            out.println("<< /Length 52 >>");
            out.println("stream");
            out.println("BT");
            out.println("/F1 12 Tf");
            out.println("72 712 Td");
            out.println("(Este es un PDF generado desde un servlet con out.println) Tj");
            out.println("ET");
            out.println("endstream");
            out.println("endobj");
            out.println("xref");
            out.println("0 6");
            out.println("0000000000 65535 f");
            out.println("0000000009 00000 n");
            out.println("0000000054 00000 n");
            out.println("0000000119 00000 n");
            out.println("0000000203 00000 n");
            out.println("0000000259 00000 n");
            out.println("trailer");
            out.println("<< /Size 6 /Root 2 0 R >>");
            out.println("startxref");
            out.println("289");
            out.println("%%EOF");
        }finally{
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
