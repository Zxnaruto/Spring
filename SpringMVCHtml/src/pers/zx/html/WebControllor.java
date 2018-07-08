package pers.zx.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zx
 * 
 * SpringMVC ¾²Ì¬Ò³Ãæ
 *
 */
@Controller
public class WebControllor {

	 @RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() {
	       return "index";
	   }   
	   @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	   public String redirect() {     
	      return "redirect:/pages/final.html";
	   }
}
