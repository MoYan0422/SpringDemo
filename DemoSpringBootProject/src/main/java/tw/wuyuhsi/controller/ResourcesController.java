package tw.wuyuhsi.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourcesController {
	
	@Value("classpath:static/images/image02.jpg")
	private Resource resource;
	
	
	@GetMapping(path = "/resources22.controller" ,produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] prcessResourceAction() throws IOException {
		File file = resource.getFile();
		System.out.println(file.getName());
		InputStream inputStream = resource.getInputStream();
		return IOUtils.toByteArray(inputStream);
	}
	
	@GetMapping(path = "/resources.controller" ,produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] processAction() throws IOException { 
	    	Resource resource = new ClassPathResource("static/images/image02.jpg");
	    	File file1 = resource.getFile();
	    	System.out.println(file1.getName()+" "+file1.getPath());
	    	InputStream inputStream = resource.getInputStream();
	    	
	    	
	    	return IOUtils.toByteArray(inputStream);
	
	}
	
	@Autowired
	private ResourceLoader rl;
	
	@GetMapping(path = "/resourceloader.controller",produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] processResourceLoaderAction() throws IOException {
		Resource resource = rl.getResource("classpath:static/images/image02.jpg");
		File file = resource.getFile();
		System.out.println(file.getName());
		System.out.println(file.getPath());
		
		InputStream inputStream = resource.getInputStream();
		return IOUtils.toByteArray(inputStream);
		
		
	}
	
}
