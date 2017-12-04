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
    //variables that need to be created once
    private int count;
    QuestionBean qb = new QuestionBean();
    String answer;

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
        //variables that need to be created inside doPost
        qb.addQuestion();
        String[][][] questions = qb.getQuestions();
        RequestDispatcher r;
        int rnd = qb.getRnd();
        
        //if statements to decide which question to give
        //if count is > 0, sets answer in bean
        //sets page to be redirected to
        if(count == 0){
            qb.setqNumber(rnd);
            String question = (questions[0][0][qb.getqNumber()].toString());
            qb.setQuestion(question);
            qb.setsCount(count++);
            r = request.getRequestDispatcher("Questions.jsp");
            
        }
        else if(count == 1){
            answer = request.getParameter("answer");
            qb.setA1(answer);
            String question = (questions[0][count][qb.getqNumber()].toString());
            qb.setQuestion(question);
            qb.setsCount(count);
            count++;
            r = request.getRequestDispatcher("Questions.jsp");
        }
        else if(count == 2){
            answer = request.getParameter("answer");
            qb.setA2(answer);
            String question = (questions[1][0][qb.getqNumber()].toString());
            qb.setQuestion(question);
            qb.setsCount(count);
            count++;
            r = request.getRequestDispatcher("Questions.jsp");
        }
        else{
            answer = request.getParameter("answer");
            qb.setA3(answer);
            count = 0;
            r = request.getRequestDispatcher("Recommendation.jsp");
        }
        
            //redirect to jsp page
            request.setAttribute("qb", qb);
            r.forward(request,response);
        
        
        //send request for redirect to jsp page and use beans
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
