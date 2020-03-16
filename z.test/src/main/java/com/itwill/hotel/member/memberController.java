package com.itwill.hotel.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class memberController {

	@RequestMapping(value = "/member_main")
	public String member_main() {
		String forwardPath = "member/member_main";
		return forwardPath;
	}
	
	@RequestMapping(value = "/member_list")
	public String member_list() {
		String forwardPath = "member/member_list";
		
		return forwardPath;
	}
}
