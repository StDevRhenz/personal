import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import LoginPageArchitecture.controller.LoginController;
import LoginPageArchitecture.model.User;
import LoginPageArchitecture.service.LoginService;

public class LoginControllerTest {

    @InjectMocks
    private LoginController loginController;

    @Mock
    private LoginService loginService;

    private User user;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        user = new User();
        user.setUsername("testUser");
        user.setPassword("testPassword");
    }

    @Test
    public void testLoginUser_Success() {
        when(loginService.authenticateUser("testUser", "testPassword")).thenReturn(true);
        assertTrue(loginController.loginUser("testUser", "testPassword"));
    }

    @Test
    public void testLoginUser_Failure() {
        when(loginService.authenticateUser("testUser", "wrongPassword")).thenReturn(false);
        assertFalse(loginController.loginUser("testUser", "wrongPassword"));
    }

    @Test
    public void testLogoutUser() {
        assertTrue(loginController.logoutUser());
    }
}