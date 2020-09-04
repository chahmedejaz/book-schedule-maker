package GUI;
import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class BSM extends javax.swing.JFrame {
    int c;
    int t1;
    int t2;
    int total;
    DefaultTableModel model;
   
    public BSM() {
        
        initComponents();
       
        disableInput();
        editTable();
        model = (DefaultTableModel)jTable1.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 1024, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 550));
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("x");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(970, 10, 40, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOOK SCHEDULE MAKER");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 45);

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 140, 180, 30);

        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(410, 140, 180, 30);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Total Pages");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(20, 80, 110, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Total Chapters");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(140, 80, 120, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Total Location");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(280, 80, 130, 23);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Task"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 990, 350);

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 140, 110, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Locations"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Pages"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Chapters"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(680, 140, 30, 20);

        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(210, 140, 180, 30);

        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(740, 140, 260, 30);

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(940, 110, 57, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Developed by Ahmed Ijaz");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 530, 240, 15);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        enableInput();
         c = 1;
        userPrompt(c);
        editTable();
        clearTable();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        enableInput();
         c = 2;
        userPrompt(c);
        editTable();
        clearTable();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        enableInput();
         c = 3;
        userPrompt(c);
        editTable();
        clearTable();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        clearTable();
        
        try{
            t1 = Integer.parseInt(jTextField1.getText());
            t2 = Integer.parseInt(jTextField3.getText());

            int N = Integer.parseInt(jTextField2.getText());
        
            schedule(N);
            
        }catch(InputMismatchException | NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please enter integers only!","Error",JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
        jTextField1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if ("".equals(jTextField1.getText())){
            jTextField1.setForeground(new Color(153,153,153)); 
             switch(c){
            case 1:
                    jTextField1.setText("Enter The no. of first page");

                break;
            case 2:
                    jTextField1.setText("Enter The no. of first chapter");

                break;
                
            case 3:
                    jTextField1.setText("Enter The no. of first location");
    
                break;

        }
   
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        jTextField3.setText("");
        jTextField3.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
       
        if ("".equals(jTextField3.getText())){
             jTextField3.setForeground(new Color(153,153,153)); 
            switch(c){
            case 1:
       
                    jTextField3.setText("Enter The no. of second page");
                break;
            case 2:
        
                    jTextField3.setText("Enter The no. of second chapter");
                break;
                
            case 3:
         
                    jTextField3.setText("Enter The no. of second location");
                break;

        }
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.setText("");
        jTextField2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if ("".equals(jTextField2.getText())){
            jTextField2.setForeground(new Color(153,153,153));
     
            jTextField2.setText("Enter the required no. of days");
       
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        int tr = model.getRowCount();
        int cr = model.getColumnCount();
//        jLabel2.setText(tr + " " + cr);
        
        try{
           if ("".equals(jTextField4.getText().trim()) || "Enter the name of book".equals(jTextField4.getText().trim())){
               throw new InputMismatchException();
           }
           if (tr == 0){
               throw new InputMismatchException();
           }
           
           try(PrintWriter pw = new PrintWriter(jTextField4.getText().trim() + "_Schedule.txt")){
            pw.println("Schedule of " + jTextField4.getText().trim()); pw.println();
            switch(c){
                case 1:
                    pw.printf("%-20s%-20s\n", "Date","Pages");
                    break;
                case 2:
                    pw.printf("%-20s%-20s\n", "Date","Chapters");
                    break;
                case 3:
                    pw.printf("%-20s%-20s\n", "Date","Locations");
                    break;
            }
  
            for (int i = 0; i < tr; i++){
                for (int j = 0; j < cr; j++){
                    pw.printf("%-20s", model.getValueAt(i, j).toString());
                }
                pw.println();
            }
            
            JOptionPane.showMessageDialog(this, "Schedule has been saved in the installation folder.", "Successful", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Schedule could not be created.", "Error", JOptionPane.ERROR_MESSAGE);
        }
           
           
        } catch(InputMismatchException e){
            JOptionPane.showMessageDialog(this, "Book Name or Table cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
    
        jTextField4.setText("");
        jTextField4.setForeground(Color.BLACK); 
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
       if ("".equals(jTextField4.getText())){
             jTextField4.setForeground(new Color(153,153,153));
             jTextField4.setText("Enter the name of book");
        }
    }//GEN-LAST:event_jTextField4FocusLost

    
    //********SMALL FUNCTIONS*********
    
    private void disableInput(){
        
            jTextField1.enable(false);
            jTextField2.enable(false);
            jTextField3.enable(false);
            jTextField4.enable(false);

    }
    
    private void enableInput(){
        
            jTextField1.enable(true);
            jTextField2.enable(true);
            jTextField3.enable(true);
            jTextField4.enable(true);

    }
    
    private void userPrompt(int c){
        
        
        switch(c){
            case 1:
                    jTextField1.setText("Enter The no. of first page");
                    jTextField3.setText("Enter The no. of second page");
                break;
            case 2:
                    jTextField1.setText("Enter The no. of first chapter");
                    jTextField3.setText("Enter The no. of second chapter");
                break;
                
            case 3:
                    jTextField1.setText("Enter The no. of first location");
                    jTextField3.setText("Enter The no. of second location");
                break;

        }
        
        jTextField1.setForeground(new Color(153,153,153)); jTextField2.setForeground(new Color(153,153,153)); jTextField3.setForeground(new Color(153,153,153));
        jTextField4.setForeground(new Color(153,153,153));
        jTextField2.setText("Enter the required no. of days");
        jTextField4.setText("Enter the name of book");

    }
    
    
    private void editTable(){
        
        
        jTable1.getTableHeader().setFont(new Font ("Tahoma", Font.BOLD, 18));
        
        switch(c){
            case 1:
                    jTable1.setModel(jTable3.getModel());
                   
                break;
            case 2:
                    jTable1.setModel(jTable4.getModel());
                break;
                
            case 3:
                    jTable1.setModel(jTable2.getModel());
                break;
   
        }
        
        
  
    }
    
    public void clearTable(){
        
        while(model.getRowCount() > 0){

            for (int i = 0; i < model.getRowCount(); i++){
                model.removeRow(i);
            }
        
        }
        
    }
 
    
    public void schedule(int N){
        total = t2 - t1;
        
        try {
            
            if (N > total){
                throw new IllegalArgumentException();
            }
            
                int h = Math.round(total/N);

                model = (DefaultTableModel)jTable1.getModel();

                Date today = new Date();
                SimpleDateFormat df = new SimpleDateFormat("dd-MMMMM-yyyy");

                long t0 = today.getTime();
                int h0 = t1; int h1;
                int flag = 1;
                
                while(h0 + h <= t2){
                    h1 = h0 + h;
                    
                    switch(flag){
                        
                        case 1:
                            if ((h1 == t2) || ((t2 - h1) < h)){
                        
                            model.insertRow(model.getRowCount(), new Object[]{df.format(t0), h0 + " to End"});
                        h0 = t2;
                    } else {

                        model.insertRow(model.getRowCount(), new Object[]{df.format(t0), h0 + " to " + h1});
                    }
                        flag = 2;                        
                        break;
                            
                        case 2:
                            if ((h1 == t2) || ((t2 - h1) < h)){

                            model.insertRow(model.getRowCount(), new Object[]{df.format(t0), ++h0 + " to End"});
                        h0 = t2;
                    } else {

                        model.insertRow(model.getRowCount(), new Object[]{df.format(t0), ++h0 + " to " + h1});
                    }
                        break;
                            
                            
                    }

                    h0 = h1;
                    t0 += 86400000;
                }
            
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, "Total number of days cannot be greater than total pages, chapters or locations", "Error", JOptionPane.ERROR_MESSAGE);
        }

        
    }

    
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
            java.util.logging.Logger.getLogger(BSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BSM().setVisible(true);
            }
        });
    }  // MAIN

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
