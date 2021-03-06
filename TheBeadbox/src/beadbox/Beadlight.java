/*
https://www.buyapi.ca/product-category/raspberry-pi/prototyping-gpio/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beadbox;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 *
 * @author Somang and Albert
 */
public class Beadlight extends javax.swing.JPanel {

    private int centerX,centerY,setIntensity,maxIntensity,track;    
    private safeColors safeColor ;
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);
        // Here comes the color.
        g2d.setColor(safeColor.pickColor(50, track));
        g2d.setStroke(new BasicStroke(2));
        centerX = (getWidth()-maxIntensity)/2;
        centerY = (getHeight()-maxIntensity)/2;
        g2d.drawOval(centerX, centerY, maxIntensity, maxIntensity);
        g2d.fillOval(centerX, centerX, setIntensity, setIntensity);
        repaint();
    }
    
    public void setIntensity(int givenIntensity){
        setIntensity = givenIntensity;
    }
    
    /**
     * Creates new form Beadlight
     */
    public Beadlight() {
        safeColor = new safeColors();
        maxIntensity = 40;
        initComponents();
    }
    public void setTrack(int i) {
        track = i;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
