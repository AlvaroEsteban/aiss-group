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
import gamelive.model.resources.GiantBombSearchResource;

public class GiantBombSearchController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(GiantBombSearchController.class.getName());
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GiantBombSearchController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		RequestDispatcher rd = null;
		
		String busqueda = request.getParameter("name");
		
		log.log(Level.FINE, "Buscando juegos en GiantBomb");
		GiantBombSearchResource  gbr = new GiantBombSearchResource();
		Games games = gbr.getGamesByName(request.getParameter("name"));
		
		
		
		if(games!= null) {
			rd = request.getRequestDispatcher("/searchVideogameView.jsp");
			log.log(Level.FINE, "Juego 1: "+games.getResults().get(0).getName());
			request.setAttribute("games", games.getResults() );
			request.setAttribute("busqueda", busqueda);
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
