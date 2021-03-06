package unit;

import app.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainUT {
    /**
     * Requirement:None
     * <p>
     * Input:String "CS001",
     * Description:Checks to see if hitting the button opens the corresponding panel
     * <p>
     * Dependencies: None
     * Expected Output: True
     * Actual Output: True
     * Statement Coverage: 67%
     * Branch Coverage: 100%
     */
    @Test
    void JMenuItem1ActionPerformed() {

        assertDoesNotThrow(()->{
            Main main = new Main();
            main.jMenuItem1.doClick();
            assertNotNull(main.jDesktopPane1);
        });
    }
    /**
     * Requirement:None
     * <p>
     * Input:String "CS001",
     * Description:Checks to see if hitting the button opens the corresponding panel
     * <p>
     * Dependencies: None
     * Expected Output: True
     * Actual Output: True
     * Statement Coverage: 67%
     * Branch Coverage: 100%
     */
    @Test
    void JMenuItem2ActionPerformed() {

        assertDoesNotThrow(()->{
            Main main = new Main();
            main.jMenuItem2.doClick();
            assertNotNull(main.jDesktopPane1);
        });
    }
    /**
     * Requirement:None
     * <p>
     * Input:String "CS001",
     * Description:Checks to see if hitting the button opens the corresponding panel
     * <p>
     * Dependencies: None
     * Expected Output: True
     * Actual Output: True
     * Statement Coverage: 67%
     * Branch Coverage: 100%
     */
    @Test
    void JMenuItem3ActionPerformed() {

        assertDoesNotThrow(()->{
            Main main = new Main();
            main.jMenuItem3.doClick();
            assertNotNull(main.jDesktopPane1);
        });
    }
    /**
     * Requirement:None
     * <p>
     * Input:String "CS001",
     * Description:Checks to see if hitting the button opens the corresponding panel
     * <p>
     * Dependencies: None
     * Expected Output: True
     * Actual Output: True
     * Statement Coverage: 67%
     * Branch Coverage: 100%
     */
    @Test
    void JMenuItem4ActionPerformed() {

        assertDoesNotThrow(()->{
            Main main = new Main();
            main.jMenuItem4.doClick();
            assertNotNull(main.jDesktopPane1);
        });
    }
    /**
     * Requirement:None
     * <p>
     * Input:String "CS001",
     * Description:Checks to see if hitting the button opens the corresponding panel
     * <p>
     * Dependencies: None
     * Expected Output: True
     * Actual Output: True
     * Statement Coverage: 67%
     * Branch Coverage: 100%
     */
    @Test
    void JMenuItem5ActionPerformed() {

        assertDoesNotThrow(()->{
            Main main = new Main();
            main.jMenuItem5.doClick();
            assertNotNull(main.jDesktopPane1);
        });
    }
    /**
     * Requirement:None
     * <p>
     * Input:String "CS001",
     * Description:Checks to see if hitting the button opens the corresponding panel
     * <p>
     * Dependencies: None
     * Expected Output: True
     * Actual Output: True
     * Statement Coverage: 67%
     * Branch Coverage: 100%
     */
    @Test
    void JMenuItem6ActionPerformed() {
        assertDoesNotThrow(()->{
            Main main = new Main();
            main.jMenuItem6.doClick();
        });
    }
    /**
     * Requirement:None
     * <p>
     * Input:String "CS001",
     * Description:Checks to see if calling main.main works correctly.
     * <p>
     * Dependencies: None
     * Expected Output: True
     * Actual Output: True
     * Statement Coverage: 4%
     * Branch Coverage: 100%
     */
   @Test
    @DisplayName("Calling Main.main")
    void testMain(){
        Main.main(new String[]{"arg1", "arg2", "arg3"});
    }
}