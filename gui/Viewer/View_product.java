public class View_product extends JPanel{

    private String password;
    private String username;
    private JPanel painel_tabela;
    private JTable tabela;
    private JScrollPane scroll;
    private DefaultTableModel dtm;
    private JPanel painel_dados;
    private JTextField id;
    private JTextField name;
    private JTextField qnt_estoque;
    private JTextField validade;
    private JLabel id_l;
    private JLabel name_l;
    private JLabel qnt_estoque_l;
    private JTextField validade_l;

    protected View_product(String username, String password){
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
                if((ke.getKeyCode() == KeyEvent.VK_UP) || (ke.getKeyCode() == keyEvent.VK_DOWN)){
                    // updatetextboxes();
                }
            }
        });

        tabela.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                // updatetextboxes();
            }
        });

        dtm.addColumn("ID: ");
        dtm.addColumn("Nome: ");
        dtm.addColumn("Qnt. Estoque: ");
        dtm.addColumn("Validade: ");

        tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(0).setMaxWidth(70);

        scroll = new JScrollPane(tabela);
        painel_tabela.add(scroll);

        add(painel_tabela, BorderLayout.CENTER);
    }

    private void initData(){
        painel_dados = new JPanel(null);

        id = new JTextField("");
        name = new JTextField("");
        qnt_estoque = new JTextField("");
        validade = new JTextField("");

        id_l = new JLabel("ID: ");
        name_l = new JLabel("Name: ");
        qnt_estoque_l = new JLabel("Qnt. Estoque: ");
        validade_l = new JLabel("Validade: ");

        id.setEnabled(false);
        name.setEnabled(false);
        qnt_estoque.setEnabled(false);
        validade.setEnabled(false);

        painel_dados.add(id);
        painel_dados.add(id_l);
        painel_dados.add(qnt_estoque);
        painel_dados.add(qnt_estoque_l);
        painel_dados.add(nome);
        painel_dados.add(nome_l);
        painel_dados.add(validade);
        painel_dados.add(validade_l);

        add(painel_dados, BorderLayout.LINE_START);
    }
    
    private void configScreen(){
        setLayout(new BorderLayout());
        setVisible();
    }

}