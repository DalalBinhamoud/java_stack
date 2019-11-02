package game_controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class home
 */
@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("guessNum") == null) {
			Random r = new Random();
			int randomInt = r.nextInt(100) + 1;
			session.setAttribute("guessNum", randomInt);
		}
		
		int result = (int) session.getAttribute("guessNum");
		
        request.setAttribute("num", result);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 	
	  	HttpSession session = request.getSession();
	  	int result = (int) session.getAttribute("guessNum");
	  	
		   String theNumber = request.getParameter("theNumber");
		   
		   int intNum = Integer.parseInt(theNumber);
		   
		   
		    if(intNum == result) {
		    request.setAttribute("booleanExpr", true);
		    request.setAttribute("msg", "was the number!");	
		    }else if(intNum < result) {
		    	request.setAttribute("mclass", "wrong");
		    	request.setAttribute("msg", "Too Low!");	
		    }else {
		    	request.setAttribute("mclass", "wrong");	
		    	request.setAttribute("msg", "To high! ");	
		    }
	      

		    RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
	        view.forward(request, response);
	}

}
