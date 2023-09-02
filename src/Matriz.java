import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Luis
 */
public class Matriz extends javax.swing.JFrame {

    Double[][] matriz1 = new Double[5][5];
    int x = 0;
    String[] matriz2 = new String[5];
    private JPanel painelResultados;

    public Matriz() {
        initComponents();
        painelResultados = new JPanel(new GridLayout(5, 5));
        painelResultados.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));  // Padding
        painelResultados.setLayout(new BoxLayout(painelResultados, BoxLayout.Y_AXIS));
        painelResultados.setBackground(new java.awt.Color(146, 136, 248));
        getContentPane().add(painelResultados, java.awt.BorderLayout.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        LeftBorder = new javax.swing.JPanel();
        PanelName = new javax.swing.JPanel();
        LabelNome = new javax.swing.JLabel();
        NomeAluno = new javax.swing.JTextField();
        PanelAdd = new javax.swing.JPanel();
        LabelNotas = new javax.swing.JLabel();
        nota1 = new javax.swing.JTextField();
        nota2 = new javax.swing.JTextField();
        nota3 = new javax.swing.JTextField();
        nota4 = new javax.swing.JTextField();
        nota5 = new javax.swing.JTextField();
        adicionarbtn = new javax.swing.JButton();
        Main = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(50, 38, 83));
        Header.setPreferredSize(new java.awt.Dimension(735, 50));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        LeftBorder.setBackground(new java.awt.Color(128, 98, 214));
        LeftBorder.setPreferredSize(new java.awt.Dimension(285, 385));

        PanelName.setBackground(new java.awt.Color(128, 98, 214));

        LabelNome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        LabelNome.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome.setText("Nome do aluno");

        NomeAluno.setBorder(null);
        NomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelNameLayout = new javax.swing.GroupLayout(PanelName);
        PanelName.setLayout(PanelNameLayout);
        PanelNameLayout.setHorizontalGroup(
            PanelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNameLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(PanelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NomeAluno))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        PanelNameLayout.setVerticalGroup(
            PanelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PanelAdd.setBackground(new java.awt.Color(128, 98, 214));

        LabelNotas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        LabelNotas.setForeground(new java.awt.Color(255, 255, 255));
        LabelNotas.setText("Notas");

        nota1.setBorder(null);
        nota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota1ActionPerformed(evt);
            }
        });

        nota2.setBorder(null);
        nota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota2ActionPerformed(evt);
            }
        });

        nota3.setBorder(null);
        nota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota3ActionPerformed(evt);
            }
        });

        nota4.setBorder(null);
        nota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota4ActionPerformed(evt);
            }
        });

        nota5.setBorder(null);
        nota5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota5ActionPerformed(evt);
            }
        });

        adicionarbtn.setText("Adicionar");
        adicionarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAddLayout = new javax.swing.GroupLayout(PanelAdd);
        PanelAdd.setLayout(PanelAddLayout);
        PanelAddLayout.setHorizontalGroup(
            PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddLayout.createSequentialGroup()
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nota5)
                            .addComponent(nota2)
                            .addComponent(nota1)
                            .addComponent(nota3)
                            .addComponent(nota4)
                            .addComponent(adicionarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(PanelAddLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(LabelNotas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAddLayout.setVerticalGroup(
            PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(LabelNotas)
                .addGap(18, 18, 18)
                .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(adicionarbtn)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LeftBorderLayout = new javax.swing.GroupLayout(LeftBorder);
        LeftBorder.setLayout(LeftBorderLayout);
        LeftBorderLayout.setHorizontalGroup(
            LeftBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LeftBorderLayout.setVerticalGroup(
            LeftBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftBorderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PanelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(LeftBorder, java.awt.BorderLayout.LINE_START);

        Main.setBackground(new java.awt.Color(146, 136, 248));

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        getContentPane().add(Main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeAlunoActionPerformed

    }//GEN-LAST:event_NomeAlunoActionPerformed

    private void nota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1ActionPerformed

    }//GEN-LAST:event_nota1ActionPerformed

    private void nota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota2ActionPerformed

    }//GEN-LAST:event_nota2ActionPerformed

    private void nota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota3ActionPerformed

    }//GEN-LAST:event_nota3ActionPerformed

    private void nota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota4ActionPerformed
   
    }//GEN-LAST:event_nota4ActionPerformed

    private void nota5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota5ActionPerformed
  
    }//GEN-LAST:event_nota5ActionPerformed

    private void adicionarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarbtnActionPerformed

        String situacao = "";
        double media = 0;
        double mediasala = 0;

        matriz2[x] = NomeAluno.getText();

        matriz1[0][x] = Double.parseDouble(nota1.getText());
        matriz1[1][x] = Double.parseDouble(nota2.getText());
        matriz1[2][x] = Double.parseDouble(nota3.getText());
        matriz1[3][x] = Double.parseDouble(nota4.getText());
        matriz1[4][x] = Double.parseDouble(nota5.getText());
        x++;

        NomeAluno.setText("");
        nota1.setText("");
        nota2.setText("");
        nota3.setText("");
        nota4.setText("");
        nota5.setText("");

        if (x == 5) {
            x = 0;

            for (int i = 0; i < 5; i++) {
                media = (matriz1[0][i] + matriz1[1][i] + matriz1[2][i] + matriz1[3][i] + matriz1[4][i]) / 5;
                for (int j = 0; j < 5; j++) {
                    mediasala += media / 25;
                }

                if (media < 5) {
                    situacao = "reprovado";
                } else if (media >= 7) {
                    situacao = "aprovado";
                } else {
                    situacao = "exame";
                }

                JLabel resultadoLabel = new JLabel("Aluno: " + matriz2[i]);

                resultadoLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
                resultadoLabel.setForeground(new java.awt.Color(255, 255, 255));

                painelResultados.add(resultadoLabel);
                painelResultados.revalidate();
                painelResultados.repaint();

                JLabel mediaLabel = new JLabel("Media: " + Math.floor(media));

                mediaLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
                mediaLabel.setForeground(new java.awt.Color(255, 255, 255));

                painelResultados.add(mediaLabel);
                painelResultados.revalidate();
                painelResultados.repaint();

                JLabel situacaoLabel = new JLabel("Situação: " + (situacao));

                situacaoLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
                situacaoLabel.setForeground(new java.awt.Color(255, 255, 255));

                painelResultados.add(situacaoLabel);
                painelResultados.revalidate();
                painelResultados.repaint();
            }
            JLabel mediasalaLabel = new JLabel("Media da Classe: " + (Math.floor(mediasala)));

            mediasalaLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
            mediasalaLabel.setForeground(new java.awt.Color(255, 255, 255));

            painelResultados.add(mediasalaLabel);
            painelResultados.revalidate();
            painelResultados.repaint();
        }
    }//GEN-LAST:event_adicionarbtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Matriz().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelNotas;
    private javax.swing.JPanel LeftBorder;
    private javax.swing.JPanel Main;
    private javax.swing.JTextField NomeAluno;
    private javax.swing.JPanel PanelAdd;
    private javax.swing.JPanel PanelName;
    private javax.swing.JButton adicionarbtn;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField nota3;
    private javax.swing.JTextField nota4;
    private javax.swing.JTextField nota5;
    // End of variables declaration//GEN-END:variables
}

