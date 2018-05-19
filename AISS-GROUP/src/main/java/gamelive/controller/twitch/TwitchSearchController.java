package gamelive.controller.twitch;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gamelive.model.resources.TwitchResource;
import gamelive.model.twitch.StreamSearch;


/**
 * Servlet implementation class TwitchSearchController
 */
public class TwitchSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TwitchSearchController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String busqueda = request.getParameter("query");
		RequestDispatcher r = null;
		
		
		TwitchResource tr = new TwitchResource();
		StreamSearch sts = tr.getStreamsByGame(busqueda);
		
		if(sts != null) {
			r= request.getRequestDispatcher("/searchView.jsp");
			request.setAttribute("streamlist", sts.getStreams());
			request.setAttribute("game", busqueda);
		} else {
			
			r = request.getRequestDispatcher("/error.jsp");
		}
		r.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
