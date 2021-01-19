package jp.co.mytimes.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImgUploadController {
	
	@RequestMapping(value="/upload", method = RequestMethod.POST)
	public String upload(@RequestParam(value="img")MultipartFile img, HttpServletRequest request)
	  throws Exception {
	  //getSize() 
	  if (img.getSize() > 0) {
	    //get path of file
	    String path = request.getSession().getServletContext().getRealPath("file");
	    //get name of upload file
	    String fileName = img.getOriginalFilename();
	    File file = new File(path, fileName);
	    img.transferTo(file);
	    //set file to request 
	    request.setAttribute("filePath", "file/"+fileName);
	    return "upload";
	  }
	  return "error";
	}
	
	@RequestMapping(value="/init")
	public String init(HttpServletRequest request)
	  throws Exception {
	    return "upload";
	}
}
