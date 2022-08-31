package tw.wuyuhsi.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//相當web.xml
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


	@Override //用來設定相當於beans.config.xml的java程式組態類別
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {RootAppConFig.class};
//		return null;
	}
	
	

	@Override
	protected Filter[] getServletFilters() {
//		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//		characterEncodingFilter.setEncoding("UTF-8");
//		characterEncodingFilter.setForceEncoding(true);
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter("UTF-8",true);
		return new Filter[] {characterEncodingFilter};
//		return null;
	}



	@Override	//用來設定相當於mvc-servlet.xml的java程式組態類別
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {WebAppConfig.class};
//		return null;
	}

	@Override	 //用來設定DispatcherServlet url-pattern 
	protected String[] getServletMappings() {
		return new String[] {"/"};
//		return null;
	}

}
