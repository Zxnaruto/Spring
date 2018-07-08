package pers.zx.sheet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*控制器*/
@Controller
public class PersonController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView person(){
		return new ModelAndView("person","command",new Person());//里面的person为person.jsp的名，command是Model的名称
		
	}
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String addPerson(@ModelAttribute("SpringWeb")Person person,ModelMap model){
		model.addAttribute("Id",person.getId());
		model.addAttribute("Name",person.getName());
		model.addAttribute("Age",person.getAge());
		
		return "result";
		
	}
	
}
