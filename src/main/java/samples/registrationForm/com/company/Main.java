package samples.registrationForm.com.company;

import samples.registrationForm.com.company.controller.Controller;
import samples.registrationForm.com.company.model.Model;
import samples.registrationForm.com.company.view.View;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Controller controller =
                new Controller(new Model(), new View());
        // Run
        controller.processUser();
    }
}
