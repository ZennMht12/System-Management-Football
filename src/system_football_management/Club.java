/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system_football_management;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author KELOMPOK PBO :
 * - CHOKY ANDRIANO
 * - ZAINI MUHTAROM
 * - ALVIAN SAPUTRA PRATAMA
 * - DENIS ALVIANSYAH
 */
public class Club extends javax.swing.JFrame {

    /**
     * Creates new form Club
     */
    
    private void Kosongkan_Form() {
        txt_club.setEditable(true);
        txt_club.setText(null);
        txt_win.setText(null);
        txt_draw.setText(null);
        txt_lose.setText(null);
        txt_totalpoin.setText(null);
        txt_group.setText(null);
    }
    
    public Club() {
        initComponents();
        showTable();
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
        subject = new javax.swing.JLabel();
        Club_name = new javax.swing.JLabel();
        txt_club = new javax.swing.JTextField();
        Match_Win = new javax.swing.JLabel();
        Match_Draw = new javax.swing.JLabel();
        txt_draw = new javax.swing.JTextField();
        Match_Lose = new javax.swing.JLabel();
        txt_lose = new javax.swing.JTextField();
        txt_win = new javax.swing.JTextField();
        txt_group = new javax.swing.JTextField();
        Group = new javax.swing.JLabel();
        txt_totalpoin = new javax.swing.JTextField();
        Group2 = new javax.swing.JLabel();
        worldcup = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        subject2 = new javax.swing.JLabel();
        save_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabListGroup = new javax.swing.JTable();
        reset_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        fifa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subject.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 24)); // NOI18N
        subject.setForeground(new java.awt.Color(255, 255, 255));
        subject.setText("FOOTBALL MANAGEMENT");
        jPanel1.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Club_name.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        Club_name.setForeground(new java.awt.Color(255, 255, 255));
        Club_name.setText("NAME CLUB");
        jPanel1.add(Club_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txt_club.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_clubActionPerformed(evt);
            }
        });
        jPanel1.add(txt_club, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 180, -1));

        Match_Win.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        Match_Win.setForeground(new java.awt.Color(255, 255, 255));
        Match_Win.setText("MATCH WIN");
        jPanel1.add(Match_Win, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        Match_Draw.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        Match_Draw.setForeground(new java.awt.Color(255, 255, 255));
        Match_Draw.setText("MATCH DRAW");
        jPanel1.add(Match_Draw, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txt_draw.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_drawActionPerformed(evt);
            }
        });
        jPanel1.add(txt_draw, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 70, -1));

        Match_Lose.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        Match_Lose.setForeground(new java.awt.Color(255, 255, 255));
        Match_Lose.setText("MATCH LOSE");
        jPanel1.add(Match_Lose, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txt_lose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_lose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loseActionPerformed(evt);
            }
        });
        jPanel1.add(txt_lose, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 70, 30));

        txt_win.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_winActionPerformed(evt);
            }
        });
        jPanel1.add(txt_win, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, -1));

        txt_group.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_groupActionPerformed(evt);
            }
        });
        jPanel1.add(txt_group, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 70, 30));

        Group.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        Group.setForeground(new java.awt.Color(255, 255, 255));
        Group.setText("GROUP");
        jPanel1.add(Group, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        txt_totalpoin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_totalpoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalpoinActionPerformed(evt);
            }
        });
        jPanel1.add(txt_totalpoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 70, 30));

        Group2.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        Group2.setForeground(new java.awt.Color(255, 255, 255));
        Group2.setText("TOTAL POIN");
        jPanel1.add(Group2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        worldcup.setBackground(new java.awt.Color(52, 73, 94));
        worldcup.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        worldcup.setForeground(new java.awt.Color(255, 255, 255));
        worldcup.setText("For The Good Of The Game ");
        jPanel1.add(worldcup, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZAINI M\\Pictures\\New Folder\\ball-488717_1280.jpg")); // NOI18N
        bg.setText("jLabel1");
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, 0, 870, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        jPanel2.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 320, 30));

        search_btn.setBackground(new java.awt.Color(149, 165, 166));
        search_btn.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 14)); // NOI18N
        search_btn.setForeground(new java.awt.Color(255, 255, 255));
        search_btn.setText("SEARCH");
        search_btn.setBorder(null);
        search_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btnMouseClicked(evt);
            }
        });
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        jPanel2.add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 80, 30));

        update_btn.setBackground(new java.awt.Color(149, 165, 166));
        update_btn.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 14)); // NOI18N
        update_btn.setForeground(new java.awt.Color(255, 255, 255));
        update_btn.setText("UPDATE");
        update_btn.setBorder(null);
        update_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        jPanel2.add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 90, 30));

        delete_btn.setBackground(new java.awt.Color(149, 165, 166));
        delete_btn.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 14)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("DELETE");
        delete_btn.setBorder(null);
        delete_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_btnMouseClicked(evt);
            }
        });
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        jPanel2.add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 90, 30));

        subject2.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 30)); // NOI18N
        subject2.setForeground(new java.awt.Color(255, 255, 255));
        subject2.setText("MENU LIST CLUB GROUP");
        jPanel2.add(subject2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 30));

        save_btn.setBackground(new java.awt.Color(149, 165, 166));
        save_btn.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 14)); // NOI18N
        save_btn.setForeground(new java.awt.Color(255, 255, 255));
        save_btn.setText("SAVE");
        save_btn.setBorder(null);
        save_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });
        jPanel2.add(save_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 90, 30));

        TabListGroup.setAutoCreateRowSorter(true);
        TabListGroup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TabListGroup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        TabListGroup.setAutoscrolls(false);
        TabListGroup.setDragEnabled(true);
        TabListGroup.setGridColor(new java.awt.Color(0, 0, 0));
        TabListGroup.setShowGrid(true);
        TabListGroup.setSurrendersFocusOnKeystroke(true);
        TabListGroup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabListGroupMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabListGroup);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 880, 140));

        reset_btn.setBackground(new java.awt.Color(149, 165, 166));
        reset_btn.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 14)); // NOI18N
        reset_btn.setForeground(new java.awt.Color(255, 255, 255));
        reset_btn.setText("RESET");
        reset_btn.setBorder(null);
        reset_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset_btnMouseClicked(evt);
            }
        });
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });
        jPanel2.add(reset_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 90, 30));

        back_btn.setBackground(new java.awt.Color(149, 165, 166));
        back_btn.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 14)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("BACK");
        back_btn.setBorder(null);
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel2.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 80, 30));

        fifa.setBackground(new java.awt.Color(52, 73, 94));
        fifa.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        fifa.setForeground(new java.awt.Color(255, 255, 255));
        fifa.setText("Uefa Champions League 2022 - 2023");
        jPanel2.add(fifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 400, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZAINI M\\Pictures\\New Folder\\9df1fe4889ec249c6b9cca597e1ed336.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 1130, 590));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 900, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private DefaultTableModel tableModel;
    private ResultSet resultSet;
    public final void showTable(){
        try {
            Connection conn = ConnectionDatabase.configDB();
            
            Object[] columnTitle = {"RANK","NAME CLUB","WIN","DRAW","LOSE","TOTAL POIN","GROUP"};
            tableModel = new DefaultTableModel(null,columnTitle);
            TabListGroup.setModel(tableModel);
            Statement statement = conn.createStatement();
            tableModel.getDataVector().removeAllElements();
            
            resultSet = statement.executeQuery("SELECT * FROM name_club");
            while(resultSet.next()){
                Object[] data = {
                    resultSet.getString("RANK"),
                    resultSet.getString("NAME_CLUB"),
                    resultSet.getString("WIN"),
                    resultSet.getString("DRAW"),
                    resultSet.getString("LOSE"),
                    resultSet.getString("TOTAL_POIN"),
                    resultSet.getString("GROUP")
                        
                };
                tableModel.addRow(data);
            }
            System.out.println("");
            
        } catch (SQLException e) {
            System.out.println("NOT FOUND DATA !");
            System.out.println(e);
        }
    }
    private final String regex = "\\s";
    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        // TODO add your handling code here:
        try {
            String club = txt_club.getText();
            String match_win = txt_win.getText();
            String match_draw = txt_draw.getText();
            String match_lose = txt_lose.getText();
            String total_poin = txt_totalpoin.getText();
            String group = txt_group.getText();
            System.out.println(match_win.matches(regex));
            if ((club.isEmpty()||club.length()<3)||(match_win.isEmpty()||match_win.matches(regex))||(match_draw.isEmpty()||match_win.matches(regex))||(match_draw.isEmpty()||match_draw.matches(regex))||(match_lose.isEmpty()||match_draw.matches(regex))||(total_poin.isEmpty()||total_poin.matches(regex))||(group.isEmpty()||group.matches(regex))){
                JOptionPane.showMessageDialog(null, "DATA INVALID","Failed",JOptionPane.ERROR_MESSAGE);
            
            }else{
                String sql = "INSERT INTO `name_club`(`NAME_CLUB`, `WIN`, `DRAW`, `LOSE`, `TOTAL_POIN`, `GROUP`) VALUES ('"+txt_club.getText()+"','"+txt_win.getText()+"','"+txt_draw.getText()+"','"+txt_lose.getText()+"','"+txt_totalpoin.getText()+"','"+txt_group.getText()+ "')";
                Connection conn = ConnectionDatabase.configDB();
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                showTable();
                JOptionPane.showMessageDialog(null, "DATA SAVED SUCESSFULLY");
                Kosongkan_Form(); 
            }
                    
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(this, e.getMessage());       
        }
    }//GEN-LAST:event_save_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_delete_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        // TODO add your handling code here:
        try {
            String club = txt_club.getText();
            String match_win = txt_win.getText();
            String match_draw = txt_draw.getText();
            String match_lose = txt_lose.getText();
            String total_poin = txt_totalpoin.getText();
            String group = txt_group.getText();
            System.out.println(match_win.matches(regex));
            if ((club.isEmpty()||club.length()<3)||(match_win.isEmpty()||match_win.matches(regex))||(match_draw.isEmpty()||match_win.matches(regex))||(match_draw.isEmpty()||match_draw.matches(regex))||(match_lose.isEmpty()||match_draw.matches(regex))||(total_poin.isEmpty()||total_poin.matches(regex))||(group.isEmpty()||group.matches(regex))){
                JOptionPane.showMessageDialog(null, "DATA INVALID","Failed",JOptionPane.ERROR_MESSAGE);
        }else {
            String sql = "UPDATE `name_club` SET `NAME_CLUB`='"+txt_club.getText()+"',`WIN`='"+txt_win.getText()+"',`DRAW`='"+txt_draw.getText()+"',`LOSE`='"+txt_lose.getText()+"',`TOTAL_POIN`='"+txt_totalpoin.getText()+"',`GROUP`='"+txt_group.getText()+"' WHERE NAME_CLUB='"+txt_club.getText()+"'";
            Connection conn = ConnectionDatabase.configDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            showTable();
            JOptionPane.showMessageDialog(null, "DATA EDITED SUCCESFULLY"); 
            }
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }            
    }//GEN-LAST:event_update_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_btnActionPerformed

    private void txt_clubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_clubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_clubActionPerformed

    private void txt_drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_drawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_drawActionPerformed

    private void txt_loseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_loseActionPerformed

    private void txt_winActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_winActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_winActionPerformed

    private void search_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseClicked
        // TODO add your handling code here:
        try {
            Connection conn = ConnectionDatabase.configDB();
            
            Object[] columnTitle = {"RANK","CLUB NAME","WIN","DRAW","LOSE","TOTAL POIN","GROUP"};
            tableModel = new DefaultTableModel(null,columnTitle);
            TabListGroup.setModel(tableModel);
            Statement statement = conn.createStatement();
            tableModel.getDataVector().removeAllElements();
            
            resultSet = statement.executeQuery("SELECT * FROM `name_club` WHERE NAME_CLUB LIKE '%" + txt_search.getText() + "%'");
            int i = 1;
            while(resultSet.next()){
                Object[] data = {
                    resultSet.getString("RANK"),
                    resultSet.getString("NAME_CLUB"),
                    resultSet.getString("WIN"),
                    resultSet.getString("DRAW"),
                    resultSet.getString("LOSE"),
                    resultSet.getString("TOTAL_POIN"),
                    resultSet.getString("GROUP")
                        
                };
                tableModel.addRow(data);
            }   
        } catch (SQLException e) {
            System.out.println("NOT FOUND DATA !");
            System.out.println(e);
        }
    
    }//GEN-LAST:event_search_btnMouseClicked

    private void reset_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_btnMouseClicked
        // TODO add your handling code here:
        Kosongkan_Form();
    }//GEN-LAST:event_reset_btnMouseClicked

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reset_btnActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void TabListGroupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListGroupMouseClicked
        // TODO add your handling code here:
        int baris = TabListGroup.rowAtPoint(evt.getPoint());
        String club = TabListGroup.getValueAt(baris, 1).toString();
        txt_club.setText(club);
        
        String win = TabListGroup.getValueAt(baris, 2).toString();
        txt_win.setText(win);
        
        String draw = TabListGroup.getValueAt(baris, 3).toString();
        txt_draw.setText(draw);
        
        String lose = TabListGroup.getValueAt(baris, 4).toString();
        txt_lose.setText(lose);
        
        String poin = TabListGroup.getValueAt(baris, 5).toString();
        txt_totalpoin.setText(poin);
        
        String group = TabListGroup.getValueAt(baris, 6).toString();
        txt_group.setText(group);
        
        
       
        
    }//GEN-LAST:event_TabListGroupMouseClicked

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_btnMouseClicked

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home n = new Home();
        n.setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void txt_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_groupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_groupActionPerformed

    private void txt_totalpoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalpoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalpoinActionPerformed

    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseClicked
        // TODO add your handling code here:
        try {
            String club = txt_club.getText();
            String match_win = txt_win.getText();
            String match_draw = txt_draw.getText();
            String match_lose = txt_lose.getText();
            String total_poin = txt_totalpoin.getText();
            String group = txt_group.getText();
            System.out.println(match_win.matches(regex));
            if ((club.isEmpty()||club.length()<3)||(match_win.isEmpty()||match_win.matches(regex))||(match_draw.isEmpty()||match_win.matches(regex))||(match_draw.isEmpty()||match_draw.matches(regex))||(match_lose.isEmpty()||match_draw.matches(regex))||(total_poin.isEmpty()||total_poin.matches(regex))||(group.isEmpty()||group.matches(regex))){
                JOptionPane.showMessageDialog(null, "DATA INVALID","Failed",JOptionPane.ERROR_MESSAGE);
                
       } else {
            String sql = "DELETE FROM `name_club` WHERE NAME_CLUB='"+ txt_club.getText() + "'";
            Connection conn = ConnectionDatabase.configDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            showTable();
            JOptionPane.showMessageDialog(null, "DATA DELETED SUCCESFULLY");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        showTable();
        Kosongkan_Form();
    }//GEN-LAST:event_delete_btnMouseClicked

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
            java.util.logging.Logger.getLogger(Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Club().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Club_name;
    private javax.swing.JLabel Group;
    private javax.swing.JLabel Group2;
    private javax.swing.JLabel Match_Draw;
    private javax.swing.JLabel Match_Lose;
    private javax.swing.JLabel Match_Win;
    private javax.swing.JTable TabListGroup;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel fifa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reset_btn;
    private javax.swing.JButton save_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JLabel subject;
    private javax.swing.JLabel subject2;
    private javax.swing.JTextField txt_club;
    private javax.swing.JTextField txt_draw;
    private javax.swing.JTextField txt_group;
    private javax.swing.JTextField txt_lose;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_totalpoin;
    private javax.swing.JTextField txt_win;
    private javax.swing.JButton update_btn;
    private javax.swing.JLabel worldcup;
    // End of variables declaration//GEN-END:variables
}
