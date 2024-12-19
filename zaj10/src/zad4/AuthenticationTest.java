package zad4;

public class AuthenticationTest {
    public static void main(String[] args) {
        Authentication userAuth = new UserAuthentication();
        System.out.println("Testing UserAuthentication:");
        userAuth.login("user", "password");
        userAuth.resetPassword("user", "password", "newPassword");
        userAuth.logout();

        Authentication adminAuth = new AdminAuthentication();
        System.out.println("Testing AdminAuthentication:");
        adminAuth.login("admin", "adminPassword");
        adminAuth.resetPassword("admin", "adminPassword", "newAdminPassword");
        adminAuth.logout();
    }
}
