package gui;

import javax.swing.JPanel;

/**
 *
 * @author renan
 */
public class Panel_stock extends JPanel{
    
    private String password;
    private String username;
    
    protected Panel_stock(String username,String password){
        this.username = username;
        this.password=password;
        initAll();
    }
    
    private void initAll(){}
}
