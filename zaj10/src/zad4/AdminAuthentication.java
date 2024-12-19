package zad4;

public class AdminAuthentication implements Authentication {
    @Override
    public boolean login(String username, String password) {
        System.out.println("Admin logged in");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Admin logged out");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        System.out.println("Admin password reset");
        return true;
    }
}

