package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modal.BO.DiemDTBO;

/**
 * Servlet implementation class HienThiThongTinDeTaiSVServlet
 */
@WebServlet("/HienThiThongTinDeTaiSVServlet")
public class HienThiThongTinDeTaiSVServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HienThiThongTinDeTaiSVServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			DiemDTBO d = new DiemDTBO();
			request.setAttribute("dsDiem", d.getDiemDT());
			RequestDispatcher rd = request.getRequestDispatcher("trangchu.jsp");
			rd.forward(request, response);
		}catch(Exception e){
			response.getWriter().println("<html><body> Thông báo "+e.getMessage()+"</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
