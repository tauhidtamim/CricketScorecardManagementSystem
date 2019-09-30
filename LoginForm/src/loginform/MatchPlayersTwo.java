/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Acer
 */
public class MatchPlayersTwo extends javax.swing.JFrame {

    /**
     * Creates new form MatchPlayers
     * @throws java.sql.SQLException
     */
    
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","test123");
    private int team_id;
    private DefaultListModel availableplayersmodel = new DefaultListModel();
    private DefaultListModel selectedplayersmodel = new DefaultListModel();
    private int MID;
    
    
    public MatchPlayersTwo() throws SQLException {
        
        initComponents();
        setTitle("Match Players");
    }
    
    public MatchPlayersTwo(String name1) throws ClassNotFoundException, SQLException{
        initComponents();
        setTitle("Match Players");
        //team2Name=name2;
        TeamName.setText(name1);
        Class.forName("com.mysql.cj.jdbc.Driver");
        RetrieveID(name1);
        FillListBox(team_id);
        //FillCombo(team_id);
        
    }
    
    
    //retrieve id of the team whose squad is to be filled
    private void RetrieveID(String name1) throws ClassNotFoundException, SQLException{
        
        String sql = "select * from team where Name='"+name1+"'"; //'"+eid+"'"
        PreparedStatement PST=conn.prepareStatement(sql);
        ResultSet RS=PST.executeQuery();
        while(RS.next()){
            team_id=RS.getInt(1);  
        }
    }
    
    private void FillListBox(int ID) throws SQLException{
        
        
        String sql = "select * from player where TID='"+ID+"'";
        PreparedStatement PST=conn.prepareStatement(sql);
        ResultSet RS=PST.executeQuery();
        
        while(RS.next()){
            String name = RS.getString("NAME");
            availableplayersmodel.addElement(name);
        }
        
        AvailablePlayers.setModel(availableplayersmodel);
        AvailablePlayers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        SelectedPlayers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        ConfirmButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        NameCounter = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        WicketKeeperCombo = new javax.swing.JComboBox<>();
        CaptainCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SelectedPlayers = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AvailablePlayers = new javax.swing.JList<>();
        TeamName = new javax.swing.JLabel();
        Instruction = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1000, 557));
        kGradientPanel1.setLayout(null);

        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(ConfirmButton);
        ConfirmButton.setBounds(220, 410, 90, 23);

        NextButton.setBackground(new java.awt.Color(204, 204, 240));
        NextButton.setText("NEXT> ");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(NextButton);
        NextButton.setBounds(610, 470, 69, 23);

        NameCounter.setBackground(new java.awt.Color(204, 204, 240));
        NameCounter.setText("0");
        NameCounter.setOpaque(true);
        kGradientPanel1.add(NameCounter);
        NameCounter.setBounds(430, 230, 34, 20);

        removeButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        removeButton.setText("<REMOVE");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(removeButton);
        removeButton.setBounds(220, 360, 90, 21);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        addButton.setText("ADD>");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(addButton);
        addButton.setBounds(220, 310, 90, 20);

        WicketKeeperCombo.setBackground(new java.awt.Color(204, 204, 255));
        WicketKeeperCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WicketKeeper" }));
        kGradientPanel1.add(WicketKeeperCombo);
        WicketKeeperCombo.setBounds(600, 340, 120, 20);

        CaptainCombo.setBackground(new java.awt.Color(204, 204, 255));
        CaptainCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Captain" }));
        kGradientPanel1.add(CaptainCombo);
        CaptainCombo.setBounds(600, 290, 90, 20);

        jLabel2.setBackground(new java.awt.Color(204, 204, 240));
        jLabel2.setText("Selected Players");
        jLabel2.setOpaque(true);
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(330, 230, 100, 20);

        jScrollPane2.setViewportView(SelectedPlayers);

        kGradientPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(330, 260, 120, 190);

        jLabel1.setBackground(new java.awt.Color(204, 204, 240));
        jLabel1.setText("Choose Players From");
        jLabel1.setOpaque(true);
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(70, 230, 130, 20);

        jScrollPane1.setViewportView(AvailablePlayers);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 260, 120, 190);

        TeamName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TeamName.setOpaque(true);
        kGradientPanel1.add(TeamName);
        TeamName.setBounds(220, 130, 60, 20);

        Instruction.setBackground(new java.awt.Color(204, 204, 255));
        Instruction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Instruction.setText("Select Players From Team");
        Instruction.setOpaque(true);
        kGradientPanel1.add(Instruction);
        Instruction.setBounds(70, 130, 150, 20);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/stadium.jpg"))); // NOI18N
        Background.setPreferredSize(new java.awt.Dimension(1000, 557));
        kGradientPanel1.add(Background);
        Background.setBounds(0, 0, 1000, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPlayers(){
        
        if(selectedplayersmodel.getSize()==11){
            JOptionPane.showMessageDialog(null,"Cannot select more than 11 players!", "ERROR!",JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        
        int iSelected = AvailablePlayers.getSelectedIndex();
        if(iSelected == -1){
            return;
        }
        
        String addedPlayer = AvailablePlayers.getSelectedValue();
        //remove from left
        availableplayersmodel.remove(iSelected);
        selectedplayersmodel.addElement(addedPlayer);
        SelectedPlayers.setModel(selectedplayersmodel);
        String temp = NameCounter.getText();
        int name_counter = Integer.parseInt(temp);
        name_counter++;
        temp = Integer.toString(name_counter);
        NameCounter.setText(temp);  
    }
    
    
    
    private void ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionPerformed
      
        Object source = evt.getSource();
        
        if(source == addButton){
            addPlayers();
        }else if(source == removeButton){
            removePlayers();
        }
                        
    }//GEN-LAST:event_ActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        
        //        if(selectedplayersmodel.getSize()<11){
//            JOptionPane.showMessageDialog(null,"Cannot play with less than 11 players!", "ERROR!",JOptionPane.ERROR_MESSAGE);
//            return;
//        }
        
//        int match_id=0;
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        //SELECT * FROM Table ORDER BY ID DESC LIMIT 1;
//        String sql = "select * from `match` order by MID DESC LIMIT 1";
//        PreparedStatement PST;
//        ResultSet RS;
//         
//        try {
//            
//            //retrieve current match id
//            PST = conn.prepareStatement(sql);
//            RS=PST.executeQuery();
//            
//            while(RS.next()){
//                match_id = RS.getInt(1);
//            }
//            
//            
//            //retrieve player id of match players
//            String temp;
//            
//            for(int i=0;i<selectedplayersmodel.size();i++){
//                temp = selectedplayersmodel.get(i).toString();
//                sql = "select * from player where TID = '"+team_id+"' AND NAME = '"+temp+"'";
//                PST = conn.prepareStatement(sql);
//                RS=PST.executeQuery();
//                
//                while(RS.next()){
//                    al.add(RS.getInt(1));
//                }
//            }
//            
//           
//            //insert player and match id to match_player table
//            
//            for(int i : al){
//               
//                sql = "insert into match_player (MID,PID) values (?,?)";
//                PST = conn.prepareStatement(sql);
//                
//                PST.setInt(1,match_id);
//                PST.setInt(2,i);
//                PST.executeUpdate();
//            }

            int match_id = 0;
            String sql = "select * from `match` order by MID DESC LIMIT 1";   
            PreparedStatement PST;
            
        try {
            PST = conn.prepareStatement(sql);
            ResultSet RS=PST.executeQuery();
            
            while(RS.next()){
                match_id = RS.getInt(1);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(MatchPlayers.class.getName()).log(Level.SEVERE, null, ex);
        }
             

            
            //insert captain id
            String cid = CaptainCombo.getSelectedItem().toString();
            int cidi=-1;
            
            sql = "select * from player where NAME = '"+cid+"' AND TID = '"+team_id+"'";
            
        try {
            PST = conn.prepareStatement(sql);
            ResultSet RS = PST.executeQuery();
            
            while(RS.next()){
                cidi = RS.getInt(1);
            }
            
            
            
            sql = "update `match` set Captain_ID2 = '"+cidi+"' where MID = '"+match_id+"'";
            PST = conn.prepareStatement(sql);
            PST.executeUpdate();
            
            //insert wicketkeeper id
            cid = WicketKeeperCombo.getSelectedItem().toString();
            
            sql = "select * from player where NAME = '"+cid+"' AND TID = '"+team_id+"'";
            PST = conn.prepareStatement(sql);
            RS = PST.executeQuery();
            
            while(RS.next()){
                cidi = RS.getInt(1);
            }
            
            
            
            sql = "insert into wicket_keeper (MID,PID) values (?,?)";
            PST = conn.prepareStatement(sql);
            
            PST.setInt(1,match_id);
            PST.setInt(2,cidi);
            PST.executeUpdate();
            
            
            
            
            conn.close();
            dispose();
            OfficialData od = new OfficialData(match_id);
            od.setVisible(true);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MatchPlayers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MatchPlayersTwo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
        
            
        
    }//GEN-LAST:event_NextButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        
        if(selectedplayersmodel.getSize()<11){
            JOptionPane.showMessageDialog(null,"Cannot play with less than 11 players!", "ERROR!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int match_id=0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        //SELECT * FROM Table ORDER BY ID DESC LIMIT 1;
        String sql = "select * from `match` order by MID DESC LIMIT 1";
        PreparedStatement PST;
        ResultSet RS;
         
        try {
            
            //retrieve current match id
            PST = conn.prepareStatement(sql);
            RS=PST.executeQuery();
            
            while(RS.next()){
                match_id = RS.getInt(1);
            }
            
            
            //retrieve player id of match players
            String temp;
            
            for(int i=0;i<selectedplayersmodel.size();i++){
                temp = selectedplayersmodel.get(i).toString();
                sql = "select * from player where TID = '"+team_id+"' AND NAME = '"+temp+"'";
                PST = conn.prepareStatement(sql);
                RS=PST.executeQuery();
                
                while(RS.next()){
                    al.add(RS.getInt(1));
                }
            }
            
           
            //insert player and match id to match_player table
            
            for(int i : al){
               
                sql = "insert into match_player (MID,PID) values (?,?)";
                PST = conn.prepareStatement(sql);
                
                PST.setInt(1,match_id);
                PST.setInt(2,i);
                PST.executeUpdate();
            }
            
            JOptionPane.showMessageDialog(null, "Team Confirmed!", "SUCCESS!!" , JOptionPane.INFORMATION_MESSAGE);
            
            FillCombo();
            
        } catch (SQLException ex) {
            Logger.getLogger(MatchPlayers.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_ConfirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MatchPlayersTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchPlayersTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchPlayersTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchPlayersTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MatchPlayersTwo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MatchPlayersTwo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> AvailablePlayers;
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox<String> CaptainCombo;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel Instruction;
    private javax.swing.JLabel NameCounter;
    private javax.swing.JButton NextButton;
    private javax.swing.JList<String> SelectedPlayers;
    private javax.swing.JLabel TeamName;
    private javax.swing.JComboBox<String> WicketKeeperCombo;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables

    private void removePlayers() {
        
        int iSelected = SelectedPlayers.getSelectedIndex();
        if(iSelected == -1){
            return;
        }
        
        String removedPlayer = SelectedPlayers.getSelectedValue();
        selectedplayersmodel.remove(iSelected);
        availableplayersmodel.addElement(removedPlayer);
        
        String temp = NameCounter.getText();
        int name_counter = Integer.parseInt(temp);
        name_counter--;
        temp = Integer.toString(name_counter);
        NameCounter.setText(temp);
        
    }

    private void FillCombo() throws SQLException{
        
//        String sql = "select * from player where TID='"+ID+"'";
//        PreparedStatement PST=conn.prepareStatement(sql);
//        ResultSet RS=PST.executeQuery();
//        
//        while(RS.next()){
//                CaptainCombo.addItem(RS.getString("NAME"));
//                WicketKeeperCombo.addItem(RS.getString("NAME"));
//        }
        
    
   
        String temp;
            
        for(int i=0;i<selectedplayersmodel.size();i++){
            
            temp = selectedplayersmodel.get(i).toString();
            CaptainCombo.addItem(temp);
            WicketKeeperCombo.addItem(temp);
        }
    }
    
}
    
