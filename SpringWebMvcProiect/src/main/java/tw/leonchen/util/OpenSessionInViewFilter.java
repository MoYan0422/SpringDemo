package tw.leonchen.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
@WebFilter(urlPatterns = "/*")
public class OpenSessionInViewFilter implements Filter {
	private SessionFactory sessionFactory;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	ServletContext servletContext = filterConfig.getServletContext();
	WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
 	this.sessionFactory = context.getBean("sessionFactory",SessionFactory.class);
	
	}

	public OpenSessionInViewFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			System.out.println("transction Begin");
		
			filterChain.doFilter(request, response);
		
			session.getTransaction().commit();
			System.out.println("commit");
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("roll back");
			e.printStackTrace();
		}
		

	}

}
