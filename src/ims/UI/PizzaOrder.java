/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.UI;
/*
 * Import  modal and controller 
 */
import ims.Model.*;
import ims.Controller.EventHandler;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kumar
 */
public class PizzaOrder extends javax.swing.JFrame {
    /*
     * Intialize variables needed for UI
     * 
     */
      UIOrder uiOrder = null;
      ArrayList<Pizza> pizzaList = null;
      static final String[] columnNames = {
          "Pizza Name", "Pizza Size", "Quantity", "Amount"
         };
	DefaultTableModel model = new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            columnNames);
      double totalBillCost = 0.0;
    /**
     * Creates new form PizzaOrder
     */
    public PizzaOrder() {
        initComponents();
        initializeUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPizzaType = new javax.swing.JComboBox();
        lblPizzaType = new javax.swing.JLabel();
        txtPizzaNum = new javax.swing.JTextField();
        lblPizzaNum = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblOrderTable = new javax.swing.JTable();
        btnOrder = new javax.swing.JButton();
        lblPizzaSize = new javax.swing.JLabel();
        cmbPizzaSize = new javax.swing.JComboBox();
        txtTotalCost = new javax.swing.JTextField();
        jlblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cmbPizzaType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPizzaType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPizzaType.setText("Pizza Type");

        lblPizzaNum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPizzaNum.setText("No. Of Pizza");

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setText("Add To Order");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jtblOrderTable.setModel(model);
        jtblOrderTable.setToolTipText("");
        jScrollPane1.setViewportView(jtblOrderTable);

        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOrder.setText("Place Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        lblPizzaSize.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPizzaSize.setText("Pizza Size");

        cmbPizzaSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlblTotal.setText("Total Cost:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPizzaType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPizzaType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPizzaSize, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbPizzaSize, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPizzaNum, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPizzaNum, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPizzaType)
                        .addComponent(lblPizzaNum))
                    .addComponent(lblPizzaSize, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPizzaNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPizzaType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPizzaSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTotal))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        if(!txtPizzaNum.getText().equalsIgnoreCase(""))
        {
          Pizza pizza =  getPizzaFromList(cmbPizzaType.getSelectedItem().toString(),cmbPizzaSize.getSelectedItem().toString());
          
          double totalCost  = Integer.parseInt(txtPizzaNum.getText()) * pizza.getCost();
          totalBillCost += totalCost;
          if( uiOrder == null ) uiOrder = new UIOrder(); 
          
          uiOrder.addOrder(pizza, Integer.parseInt(txtPizzaNum.getText()));
          
          String[] row = { pizza.getPizzaName(),
                           pizza.getPizzaSize(),
                           txtPizzaNum.getText(),
                           String.valueOf(totalCost)};
          System.out.println(pizza.getPizzaName());
          model.insertRow(0,row);
          txtTotalCost.setText(String.valueOf(totalBillCost));
                   
        }  
        else
        {
           JOptionPane.showMessageDialog(null,"Enter the number of pizza"); 
        }        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed

        EventHandler eventHandler = new EventHandler(Event.ORDER);
        uiOrder.setTotalCost(totalBillCost);
        if(eventHandler.HandleEvent(uiOrder)){
             JOptionPane.showMessageDialog(null,"Order Placed successfully");
             this.dispose();
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
 //------------------------------- UI Related functions -----------------------------------
    /* 
     * initializeUI to prepopulate the UI with pizza type
     * 
     */
    
    private void initializeUI(){
        EventHandler eventHandler = new EventHandler(Event.DISPLAY_PIZZAS);
        
        UIEstimation uiEstimate = new UIEstimation();
        if(eventHandler.HandleEvent(uiEstimate))
        {
           pizzaList = uiEstimate.pizzaList;
        }      
        
        //Get the unique pizza name
        ArrayList<String> uniquePizzaList  = new ArrayList<String>();
        for(Pizza pizza : pizzaList )
        {
          if(!uniquePizzaList.contains(pizza.getPizzaName()))
          {
              uniquePizzaList.add(pizza.getPizzaName());
          }
        } 
        
        //Clear the combo list
        cmbPizzaType.removeAllItems();
        //Add the Pizza Type combo box
        for(String pizzaName : uniquePizzaList)
        {
            cmbPizzaType.addItem(pizzaName);
        }
        
        cmbPizzaSize.removeAllItems();
        //Add the pizza size to combo box
        for(Pizza pizza : pizzaList )
        {
            cmbPizzaSize.removeItem(pizza.getPizzaSize());
            cmbPizzaSize.addItem(pizza.getPizzaSize());
        }
    }
    
    private Pizza getPizzaFromList(String pizzaName, String pizzaSize) {
       
        if(pizzaList != null)
        {
            for(Pizza pizza : pizzaList)
            {
               if(pizza.getPizzaName().equals(pizzaName) && pizza.getPizzaSize().equals(pizzaSize))
               {
                  return pizza; 
               }               
            }
        }
        return null;
    }
//--------------------------------- End of UI Related functions ----------------------------
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PizzaOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PizzaOrder().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrder;
    private javax.swing.JComboBox cmbPizzaSize;
    private javax.swing.JComboBox cmbPizzaType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JTable jtblOrderTable;
    private javax.swing.JLabel lblPizzaNum;
    private javax.swing.JLabel lblPizzaSize;
    private javax.swing.JLabel lblPizzaType;
    private javax.swing.JTextField txtPizzaNum;
    private javax.swing.JTextField txtTotalCost;
    // End of variables declaration//GEN-END:variables

}
