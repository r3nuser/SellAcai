package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author renan
 */
public class Menu extends JFrame{
    //USERNAME + PASSWORD
    private String username;
    private String password;
    //TABS AND TABMANAGER
    private JTabbedPane tabs;
    private JPanel panel_sell;
    private JPanel panel_stock;
    private JPanel panel_product;
    //CONSTRUCTOR METHOD
    public Menu(String username, String password){
        //CONSTRUCTOR CLASS TAKING USERNAME AND PASSWORD
        this.username = username;
        this.password = password;
        initAll();
    }
    //INITIALIZE ALL COMPONENTS + SCREEN
    private void initAll(){
        initComponents();
        // SCREEN PROPERTIES
        setSize(1000,700);
        setLocationRelativeTo(null);
        setTitle("SellAcai");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    //INITILIZE ALL COMPONENTS ON SCREEN
    private void initComponents(){
        //THIS PART INITIALIZE TABS AND PANELS
        //tab manager
        tabs = new JTabbedPane(JTabbedPane.LEFT);
        //panels
        panel_sell = new Panel_sell(username,password);
        panel_product = new Panel_product(username,password);
        panel_stock = new Panel_stock(username,password);
        //ADD PANEL IN TAB
        tabs.addTab("Vendas",null,panel_sell);
        tabs.addTab("Produtos",null,panel_product);
        tabs.addTab("Estoque",null,panel_stock);
        //THIS PART ADD ALL COMPONENTS ON JFRAME
        add(tabs,BorderLayout.CENTER);
    }
    
}
