/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.faculdade.imepac.UI.edicao;

import br.com.faculdade.imepac.UI.commons.CommonMethods;
import br.com.faculdade.imepac.UI.commons.MaskFormatterFilter;
import br.com.faculdade.imepac.dao.Persistence;
import br.com.faculdade.imepac.entidade.pessoa.Funcionario;
import br.com.faculdade.imepac.entidade.projeto.Projeto;
import br.com.faculdade.imepac.infraestrutura.JPAUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class FormProjetoEdicao extends javax.swing.JPanel {

    private JFrame frame;
    private Projeto projeto;

    /**
     * Creates new form FormProjetoEdicao
     */
    public FormProjetoEdicao(JFrame frame, Long id) {
        this.frame = frame;
        EntityManager em = JPAUtil.getEntityManager();
        Persistence ps = new Persistence(em);

        this.projeto = ps.getEntity(Projeto.class, id);

        initComponents(); // Inicializa os componentes do formulário 
        this.inicializaFormulario(); // Inicializa o formulário
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPublicoAlvo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaJustificativa = new javax.swing.JTextArea();
        jLabelCadastroDeFuncionario1 = new javax.swing.JLabel();
        jButtonAtualizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldServico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldDataCriacao = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();

        jLabel5.setText("Data criação");

        jLabel6.setText("Público alvo");

        jLabel7.setText("Justificativa");

        jTextAreaJustificativa.setColumns(20);
        jTextAreaJustificativa.setRows(5);
        jScrollPane1.setViewportView(jTextAreaJustificativa);

        jLabelCadastroDeFuncionario1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabelCadastroDeFuncionario1.setText("Editar Projeto");

        jButtonAtualizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonAtualizar.setText(" Aplicar alteração");
        jButtonAtualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane3.setViewportView(jTextAreaDescricao);

        jLabel1.setText("Nome");

        jLabel2.setText("CEP");

        jLabel3.setText("Serviço");

        jLabel4.setText("Descrição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabelCadastroDeFuncionario1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldNome)
                                        .addGap(92, 92, 92))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jTextFieldServico, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(103, 103, 103))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jFormattedTextFieldDataCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jTextFieldPublicoAlvo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabelCadastroDeFuncionario1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldPublicoAlvo)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldDataCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCriacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCadastroDeFuncionario1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextArea jTextAreaJustificativa;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPublicoAlvo;
    private javax.swing.JTextField jTextFieldServico;
    // End of variables declaration//GEN-END:variables

    public void setOldValues() {
        // Obtém os valores dos campos do formulário
        jTextFieldNome.setText(this.projeto.getNome());
        jFormattedTextFieldCep.setText(this.projeto.getCep());
        jTextFieldServico.setText(this.projeto.getServico());
        jTextAreaDescricao.setText(this.projeto.getDescricao());
        jTextFieldPublicoAlvo.setText(this.projeto.getPublicoAlvo());
        jTextAreaJustificativa.setText(this.projeto.getJustificativa());

        jFormattedTextFieldDataCriacao.setValue(CommonMethods.removeSpecialCharacters(
                CommonMethods.dataFormatter(this.projeto.getDataCriacao())));

    }

    public void setNewValues() throws Exception {
        // Obtém os valores dos campos do formulário
        String nome = jTextFieldNome.getText();
        String cep = jFormattedTextFieldCep.getText();
        String servico = jTextFieldServico.getText();
        LocalDate dataCriacao = CommonMethods.parseStringToLocalDate(jFormattedTextFieldDataCriacao.getText());
        String publicoAlvo = jTextFieldPublicoAlvo.getText();
        String justificativa = jTextAreaJustificativa.getText();
        String descricao = jTextAreaJustificativa.getText();

        this.projeto.setNome(nome);
        this.projeto.setCep(CommonMethods.removeSpecialCharacters(cep));
        this.projeto.setServico(servico);
        this.projeto.setDataCriacao(dataCriacao);
        this.projeto.setPublicoAlvo(publicoAlvo);
        this.projeto.setJustificativa(justificativa);
        this.projeto.setDescricao(descricao);
    }

    private void inicializaFormulario() {
        this.formatajFormattedTextFields();
        this.setOldValues();
        this.updateProject();
    }

    /**
     * Configura a ação do botão salvar.
     */
    public void updateProject() {
        jButtonAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setNewValues(); // Define os valores do funcionárioa 

                    EntityManager em = JPAUtil.getEntityManager();
                    Persistence persistence = new Persistence(em); // Corrigindo a declaração da variável

                    em.getTransaction().begin();
                    persistence.updateEntity(projeto); // Salva o funcionário no banco de dados
                    em.getTransaction().commit();
                    em.close();

                    JOptionPane.showMessageDialog(null, "Projeto atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    closePage();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro! " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public void closePage() {
        this.setVisible(false);
    }

    private void formatajFormattedTextFields() {
        MaskFormatterFilter.formatTextField(jFormattedTextFieldDataCriacao, "##/##/####");
        MaskFormatterFilter.formatTextField(jFormattedTextFieldCep, "#####-###");
    }
}
