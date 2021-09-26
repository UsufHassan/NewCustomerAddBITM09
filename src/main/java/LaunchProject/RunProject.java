package LaunchProject;

import NewCustomerAdd.CustomerCreate;

public class RunProject extends CustomerCreate {
    public static void main(String[] args) {
        launch_Chrome();
        open_URL("http://demo.guru99.com/V1/index.php");
        Login();
        CreateCustomer();
        Close_Chrome();



    }
}
