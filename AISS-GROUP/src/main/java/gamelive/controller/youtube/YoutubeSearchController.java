package gamelive.controller.youtube;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gamelive.model.resources.YoutubeResource;
import gamelive.model.youtube.Item;
import gamelive.model.youtube.YoutubeSearch;

/**
 * Servlet implementation class YoutubeSearchController
 */
public class YoutubeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(YoutubeSearchController.class.getName());
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YoutubeSearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String accessToken=(String)req.getSession().getAttribute("Youtube-token");
		String q = req.getParameter("query");
		req.getSession().setAttribute("query", q);
		String query = (String)req.getSession().getAttribute("query");
		if(accessToken!=null && !"".equals(accessToken)){
			YoutubeResource ytr =new YoutubeResource(accessToken);
			YoutubeSearch videos = ytr.searchVideos(query);
			if(videos!=null){
				req.setAttribute("videos", videos);
				req.setAttribute("name", query);
				req.getRequestDispatcher("/videoListing.jsp").forward(req,resp);
			}else{
				log.info("The videos returned are null... probably your token has experied. Redirecting to OAuth servlet.");
				req.getRequestDispatcher("/AuthController/Youtube").forward(req,resp);
			}
		}else{
			log.info("Trying to acces to Youtube without an acces token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Youtube").forward(req,resp);
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
