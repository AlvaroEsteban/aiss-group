package gamelive.controller.twitch;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gamelive.model.resources.TwitchResource;
import gamelive.model.twitch.User;

/**
 * Servlet implementation class TwitchFollowingList
 */
public class TwitchFollowingController extends HttpServlet {
	private static final Logger log = Logger.getLogger(TwitchFollowingController.class.getName());
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TwitchFollowingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accessToken=(String)request.getSession().getAttribute("Twitch-token");
		if(accessToken!=null &&!"".equals(accessToken)){
			TwitchResource tr = new TwitchResource();
			User user = tr.getUser(accessToken);
			if(user!=null) {
				request.setAttribute("user", user);
				request.getRequestDispatcher("/twitchFollowing.jsp").forward(request, response);
			} else {
				log.info("Probably your token has experied. Redirecting to OAuth servlet...");
				request.getRequestDispatcher("/AuthController/Twitch");
				
			}
		} else { 
			log.info("Intentando acceder a Twitch sin autentificación, redirigiendo a OAuth Servlet...");
			request.getRequestDispatcher("/AuthController/Twitch").forward(request,response);
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
