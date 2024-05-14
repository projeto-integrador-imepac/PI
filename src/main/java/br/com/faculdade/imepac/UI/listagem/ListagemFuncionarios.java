/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.faculdade.imepac.UI.listagem;

import br.com.faculdade.imepac.UI.cadastro.FormDadosFuncionario;
import br.com.faculdade.imepac.UI.cadastro.FormProjeto;
import br.com.faculdade.imepac.UI.commons.CommonMethods;
import br.com.faculdade.imepac.UI.edicao.FormDadosFuncionarioEdicao;
import br.com.faculdade.imepac.UI.edicao.FormProjetoEdicao;
import br.com.faculdade.imepac.entidade.pessoa.Funcionario;
import br.com.faculdade.imepac.infraestrutura.JPAUtil;
import br.com.faculdade.imepac.infraestrutura.Persistence;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gusta
 */
public class ListagemFuncionarios extends javax.swing.JPanel {

    private Funcionario funcionarioSelecionado;
    private JFrame frame;

    /**
     * Creates new form ListagemFuncionarios
     */
    public ListagemFuncionarios(JFrame frame) {
        initComponents();
        this.frame = frame;
        inicializeTable();
        addActions();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        jButtonArquivar = new javax.swing.JButton();
        jButtonEdicao = new javax.swing.JButton();

        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome"
            }
        ));
        jScrollPane1.setViewportView(jTableFuncionarios);

        jButtonArquivar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonArquivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/funcionario-deletar-icone.png"))); // NOI18N
        jButtonArquivar.setText("Arquivar");

        jButtonEdicao.setBackground(new java.awt.Color(0, 102, 255));
        jButtonEdicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icone-editar.png"))); // NOI18N
        jButtonEdicao.setText("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEdicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonArquivar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jButtonArquivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonArquivar;
    private javax.swing.JButton jButtonEdicao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionarios;
    // End of variables declaration//GEN-END:variables

    public void inicializeTable() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("CPF");
        modelo.addColumn("Nome");

        EntityManager em = JPAUtil.getEntityManager();
        Persistence ps = new Persistence(em);

        em.getTransaction().begin();
        List<Funcionario> listaFuncionarios = ps.getListEntity(Funcionario.class);

        for (Funcionario funcionario : listaFuncionarios) {
            modelo.addRow(new Object[]{funcionario.getCpf(), funcionario.getNome()});
        }

        // Atribua o modelo de tabela à tabela
        jTableFuncionarios.setModel(modelo);

        // Permita seleção única de linha na tabela
        jTableFuncionarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Adicione um ouvinte de seleção à tabela
        jTableFuncionarios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = jTableFuncionarios.getSelectedRow();
                    if (selectedRow != -1) { // Verifique se alguma linha está selecionada
                        // Recupere os dados da linha selecionada

                        // Obter o índice da linha selecionada na tabela
                        int rowIndex = jTableFuncionarios.convertRowIndexToModel(selectedRow);

                        // Obter o objeto Funcionario correspondente ao índice da linha
                        funcionarioSelecionado = listaFuncionarios.get(rowIndex);
                    }
                }

            }
        });
    }

    public void addActions() {

        jButtonEdicao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CommonMethods.goToNewPage(frame, new FormDadosFuncionarioEdicao(frame, funcionarioSelecionado.getId()));
            }
        });

        jButtonArquivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funcionarioSelecionado.setStatus(false);

                EntityManager em = JPAUtil.getEntityManager();
                Persistence ps = new Persistence(em);

                em.getTransaction().begin();
                ps.updateEntity(funcionarioSelecionado);
                em.close();
            }
        });
    }
}
