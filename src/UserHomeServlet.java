

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserHomeServlet
 */
@WebServlet("/UserHomeServlet")
public class UserHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Quiz q=new Quiz();
	QuizDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserHomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init()
    {
    	String jdbcURL=getServletContext().getInitParameter("dbURL");
    	String jdbcUserName=getServletContext().getInitParameter("dbUsername");
    	String jdbcPassword=getServletContext().getInitParameter("dbPass");
    	dao= new QuizDAO(jdbcURL,jdbcUserName,jdbcPassword);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action=request.getServletPath();
		
		try
		{
			
		switch(action)
		{
		case "/java":
			q.setTopic("java");
			QuizCall(request,response);
			break;
		case "/c":
			q.setTopic("c");
			QuizCall(request,response);
			break;
		case "/c++":
			q.setTopic("c++");
			QuizCall(request,response);
			break;
		case "/pyhton":
			q.setTopic("python");
			QuizCall(request,response);
			break;
		case "/css":
			q.setTopic("css");
			QuizCall(request,response);
			break;
		case "/html":
			q.setTopic("html");
			QuizCall(request,response);
			break;
		case "/php":
			q.setTopic("php");
			QuizCall(request,response);
			break;
		case "/sql":
			q.setTopic("sql");
			QuizCall(request,response);
			break;
		case "/javascript":
			q.setTopic("js");
			QuizCall(request,response);
			break;	
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
		
		private void QuizCall(HttpServletRequest request,HttpServletResponse response)
				throws SQLException,IOException,ServletException
		{
			
			int quiz_no=0;
			RequestDispatcher dis=request.getRequestDispatcher("QuizNumber.jsp");
			dis.forward(request, response);
			String act=request.getServletPath();
			switch(act)
			{
			case "/one":
				quiz_no = 1;
				break;
			case "/two":
				quiz_no=2;
				break;
			case "/three":
				quiz_no=3;
				break;
			case "/four":
				quiz_no=4;
				break;
				
			}
			
			List<Quiz> list=dao.completeQuiz(q.getTopic(),quiz_no);
			request.setAttribute("quiz", list);
			RequestDispatcher disp=request.getRequestDispatcher("TakeQuiz.jsp");
			disp.forward(request, response);
		
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
