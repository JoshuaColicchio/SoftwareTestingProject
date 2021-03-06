package gui;

import app.Main;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JPanelFixture;
import org.junit.jupiter.api.*;

/**
 * Requirement:The system shall allow users to create new users by providing the first name,
 * last name, username and password for the new user.
 *
 * Input:None
 * Description: gui test, starts teh robot on going through the screens
 *
 * Dependencies: AssertJ
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class userCreationGT {
    private FrameFixture window;

    /**
     * Requirement:The system shall allow users to create new users by providing the first name,
     * last name, username and password for the new user.
     *
     * Description: sets up the test with the robut
     *
     * Dependencies: AssertJ
     */
@BeforeEach
    @DisplayName("Setting up test.")
    public void setUp() {
        Main frame = GuiActionRunner.execute(Main::new);
        window = new FrameFixture(frame);
        window.show();

        // Open the User Creation panel.
        frame.jMenuItem5.doClick();
    }


    /**
     * Requirement:The system shall allow users to create new users by providing the first name,
     * last name, username and password for the new user.
     *
     * Description: this ends the test in a clean manner
     *
     * Dependencies: AssertJ
     */
@AfterEach
    @DisplayName("Cleaning up test.")
    public void tearDown() {
        window.cleanUp();
    }
    /**
     * Requirement:The system shall allow users to create new users by providing the first name,
     * last name, username and password for the new user.
     *
     * Description: this ends the test in a clean manner
     *
     * Dependencies: AssertJ
     */
@Test
    @Order(1)
    @DisplayName("Is the panel showing?")
    public void isPanelVisible() {
        window.panel("UserCreationPanel").requireVisible();
    }

     /**
     * Requirement:The system shall allow users to create new users by providing the first name,
     * last name, username and password for the new user.
     *
     * Description: tests to see if an empty first name brings up the options pane,
      * with a robut.
     *
     * Dependencies: AssertJ
     */
@Test
    @Order(2)
    @DisplayName("Does an empty FirstName open the error dialog?")
    public void checkEmptyFirstName() {
        // Fill in the other fields so we know the first name text entry caused the dialog.
        window.textBox("txtLastName").setText("Jenkins");
        window.textBox("txtUserName").setText("Jenkins8802");
        window.textBox("txtPassword").setText("8802");

        // Try to add the user, checking if the error dialog opens.
        window.button("AddUserButton").click();
        window.optionPane().requireMessage("All fields are required!");
    }

    /**
     * Requirement:The system shall allow users to create new users by providing the first name,
     * last name, username and password for the new user.
     *
     * Description: tests to see if an empty last name brings up the options pane,
     * with a robut.
     *
     * Dependencies: AssertJ
     */
@Test
    @Order(3)
    @DisplayName("Does an empty LastName open the error dialog?")
    public void checkEmptyLastName() {
        // Fill in the other fields so we know the first name text entry caused the dialog.
        window.textBox("txtFirstName").setText("Leeroy");
        window.textBox("txtUserName").setText("Jenkins8802");
        window.textBox("txtPassword").setText("8802");

        // Try to add the user, checking if the error dialog opens.
        window.button("AddUserButton").click();
        window.optionPane().requireMessage("All fields are required!");
    }

    /**
     * Requirement:The system shall allow users to create new users by providing the first name,
     * last name, username and password for the new user.
     *
     * Description: tests to see if an empty user name brings up the options pane,
     * with a robut.
     *
     * Dependencies: AssertJ
     */
    @Order(4)
    @DisplayName("Does an empty User Name open the error dialog?")
    public void checkEmptyUserName() {
        // Fill in the other fields so we know the first name text entry caused the dialog.
        window.textBox("txtFirstName").setText("Leeroy");
        window.textBox("txtLastName").setText("Jenkins");
        window.textBox("txtPassword").setText("8802");

        // Try to add the user, checking if the error dialog opens.
        window.button("AddUserButton").click();
        window.optionPane().requireMessage("All fields are required!");
    }

    /**
     * Requirement:The system shall allow users to create new users by providing the first name,
     * last name, username and password for the new user.
     *
     * Description: tests to see if an empty password brings up the options pane,
     * with a robut.
     *
     * Dependencies: AssertJ
     */
@Test
    @Order(5)
    @DisplayName("Does an empty Password open the error dialog?")
    public void checkEmptyPassword() {
        // Fill in the other fields so we know the first name text entry caused the dialog.
        window.textBox("txtFirstName").setText("Leeroy");
        window.textBox("txtLastName").setText("Jenkins");
        window.textBox("txtUserName").setText("Jenkins8802");

        // Try to add the user, checking if the error dialog opens.
        window.button("AddUserButton").click();
        window.optionPane().requireMessage("All fields are required!");
    }

    /**
     * Requirement:The system shall allow users to create new users by providing the first name,
     * last name, username and password for the new user.
     *
     * Description: tests to see if the add user button works if everything is filled in,
     * with a robut.
     *
     * Dependencies: AssertJ
     */
@Test
    @Order(6)
    @DisplayName("Does the Add User button work correctly?")
    public void addValidUser() {
        // Fill in the other fields so we know the first name text entry caused the dialog.
        window.textBox("txtFirstName").setText("Leeroy");
        window.textBox("txtLastName").setText("Jenkins");
        window.textBox("txtUserName").setText("Jenkins8802");
        window.textBox("txtPassword").setText("8802");

        // Try to add the user, checking if the error dialog opens.
        window.button("AddUserButton").click();
        window.optionPane().requireMessage("User Created.........");
    }

    /**
     * Requirement:The system shall allow users to create new users by providing the first name,
     * last name, username and password for the new user.
     *
     * Description: tests to see if the cancel button closes the panel,
     * with a robut.
     *
     * Dependencies: AssertJ
     */
@Test
    @Order(7)
    @DisplayName("Does the cancel button close the panel?")
    public void hitCancelButton() {
        window.button("CancelButton").click();
    }
}