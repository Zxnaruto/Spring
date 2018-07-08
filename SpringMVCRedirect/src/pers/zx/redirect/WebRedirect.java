package pers.zx.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zx
 * SpringMVC 页面重定向
 *
 */
@Controller
public class WebRedirect {

	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(){
		return "index";//这个字符串是jsp的名字
	}
	@RequestMapping(value="/redirect",method=RequestMethod.GET)
	public String finalPage(){
		
		return "final";
	}
	
}
