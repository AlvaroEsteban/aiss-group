package aiss.controller.ign;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.ign.NewSearch;
import aiss.model.resources.NewSearchResource;

public class NewSearchController extends HttpServlet {
	
	private static final Logger log = Logger.getLogger(NewSearchController.class.getName());
	
    public NewSearchController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		RequestDispatcher rd = null;
		
		log.log(Level.FINE, "Buscando noticias en IGN");
		NewSearchResource  ign = new NewSearchResource();
		NewSearch ignResults = ign.getNews();
		
		/*
		// Load contacts
		NewRepository repository = NewRepository.getInstance();
		Map<String,NewSearch> news = repository.getNews();
		
		 log.log(Level.FINE, "Processing GET request:  " + news.size() + " contacts loaded.");
		
		// Send contacts to index.jsp
		request.setAttribute("news", news);
		request.getRequestDispatcher("/newListView.jsp").forward(request, response);
		*/
		
		if(ignResults!= null) {
			rd = request.getRequestDispatcher("/successNew.jsp");
			request.setAttribute("articles", ignResults.getArticles() );
		} else {
			log.log(Level.SEVERE, "IGN object: " + ignResults);
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
}
