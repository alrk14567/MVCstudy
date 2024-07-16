package viewer;

import controller.UserController;
import lombok.Setter;
import model.UserDTO;

import java.util.Scanner;

public class ReplyViewer {

    @Setter
    private UserDTO logIn;
    @Setter
    private Scanner scanner;
    @Setter
    UserController userController;
}
