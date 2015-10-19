/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectGUI;

/**
 *
 * @author x13564737
 */
public class ProjectGUIApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProjectGUI myProjectGUI= new ProjectGUI();
        myProjectGUI.setVisible(true);
        StatsGUI myStatsGUI= new StatsGUI();
        myStatsGUI.setVisible(false);
    }
}
