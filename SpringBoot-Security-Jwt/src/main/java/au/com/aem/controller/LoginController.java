package au.com.aem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created a Controller class for exposing a GET REST API
 */
@RestController
public class LoginController {

	@RequestMapping({ "/login" })
	public String loginPage() {
		return "Hello World";
	}
}
