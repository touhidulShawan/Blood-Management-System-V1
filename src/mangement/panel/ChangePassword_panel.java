
package mangement.panel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import mangement.MySqlConnect;

public class ChangePassword_panel extends javax.swing.JPanel {
    
    private Cursor cursor;
    

    /**
     * Creates new form ChangePassword_panel
     */
    public ChangePassword_panel() {
        initComponents();
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        new_Password = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        change_password = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        phone_Number = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        old_Password = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Donate Blood_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 90));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Donate Blood Save Life");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 220, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log In.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 210, 210));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 51));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 350, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 51));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 240, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 170, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 580));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(0, 51, 102));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Your Password");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 200, 10));

        jLabel7.setBackground(new java.awt.Color(0, 51, 102));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter new Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 160, 30));

        new_Password.setBackground(new java.awt.Color(0, 153, 153));
        new_Password.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        new_Password.setForeground(new java.awt.Color(255, 255, 255));
        new_Password.setBorder(null);
        jPanel2.add(new_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, 30));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 10));

        change_password.setBackground(new java.awt.Color(255, 255, 255));
        change_password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        change_password.setForeground(new java.awt.Color(0, 0, 51));
        change_password.setText("Change Password ");
        change_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        change_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                change_passwordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                change_passwordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                change_passwordMouseExited(evt);
            }
        });
        jPanel2.add(change_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 150, 40));

        jLabel9.setBackground(new java.awt.Color(0, 51, 102));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Verify your phone number");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, 50));

        phone_Number.setBackground(new java.awt.Color(0, 153, 153));
        phone_Number.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        phone_Number.setForeground(new java.awt.Color(255, 255, 255));
        phone_Number.setBorder(null);
        phone_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phone_NumberKeyPressed(evt);
            }
        });
        jPanel2.add(phone_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 300, 30));
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 300, 10));

        old_Password.setEditable(false);
        old_Password.setBackground(new java.awt.Color(0, 153, 153));
        old_Password.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        old_Password.setForeground(new java.awt.Color(255, 255, 255));
        old_Password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        old_Password.setBorder(null);
        jPanel2.add(old_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 650, 580));
    }// </editor-fold>//GEN-END:initComponents

    private boolean validateField(){
        
        if (phone_Number.getText().isEmpty() || new_Password.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please fill up all","Warning",JOptionPane.PLAIN_MESSAGE);
            
            return false;
        }
        
        return true;
    }
    
    
    
    
    private void change_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passwordMouseClicked
                
        // Connect to Database 
        
        if (validateField()){
        
            try{
    
            Connection conn = MySqlConnect.ConnectDB();
            
            String query = "UPDATE blood_management_system.donar_information set password = ? WHERE phoneNumber = '"+phone_Number.getText()+"'";
            PreparedStatement pst = conn.prepareStatement(query);
            
            pst.setString(1, new_Password.getText());
            pst.execute();
            
            
            
            JOptionPane.showMessageDialog(null, "Password changed successfully");
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Failed to Update","ERROR",JOptionPane.PLAIN_MESSAGE);
            
        }
      }
    }//GEN-LAST:event_change_passwordMouseClicked

    private void change_passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passwordMouseEntered
       
        change_password.setBackground(new Color(72, 104, 96));
        change_password.setForeground(new Color(255,255,255));
        change_password.setCursor(cursor);
    }//GEN-LAST:event_change_passwordMouseEntered

    private void change_passwordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passwordMouseExited
        
        change_password.setBackground(new Color(255,255,255));
        change_password.setForeground(new Color(0,0,51));
    }//GEN-LAST:event_change_passwordMouseExited

    private void phone_NumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_NumberKeyPressed
        
            if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            String username = phone_Number.getText();
        
        try{
            Connection conn = MySqlConnect.ConnectDB();
           String sql = "SELECT phoneNumber,password FROM blood_management_system.donar_information WHERE phoneNumber = '"+phone_Number.getText()+"'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            rs.next();
            
            if (username.equals(rs.getString("phoneNumber"))){
                
                String old_password = rs.getString("password");
                
                
                old_Password.setText(old_password);
                
                
            }
            conn.close();
  
        }catch(Exception e){
            
           JOptionPane.showMessageDialog(null, "Eneter 12 digit number","ERROR",JOptionPane.PLAIN_MESSAGE);
            
        }
            }        

    }//GEN-LAST:event_phone_NumberKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton change_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPasswordField new_Password;
    private javax.swing.JTextField old_Password;
    private javax.swing.JTextField phone_Number;
    // End of variables declaration//GEN-END:variables
}
