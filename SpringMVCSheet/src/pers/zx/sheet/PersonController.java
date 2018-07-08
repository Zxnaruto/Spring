package pers.zx.sheet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*������*/
@Controller
public class PersonController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView person(){
		return new ModelAndView("person","command",new Person());//�����personΪperson.jsp������command��Model������
		
	}
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String addPerson(@ModelAttribute("SpringWeb")Person person,ModelMap model){
		model.addAttribute("Id",person.getId());
		model.addAttribute("Name",person.getName());
		model.addAttribute("Age",person.getAge());
		
		return "result";
		
	}
	
}
