/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kusevic.ljetnizadatak.view;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import kusevic.ljetnizadatak.controller.ObradaRacuna;
import kusevic.ljetnizadatak.model.Racun;

/*
 * @author Tomislav
 */
public class FormaRacun extends javax.swing.JFrame {

    private Racun racun;
    private ObradaRacuna obrada;
    ArrayList<Racun> lista;

    public FormaRacun() {
        initComponents();
        racun = new Racun();
        obrada = new ObradaRacuna();
        ispis();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablicaRacun = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNoviRacun = new javax.swing.JButton();
        btnIsplata = new javax.swing.JButton();
        txtIznos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnUplata = new javax.swing.JButton();
        greska = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Racun");

        jPanel1.setBackground(new java.awt.Color(38, 40, 55));

        tablicaRacun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablicaRacun);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(55, 56, 76));

        btnNoviRacun.setBackground(new java.awt.Color(55, 56, 76));
        btnNoviRacun.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnNoviRacun.setForeground(new java.awt.Color(102, 178, 255));
        btnNoviRacun.setText("NOVI RAČUN");
        btnNoviRacun.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNoviRacun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNoviRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoviRacunActionPerformed(evt);
            }
        });

        btnIsplata.setBackground(new java.awt.Color(55, 56, 76));
        btnIsplata.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnIsplata.setForeground(new java.awt.Color(102, 178, 255));
        btnIsplata.setText("ISPLATA");
        btnIsplata.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIsplata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIsplata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsplataActionPerformed(evt);
            }
        });

        txtIznos.setBackground(new java.awt.Color(55, 56, 76));
        txtIznos.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtIznos.setForeground(new java.awt.Color(204, 204, 204));
        txtIznos.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("HRK");

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 178, 255));
        jLabel2.setText("IZNOS");

        btnUplata.setBackground(new java.awt.Color(55, 56, 76));
        btnUplata.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnUplata.setForeground(new java.awt.Color(102, 178, 255));
        btnUplata.setText("UPLATA");
        btnUplata.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUplata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUplata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUplataActionPerformed(evt);
            }
        });

        greska.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        greska.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnNoviRacun, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(greska, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtIznos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnUplata, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btnIsplata, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIznos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greska, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIsplata, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUplata, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(btnNoviRacun, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      private void ispis() {

        lista = new ArrayList<>(obrada.getRacuni());
        DefaultTableModel model = (DefaultTableModel) tablicaRacun.getModel();
        model.setColumnIdentifiers(new Object[]{ "Broj Racuna", "Datum otvaranja", "Stanje"});
        model.setRowCount(0);
        Object[] red = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            
            red[0] = lista.get(i).getBrojRacuna();
            red[1] = lista.get(i).getDatumOtvaranja();
            red[2] = lista.get(i).getStanjeRacuna();
            model.addRow(red);
        }
    }
    
    
    private void btnNoviRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoviRacunActionPerformed
        racun = new Racun();
        lista = new ArrayList<>(obrada.getRacuni());
        System.out.println(lista.size());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        racun.setDatumOtvaranja(dtf.format(now));
        BigInteger brojRacun = new BigInteger("10000000000");
        Integer broj = lista.size();
        BigInteger dodatak = new BigInteger(broj.toString());
        dodatak.add(dodatak);
        BigInteger result = brojRacun.add(dodatak);
        racun.setBrojRacuna(result.toString());
        racun.setStanjeRacuna("0.00");
        System.out.println(racun.getDatumOtvaranja() +" "+ racun.getBrojRacuna()+" " + racun.getStanjeRacuna());
        obrada.noviRacun(racun);
        ispis();
    }//GEN-LAST:event_btnNoviRacunActionPerformed

    private void btnIsplataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsplataActionPerformed
        greska.setText("");
        int red = tablicaRacun.getSelectedRow();
        lista = new ArrayList<>(obrada.getRacuni());
        BigDecimal stanje = new BigDecimal(lista.get(red).getStanjeRacuna());
        BigDecimal smanjenje = new BigDecimal(txtIznos.getText());
        BigDecimal kraj = stanje.add(smanjenje.negate());
        String stanjee = kraj.toString();
        if(kraj.compareTo(new BigDecimal ("0.00"))==-1)
        {
            greska.setText("NEDOVOLJAN IZNOS NA RACUNU!");
        }
        else {
        racun.setStanjeRacuna(stanjee);
        racun.setSifra(red + 1);
        obrada.uplata(racun);
        ispis();
        }
    }//GEN-LAST:event_btnIsplataActionPerformed

    private void btnUplataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUplataActionPerformed
        greska.setText("");
        int red = tablicaRacun.getSelectedRow();
        lista = new ArrayList<>(obrada.getRacuni());
        BigDecimal stanje = new BigDecimal(lista.get(red).getStanjeRacuna());
        BigDecimal povecanje = new BigDecimal(txtIznos.getText());
        BigDecimal kraj = stanje.add(povecanje);
        String stanjee = kraj.toString();
        System.out.println(stanjee);
        racun.setStanjeRacuna(stanjee);
        racun.setSifra(red + 1);
        obrada.uplata(racun);
        ispis();
    }//GEN-LAST:event_btnUplataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormaRacun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaRacun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaRacun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaRacun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaRacun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIsplata;
    private javax.swing.JButton btnNoviRacun;
    private javax.swing.JButton btnUplata;
    private javax.swing.JLabel greska;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablicaRacun;
    private javax.swing.JTextField txtIznos;
    // End of variables declaration//GEN-END:variables
}
