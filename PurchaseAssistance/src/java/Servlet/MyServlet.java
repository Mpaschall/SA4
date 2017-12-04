package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.QuestionBean;
import java.util.Random;

@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {
    private int count;

       protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MyServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
       public void init(){
           int count = 0;
           
       }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        QuestionBean qb = new QuestionBean();
        qb.addQuestion();
        String[][][] questions = qb.getQuestions();
        RequestDispatcher r;
        int rnd = qb.getRnd();
                
        if(count == 0){
            qb.setqNumber(rnd);
            String question = (questions[0][0][qb.getqNumber()].toString());
            qb.setQuestion(question);
            qb.setsCount(count++);
            r = request.getRequestDispatcher("Recommendation.jsp");
            
        }
        else if(count == 1){
            String question = (questions[0][count][qb.getqNumber()].toString());
            qb.setQuestion(question);
            qb.setsCount(count);
            count++;
            r = request.getRequestDispatcher("Recommendation.jsp");
        }
        else if(count == 2){
            String question = (questions[1][0][qb.getqNumber()].toString());
            qb.setQuestion(question);
            qb.setsCount(count);
            count++;
            r = request.getRequestDispatcher("Recommendation.jsp");
        }
        else{
            count = 0;
            r = request.getRequestDispatcher("Questions.jsp");
        }
            request.setAttribute("qb", qb);
            r.forward(request,response);
        
        
        //send request for redirect to jsp page and use beans
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
