package tw.leonchen.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import tw.leonchen.model.House;
import tw.leonchen.model.HouseService;

/**
 * Servlet implementation class DemoHouseServletAction
 */
@WebServlet("/DemoHouseServletAction.do")
public class DemoHouseServletAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WebApplicationContext context;
	
	
       
    @Override
    public void init() throws ServletException {
    	ServletContext application = getServletContext();
    	this.context = WebApplicationContextUtils.getWebApplicationContext(application);
    	
    	
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processAction(request,response);
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	private void processAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HouseService houseService = context.getBean("houseService",HouseService.class);
		try {
			House house = houseService.selectById(2);
			if (house!=null) {
				out.write(house.getHouseId()+""+house.getHouseName()+"<br/>");
			}else {
				out.write("no result<br/>");
			}
			
			List<House> houses = houseService.selectAll();
			for(int i =0 ;i<houses.size();i++) {
				House h = houses.get(i);
				out.write(h.getHouseId()+""+h.getHouseName()+"<br/>");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		out.close();
		
	}

}
