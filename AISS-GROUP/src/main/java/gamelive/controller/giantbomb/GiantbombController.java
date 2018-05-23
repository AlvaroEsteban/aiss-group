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
import gamelive.model.ign.NewSearch;
import gamelive.model.resources.GiantbombResource;
import gamelive.model.resources.NewSearchResource;

/**
 * Servlet implementation class GiantbombController
 */
public class GiantbombController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(GiantbombController.class.getName());
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GiantbombController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		RequestDispatcher rd = null;
		
		log.log(Level.FINE, "Buscando noticias en Giantbomb");
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
		doGet(request, response);
	}

}
