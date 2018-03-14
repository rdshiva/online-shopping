package net.shiva.onlineshopping.utilities;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtility {

	private static final String ABS_PATH ="D:\\projects\\spring\\online-shopping\\onlineshopping\\src\\main\\webapp\\assets\\images\\";
	private static String REAL_PATH="";
	private static final Logger logger = LoggerFactory.getLogger(FileUploadUtility.class);	
	
	public static void upLoadFile(HttpServletRequest request, MultipartFile file, String code) {
		//get the real path
		
		REAL_PATH = request.getSession().getServletContext().getRealPath("/assests/images");
		
		logger.info("kasjdfkljaskldjfklxxxxxxxx"+REAL_PATH);
		//REAL_PATH
		//all the directory exits, if not create the directory
		if(!new File(ABS_PATH).exists()) {
			//create the directories
			new File(ABS_PATH).mkdirs();
				
		}
		if(!new File(REAL_PATH).exists()) {
			//create the directories
			new File(REAL_PATH).mkdirs();
				
		}
		
		try {
			//server upload
			file.transferTo(new File (REAL_PATH + code + ".jpg"));
			//project dire upload
			file.transferTo(new File (ABS_PATH + code + ".jpg"));
		} catch (IOException e) {
			
		}
	}
}
