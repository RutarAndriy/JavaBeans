package com.rutar.javabeans;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JFaceComponentDemo extends JFrame {

///////////////////////////////////////////////////////////////////////////////

public JFaceComponentDemo() {

initComponents();

setLocationRelativeTo(null);

}

///////////////////////////////////////////////////////////////////////////////

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFaceComponent = new JFaceComponent();
        jLabel_1 = new JLabel();
        jLabel_2 = new JLabel();
        jSlider_1 = new JSlider();
        jSlider_2 = new JSlider();
        jButton_1 = new JButton();
        jButton_2 = new JButton();
        jButton_3 = new JButton();
        jButton_4 = new JButton();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JFaceComponent Demo");
        setResizable(false);

        GroupLayout jFaceComponentLayout = new GroupLayout(jFaceComponent);
        jFaceComponent.setLayout(jFaceComponentLayout);
        jFaceComponentLayout.setHorizontalGroup(jFaceComponentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        jFaceComponentLayout.setVerticalGroup(jFaceComponentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_1.setText("Товщина ліній");

        jLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_2.setText("Ширина усмішки");

        jSlider_1.setMaximum(25);
        jSlider_1.setMinimum(1);
        jSlider_1.setToolTipText("");
        jSlider_1.setValue(1);
        jSlider_1.setRequestFocusEnabled(false);
        jSlider_1.addChangeListener(formListener);

        jSlider_2.setMaximum(360);
        jSlider_2.setValue(120);
        jSlider_2.addChangeListener(formListener);

        jButton_1.setText("Усмішка / Гримаса");
        jButton_1.addActionListener(formListener);

        jButton_2.setText("Змінити колір ліній");
        jButton_2.addActionListener(formListener);

        jButton_3.setText("Змінити колір фону");
        jButton_3.addActionListener(formListener);

        jButton_4.setText("Очистити налаштування");
        jButton_4.addActionListener(formListener);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFaceComponent, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSlider_1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jLabel_2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSlider_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jFaceComponent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements ActionListener, ChangeListener {
        FormListener() {}
        public void actionPerformed(ActionEvent evt) {
            if (evt.getSource() == jButton_1) {
                JFaceComponentDemo.this.jButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton_2) {
                JFaceComponentDemo.this.jButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton_3) {
                JFaceComponentDemo.this.jButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton_4) {
                JFaceComponentDemo.this.jButtonActionPerformed(evt);
            }
        }

        public void stateChanged(ChangeEvent evt) {
            if (evt.getSource() == jSlider_1) {
                JFaceComponentDemo.this.jSliderStateCanged(evt);
            }
            else if (evt.getSource() == jSlider_2) {
                JFaceComponentDemo.this.jSliderStateCanged(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

///////////////////////////////////////////////////////////////////////////////

    private void jSliderStateCanged(ChangeEvent evt) {//GEN-FIRST:event_jSliderStateCanged

        System.out.println("Slider");
        
    }//GEN-LAST:event_jSliderStateCanged

///////////////////////////////////////////////////////////////////////////////

    private void jButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed

        System.out.println("Button");
        
    }//GEN-LAST:event_jButtonActionPerformed

///////////////////////////////////////////////////////////////////////////////

public static void main (String args[]) {

    EventQueue.invokeLater(() -> {
        new JFaceComponentDemo().setVisible(true);
    });
}

///////////////////////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton_1;
    private JButton jButton_2;
    private JButton jButton_3;
    private JButton jButton_4;
    private JFaceComponent jFaceComponent;
    private JLabel jLabel_1;
    private JLabel jLabel_2;
    private JSlider jSlider_1;
    private JSlider jSlider_2;
    // End of variables declaration//GEN-END:variables
}
