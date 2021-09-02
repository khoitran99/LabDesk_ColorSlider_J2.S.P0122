/**
 *Name : Tran Van Khoi
 *MSSV : HE130007
 *Email : khoitvhe130007@fpt.edu.vn
 *Lecturer : DuongTB
 */
package view;


import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JTextField;


/**
 *
 * @author khoitvhe130007@fpt.edu.vn
 */
public final class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
       
        initComponents();
         changeColorBlue();
        changeColorGreen();
        changeColorRed();
        
    }

    /* change red color in RGB */
    public void changeColorRed() {
        txtRed.setText("R = " + sldRed.getValue());
        presentResult();
    }

    /* change green color in RGB */
    public void changeColorGreen() {
        txtGreen.setText("G = " + sldGreen.getValue());
        presentResult();
    }

    /* change blue color in RGB */
    public void changeColorBlue() {
        txtBlue.setText("B = " + sldBlue.getValue());
        presentResult();
    }

    /* set background color of txtResult to match RGB color */
    public void presentResult() {
        Color color = new Color(sldRed.getValue(), sldGreen.getValue(), sldBlue.getValue());
        txtResult.setBackground(color);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sldRed = new javax.swing.JSlider();
        txtRed = new javax.swing.JTextField();
        txtGreen = new javax.swing.JTextField();
        txtBlue = new javax.swing.JTextField();
        sldBlue = new javax.swing.JSlider();
        sldGreen = new javax.swing.JSlider();
        txtResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sldRed.setMaximum(255);
        sldRed.setValue(57);
        sldRed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        sldRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldRedStateChanged(evt);
            }
        });

        txtRed.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtRed.setForeground(java.awt.Color.red);
        txtRed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        txtGreen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtGreen.setForeground(java.awt.Color.green);
        txtGreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        txtBlue.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtBlue.setForeground(java.awt.Color.blue);
        txtBlue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        sldBlue.setMaximum(255);
        sldBlue.setValue(84);
        sldBlue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        sldBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldBlueStateChanged(evt);
            }
        });

        sldGreen.setMaximum(255);
        sldGreen.setValue(180);
        sldGreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        sldGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldGreenStateChanged(evt);
            }
        });

        txtResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sldRed, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGreen)
                    .addComponent(txtBlue, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(txtRed, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtResult)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sldRed, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(txtRed))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGreen, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(sldGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sldBlue, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(txtBlue))))
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldRedStateChanged
        changeColorRed();
    }//GEN-LAST:event_sldRedStateChanged

    private void sldGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldGreenStateChanged
        changeColorGreen();
    }//GEN-LAST:event_sldGreenStateChanged

    private void sldBlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldBlueStateChanged
        changeColorBlue();
    }//GEN-LAST:event_sldBlueStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider sldBlue;
    private javax.swing.JSlider sldGreen;
    private javax.swing.JSlider sldRed;
    private javax.swing.JTextField txtBlue;
    private javax.swing.JTextField txtGreen;
    private javax.swing.JTextField txtRed;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}