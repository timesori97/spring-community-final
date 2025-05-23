package www.silver.hom;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import www.silver.VO.memberVO;
import www.silver.service.IF_service;

@Controller
public class LoginController {

	@Inject
	IF_service service;
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login(@RequestParam("id") String id, @RequestParam("pass") String pass,
			HttpServletRequest request) {
			memberVO mvo = service.viewDetail(id);
			
			if(mvo != null) {
				if(pass.equals(mvo.getPass())) {
					HttpSession session = request.getSession();
					if(session.getAttribute("userid") != null) {
						session.removeAttribute("userid");
					}
					session.setAttribute("userid", mvo.getId());
				}
			}
			return "redirect:/";
		
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value = "/loginpage",method = RequestMethod.GET)
	public String loginpage() {
		return "member/login";
	}
	
}
