package www.silver.hom;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@Resource(name = "cname")
	String name;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	
	
}
