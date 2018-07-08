package pers.zx.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zx
 * SpringMVC ҳ���ض���
 *
 */
@Controller
public class WebRedirect {

	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(){
		return "index";//����ַ�����jsp������
	}
	@RequestMapping(value="/redirect",method=RequestMethod.GET)
	public String finalPage(){
		
		return "final";
	}
	
}
