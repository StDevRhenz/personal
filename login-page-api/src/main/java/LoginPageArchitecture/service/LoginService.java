public class LoginService {
    private UserRepository userRepository;

    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticateUser(String username, String password) {
        User user = userRepository.findUserByUsername(username);
        return user != null && user.getPassword().equals(password);
    }

    public void registerUser(String username, String password) {
        User newUser = new User(username, password);
        userRepository.saveUser(newUser);
    }
}