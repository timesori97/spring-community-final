package www.silver.hom;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import www.silver.VO.memberVO;
import www.silver.service.IF_service;

@Controller
public class MemberController {
	
	@Inject	
	private IF_service service;

		@RequestMapping(value = "/memberjoind",method= RequestMethod.POST)
		public String memberjoind(memberVO mvo) {
			service.insertone(mvo);
			return "member/memberjoin";
		}
		
		@RequestMapping(value = "/memberjoin",method = RequestMethod.GET)
		public String memberjoin() {
			return"member/memberjoin";
		}
		
}
