package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author renan
 */
public class Panel_product extends JPanel{
    
    private String password;
    private String username;
    
    private JTabbedPane tabs;
    
    
    protected Panel_product(String username,String password){
        this.username = username;
        this.password=password;
        initAll();
    }
    
    private void initAll(){
        initComponents();
    }
    
    private void initComponents(){
        tabs = new JTabbedPane();
    }
}
