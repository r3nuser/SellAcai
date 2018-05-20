package gui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author renan
 */
public class Panel_sell extends JPanel{
    
    private String password;
    private String username;
    
    private JTabbedPane tabs;
    
    
    protected Panel_sell(String username,String password){
        this.username = username;
        this.password=password;
        initAll();
    }
    
    private void initAll(){
        tabs = new JTabbedPane();
    }
}
