public class Test {
    public static void main(String[] args) {
        System.out.println(
                "1. Login - Локатор: id("login_field")",
                "2.Password - Локатор: id("password")",
                "3. Sign in button - Локатор: name("commit"),
                "4. Forgot password - Локатор: link("Forgot password ? "),
                "5. Username or email address - Локатор: //label[contains(text(), "Username or email address")]",
                "6. "Password" - Локатор: //label[contains(text(), "Password")],
                "7. Sign in to Github - Локатор: //h1[contains(text(), "Sign in to GitHub")]",
                "8. "Create an account" - Локатор: //a[contains(text(), "Create an account")]",
                "9. "Terms" - Локатор: //a[contains(text(), "Terms")]",
                "10. "Privacy" - Локатор: //a[contains(text(), "Privacy")]",
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////
                "1. "Actions" - Локатор: //a[@data-ga-click="Header, go to Actions, text:actions "]",

                "2. " New workflow " - Локатор: //button[contains(text(), " New workflow ")]",

                "3. " Your workflows " - Локатор: //h2[contains(text(), " Your workflows ")]",

                "4. " Set up this workflow " - Локатор: //button[contains(text(), " Set up this workflow ")]",

                "5. " Run workflow " - Локатор: //button[contains(text(), "Run workflow")]");
    }
}
