package springsecurityJdbc.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {



  @GetMapping("/home")
  public String home(){
    return ("Welcome Home");
  }

  @GetMapping("/admin")
  public String admin(){
    return ("Welcome Admin");
  }

  @GetMapping("/")
  public String showAllAdmin(){
    return ("Welcome All");
  }

  @GetMapping("/user")
  public String user(){
    return ("Welcome user");
  }



}
