package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modal.BO.DeTaiBO;
import Modal.BO.DiemDTBO;

/**
 * Servlet implementation class HienThiDeTaiServlet
 */
@WebServlet("/HienThiDeTaiServlet")
public class HienThiDeTaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HienThiDeTaiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			DeTaiBO d = new DeTaiBO();
			request.setAttribute("dsDeTai", d.getDT());
			
			DiemDTBO diem = new DiemDTBO();
			request.setAttribute("dsDiem", diem.getDiemDT());
			
			RequestDispatcher rd = request.getRequestDispatcher("capnhatdiem.jsp");
			rd.forward(request, response);
			
		}catch(Exception ex){
			response.getWriter().println("<html><body> Thông báo "+ex.getMessage()+"</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
