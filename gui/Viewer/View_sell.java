public class View_sell extends JPanel{
    
    private String username;
    private String password;

    private JPanel painel_tabela;
    private JTable tabela;
    private DefaultTableModel dtm;
    private JScrollPane scroll;
    private JPanel painel_dados;
    private JTextField id;
    private JTextField dt_venda;
    private JTextField valor_venda;
    private JLabel id_l;
    private JLabel dt_venda_l;
    private JLabel valor_venda_l;
    
    protected View_sell(String username, String password){
        
        this.username = username;
        this.password = password;
        
        initAll();
        
    }

    private void initAll(){
        initTable();
        initData();
        configScreen();
    }

    private void initTable(){
        painel_tabela = new JPanel();

        scroll = new JScrollPane();

        dtm = new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex, int mColIndex){
                return false;
            }
        }

        tabela = new JTable(dtm);

        tabela.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke){
                if((ke.getKeyCode() == KeyEvent.VK_UP) || (ke.getKeyCode() == KeyEvent.VK_DOWN)){
                    // update...
                }
            }
        });

        tabela.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                // update...
            }
        });

        dtm.addColumn("ID: ");
        dtm.addColumn("Data da Venda:");
        dtm.addColumn("Valor da Venda:");

        tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(0).setMaxWidth(70);

        scroll = new JScrollPane(tabela);
        painel_tabela.add(scroll);

        add(painel_tabela, BorderLayout.CENTER);
    }
    private void initData(){
        painel_dados = new JPanel();

        id = new JTextField();
        dt_venda = new JTextField();
        valor_venda = new JTextField();

        id = new JLabel("ID");
        dt_venda_l = new JLabel("Data da Venda:");
        valor_venda_l = new JLabel("Valor da Venda:");

        id.setEnabled(false);
        dt_venda.setEnabled(false);
        valor_venda.setEnabled(false);

        painel_dados.add(dt_venda);
        painel_dados.add(dt_venda_l);
        painel_dados.add(valor_venda);
        painel_dados.add(valor_venda_l);

        add(painel_dados, BorderLayout.LINE_START);
    }
    private void configScreen(){
        setLayout(new BorderLayout());
        setVisible(true);
    }
}