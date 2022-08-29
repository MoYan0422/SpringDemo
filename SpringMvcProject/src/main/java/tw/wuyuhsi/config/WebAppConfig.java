package tw.wuyuhsi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//相當於mvc-servlet.xml
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = {"tw.wuyuhsi"})
public class WebAppConfig implements WebMvcConfigurer {

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
		
	}
	

}
