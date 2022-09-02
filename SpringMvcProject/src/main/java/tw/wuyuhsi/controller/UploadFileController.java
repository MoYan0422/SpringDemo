package tw.wuyuhsi.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import tw.wuyuhsi.model.Picture;
import tw.wuyuhsi.model.PictureService;

@Controller
public class UploadFileController {
	
	@GetMapping("/uploadFileMain.controller")
	public String processAction() {
		return "upLoadFile";
	}
	
	@PostMapping("/uploadfile.controller")
	@ResponseBody
	public String processAction(@RequestParam("myFiles") MultipartFile multipartFile) throws IllegalStateException, IOException {
		String filename = multipartFile.getOriginalFilename();
		
		String saveFlieDir = "c:/temp/upload";
		File file = new File(saveFlieDir,filename);
		
		
		
		byte[] b =multipartFile.getBytes();
		multipartFile.transferTo(file);
		
		if (filename!=null&& filename.length()!=0) {
			saveFlie(filename,b);
		}
		
			
		return "saveFilePath:" + file;
		
	}
	
	@Autowired
	private PictureService pictureService;

	private void saveFlie(String filename, byte[] b) {
		Picture picture = new Picture(filename,b);
		pictureService.insert(picture);
	}

		
	
	

}
