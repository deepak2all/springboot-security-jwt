package au.com.aem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created a Controller class for exposing a GET REST API
 * Mainly used for testing
 */
@RestController
public class HomeController {

	@RequestMapping({ "/" })
	public String somePage() {
		return "<h1>Welcome</h1>";
	}
	
	/**
	 * This is using GET and is configured to be non-authenticated 
	 * Henceforth lands in the home page
	 */
	@RequestMapping({ "/home" })
	public String homePage() {
		return "<h1>Welcome home</h1>";
	}
	
	/**
	 * Both the /user and /admin pages
	 * have to be authorized and henceforth
	 * and henceforth will display 401
	 * (unauthorized access)
	 */
	@RequestMapping({ "/user" })
	public String userPage() {
		return "<h1>Welcome User</h1>";
	}
	
	@RequestMapping({ "/admin" })
	public String adminPage() {
		return "<h1>Welcome Admin</h1>";
	}
	
	/**
	 * Hitting the /login endpoint using POST method with
	 * a) Correct Credentials -- Will generate JWT token
	 * JwtTokenUtil will generate token using the secret key specified in the properties file
	 * b) Incorrect Credentials -- Will display 401
	 */
}
