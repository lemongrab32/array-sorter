package com.github.lemongrab32.arraysort;

import com.github.lemongrab32.arraysort.model.Sorter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "arraySort", value = "/array_sort")
public class MainServlet extends HttpServlet {

    private Sorter sorter;

    public void init() {
        sorter = new Sorter();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");

        sorter.setNums(request.getParameter("nums"));

        try {
            String res = Arrays.toString(sorter.sort());
            request.setAttribute("res", "Sorted array: " + res.substring(1, res.length() - 1));
        } catch (NumberFormatException e) {
            request.setAttribute("res", "Incorrect data (expected data format - " +
                    "'5, 13, 8, 1, 21, 22'; provided - '" + sorter.getNums() + "'");
            sorter.setCorrect(false);
        }

        request.setAttribute("sort", sorter);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void destroy() {
    }
}