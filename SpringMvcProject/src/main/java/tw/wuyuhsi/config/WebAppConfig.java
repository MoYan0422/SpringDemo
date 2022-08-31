package tw.wuyuhsi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


//相當於mvc-servlet.xml
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"tw.wuyuhsi"})
public class WebAppConfig implements WebMvcConfigurer {

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
		
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver irvr1 = new InternalResourceViewResolver();
		irvr1.setPrefix("/WEB-INF/pages/");
		irvr1.setSuffix(".jsp");
		irvr1.setOrder(6);
		return irvr1;
		
	}
	
	
	

}
