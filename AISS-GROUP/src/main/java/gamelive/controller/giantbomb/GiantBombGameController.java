package gamelive.controller.giantbomb;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gamelive.model.giantbomb.Games;
import gamelive.model.resources.GiantbombResource;

/**
 * Servlet implementation class GiantBombGameController
 */
public class GiantBombGameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(GiantBombGameController.class.getName());
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GiantBombGameController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = null;
		
		log.log(Level.FINE, "Buscando tu juego en GiantBomb");
		GiantbombResource  gbr = new GiantbombResource();
		Games games = gbr.getGames();
		
		
		
		if(games!= null) {
			rd = request.getRequestDispatcher("/allGames.jsp");
			request.setAttribute("games", games.getResults() );
		} else {
			log.log(Level.SEVERE, "Giantbomb no devolvió ningún resultado");
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
