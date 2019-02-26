/*
Author: Brandae Grein
Date: 2/25/2019

Purpose: this is the GUI and main method application of a number converter application.
This application takes in user values for decimal, binary, octal, hex, ascii, or color values
and converts between them using the NumberConverter class. 

 */
package cs351_assignment1;

import java.awt.Color;
import javax.swing.JColorChooser;

public class NumberConverterApp extends javax.swing.JFrame {

    /**
     * Initializes the GUI
     */
    public NumberConverterApp() {
        initComponents();
    }
    public NumberConverter myConversions = new NumberConverter();

    /**
     * 
     * 
     * 
     * 
     * 
     * 
     
    All the code below is created by the GUI Creation in Netbeans - I do not touch it
     except to name the variables. 
    
    * 
    * 
    * 
    * 
    * 
    * 
    * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        decimalText = new javax.swing.JTextField();
        binaryText = new javax.swing.JTextField();
        octalText = new javax.swing.JTextField();
        hexText = new javax.swing.JTextField();
        asciiText = new javax.swing.JTextField();
        floatDecimalText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        convertButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        changeColorButton = new javax.swing.JButton();
        colorPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brandae's Number Converter");
        setName("Number Converter"); // NOI18N

        jLabel1.setText("Decimal");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Enter a number");

        decimalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalTextActionPerformed(evt);
            }
        });

        binaryText.setName("binaryText"); // NOI18N
        binaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaryTextActionPerformed(evt);
            }
        });

        jLabel9.setText("Binary");

        jLabel10.setText("Octal");

        jLabel11.setText("Hexadecimal");

        jLabel12.setText("Character(s)");

        jLabel13.setText("Color");

        jLabel14.setText("Floating Decimal");

        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        changeColorButton.setText("Change Color");
        changeColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeColorButtonActionPerformed(evt);
            }
        });

        colorPanel.setBackground(new java.awt.Color(255, 255, 255));
        colorPanel.setName("colorDisplay"); // NOI18N

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(246, 246, 246))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asciiText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(floatDecimalText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(convertButton, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(hexText)
                    .addComponent(octalText)
                    .addComponent(binaryText)
                    .addComponent(decimalText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeColorButton, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decimalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(binaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(octalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hexText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asciiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeColorButton))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(floatDecimalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertButton)
                    .addComponent(clearButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * 
     * 
     * 
     * 
     * 
     
    End of automated code
    
    * 
    * 
    * 
    * 
    * 
    * 
    * 
     */
    
    //This is the method ran whenever a user presses the button "Convert". It will check 
    //each one of the fields in turn for text, starting at the top and working down.
    //If the field is not empty, it will run the required code to convert. 
    
    
    //CAUTION!!!! This means that if the user has entered text into multiple fields,
    // it will only convert the first one. 
    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        
        //this first if statement checks to see if the text values for the decimalText are empty
        if(decimalText.getText()!= null && !"".equals(decimalText.getText())){
            //if the field is not empty, then it begins converting. 
            binaryText.setText(myConversions.decimalToBinary(decimalText.getText()));//to binary
            String hexValues = myConversions.decimalToHex(decimalText.getText());//stores the hex value in a string
            octalText.setText(myConversions.decimalToOctal(decimalText.getText()));//octal
            hexText.setText(hexValues);//sets the hex value into the text box
            asciiText.setText(myConversions.decimalToASCII(decimalText.getText()));//ascii values
            int hex = Integer.parseInt(hexValues, 16);//converts the hex value string into an int
            Color color = new Color(hex);//converts the hex into a color
            colorPanel.setBackground(color);//sets teh panel background as the hex value
        }
        //if decimaltext field was empty, will check for binary values
        else if(binaryText.getText() != null && !"".equals(binaryText.getText())){
            //if not empty, runs conversions
            decimalText.setText(myConversions.binaryToDecimal(binaryText.getText()));//first conversion is binary to decimal
            //all following conversions are the same as the previous method -- converting from decimal to other values rather
            //than converting from binary to other values. This saves space. 
            String hexValues = myConversions.decimalToHex(decimalText.getText());
            octalText.setText(myConversions.decimalToOctal(decimalText.getText()));
            hexText.setText(hexValues);
            asciiText.setText(myConversions.decimalToASCII(decimalText.getText()));
            int hex = Integer.parseInt(hexValues, 16);
            Color color = new Color(hex);
            colorPanel.setBackground(color);
        }
        //if decimalText field and binaryText field were empty, it will check for octal values
        else if(octalText.getText() != null && !"".equals(octalText.getText())){
            //if not empty, it will begin converting. This first one converts from octal to decimal
            decimalText.setText(myConversions.octalToDecimal(octalText.getText()));
            //Rinse and repeat
            String hexValues = myConversions.decimalToHex(decimalText.getText());
            binaryText.setText(myConversions.decimalToBinary(decimalText.getText()));
            hexText.setText(hexValues);
            asciiText.setText(myConversions.decimalToASCII(decimalText.getText()));
            int hex = Integer.parseInt(hexValues, 16);
            Color color = new Color(hex);
            colorPanel.setBackground(color);
        }
        //If decimalText, binaryText, and octalText fields were empty... rinse and repeat
        else if(hexText.getText() != null && !"".equals(hexText.getText())){
            //if hexText value was not empty, then converts first from hex to decimal
            decimalText.setText(myConversions.hexToDecimal(hexText.getText()));
            //Rinse and repeat
            String hexValues = hexText.getText();
            octalText.setText(myConversions.decimalToOctal(decimalText.getText()));
            binaryText.setText(myConversions.decimalToBinary(decimalText.getText()));
            asciiText.setText(myConversions.decimalToASCII(decimalText.getText()));
            int hex = Integer.parseInt(hexValues, 16);
            Color color = new Color(hex);
            colorPanel.setBackground(color);
        }
        //if decimal text, binaryText, octalText, and hexText were empty, then checks for asciiText
        else if(asciiText.getText() != null &&!"".equals(asciiText.getText())){
            //if values are found, then converts from ascii to decimal.
            decimalText.setText(myConversions.ASCIIToDecimal(asciiText.getText()));
            //rinse and repeat
            String hexValues = myConversions.decimalToHex(decimalText.getText());
            binaryText.setText(myConversions.decimalToBinary(decimalText.getText()));
            octalText.setText(myConversions.decimalToOctal(decimalText.getText()));
            hexText.setText(hexValues);
            int hex = Integer.parseInt(hexValues, 16);
            Color color = new Color(hex);
            colorPanel.setBackground(color);
        }
        //end of method
    }//GEN-LAST:event_convertButtonActionPerformed
//this button's actions are preformed when the user chooses to pick a color
    private void changeColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeColorButtonActionPerformed
        //first, the color is set to white to give it a potential value
        Color userColor = Color.WHITE; 
        userColor = JColorChooser.showDialog(null, "Pick a Color", userColor);//brings up color panel
        if(userColor==null){//in other words, if the user delegated to not "choose a color"
            userColor = (Color.WHITE);
        }
        colorPanel.setBackground(userColor);//sets the color of the panel to previously stated color
        //this will do all the conversions from color
        decimalText.setText(Integer.toString(userColor.getRGB()& 0x00FFFFFF));
        binaryText.setText(myConversions.decimalToBinary(decimalText.getText()));
        octalText.setText(myConversions.decimalToOctal(decimalText.getText()));
        hexText.setText(myConversions.decimalToHex(decimalText.getText()));
        asciiText.setText(myConversions.decimalToASCII(decimalText.getText()));
        
    }//GEN-LAST:event_changeColorButtonActionPerformed

    private void decimalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalTextActionPerformed
        String text = decimalText.getText();
//        if(text != ""){
//            binaryText.setText(myConversions.decimalToBinary(text));
//        }
    }//GEN-LAST:event_decimalTextActionPerformed

    private void binaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_binaryTextActionPerformed
//all this method does is clear all text and color values when the user presses the "clear" button
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        decimalText.setText(null);
        binaryText.setText(null);
        octalText.setText(null);
        hexText.setText(null);
        asciiText.setText(null);
        colorPanel.setBackground(Color.WHITE);
        floatDecimalText.setText(null);
    }//GEN-LAST:event_clearButtonActionPerformed
    
    /**
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     MAIN METHOD -- autogenerated with NetBeans.
     * 
     * 
     * 
     * 
     * 
     * 
     * 
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
            java.util.logging.Logger.getLogger(NumberConverterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberConverterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberConverterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberConverterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the GUI and applications */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberConverterApp().setVisible(true);
            }
        });
    }
    
/*
    
    
    MORE AUTOGENERATED CODE
    
    
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asciiText;
    private javax.swing.JTextField binaryText;
    private javax.swing.JButton changeColorButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JButton convertButton;
    private javax.swing.JTextField decimalText;
    private javax.swing.JTextField floatDecimalText;
    private javax.swing.JTextField hexText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField octalText;
    // End of variables declaration//GEN-END:variables
}
