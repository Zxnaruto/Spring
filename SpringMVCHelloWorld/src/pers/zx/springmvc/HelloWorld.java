package pers.zx.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zx
 * springmvc helloworld
 *
 */
@Controller
@RequestMapping("/hello")
public class HelloWorld {
	@RequestMapping(method=RequestMethod.GET)
	public String printhello(ModelMap model){
	
		model.addAttribute("message","Hello XiaoHuZiXianShengZx");
		return "hello";
	}
	
}
