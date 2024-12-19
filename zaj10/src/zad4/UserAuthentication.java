package zad4;

public class UserAuthentication implements Authentication {

    @Override
    public boolean login(String username, String password) {
        System.out.println("User logged in");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("User logged out");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        System.out.println("User password reset");
        return true;
    }
}
