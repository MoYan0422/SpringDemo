package tw.wuyuhsi.controller;


import java.io.File;
import java.io.IOException;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadAjaxController {
	private String savaFileDString = "D:\\test\\hyesss";
	
	@PostMapping(path = "upload.controller", produces = "application/json;UTF-8")
	public String processUploadFileAction(@RequestParam("myFile") MultipartFile multipartFile) throws IllegalStateException, IOException {
//		String realPath = request.getSession().getServletContext().getRealPath(savaFileDString);
//		System.out.println(realPath);
		File file = new File(savaFileDString);
		//自動幫忙建資料夾
		file.mkdirs();
		System.out.println("4564654646");
		
		String fileName = multipartFile.getOriginalFilename();
//		String fileName = "55555";
		
		
		File saveFile = new File(savaFileDString,fileName);
		multipartFile.transferTo(saveFile);
		
		return "檔名:"+fileName;
	}

}
