package LoginPageArchitecture.controller;

import org.springframework.web.bind.annotation.*;
import LoginPageArchitecture.model.User;
import LoginPageArchitecture.service.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {
        if (loginService.authenticateUser(user.getUsername(), user.getPassword())) {
            return "Login successful!";
        } else {
            return "Invalid username or password.";
        }
    }

    @PostMapping("/logout")
    public String logoutUser() {
        // Logic for logout can be implemented here
        return "Logout successful!";
    }
}