package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

public class BookDownloadServlet extends HttpServlet {
    File file = new File("D:\\Java\\HW26\\HW_lesson_26\\src\\main\\resources\\test.pdf");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/octet-stream");
        resp.setHeader("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");
        ServletOutputStream stream = resp.getOutputStream();
        stream.write(new BufferedInputStream(
                new FileInputStream(file)).readAllBytes());
        stream.close();
    }
}
