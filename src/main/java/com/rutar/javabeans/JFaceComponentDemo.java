package com.rutar.javabeans;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class JFaceComponentDemo extends JFrame {

///////////////////////////////////////////////////////////////////////////////

public JFaceComponentDemo() {

initComponents();
resetSettings();

jFaceComponent.addJFaceComponentListener(jFaceComponentListener);
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

        jFaceComponent.setLineWidth(5);

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
        jSlider_1.setValue(5);
        jSlider_1.setRequestFocusEnabled(false);
        jSlider_1.addChangeListener(formListener);

        jSlider_2.setMaximum(360);
        jSlider_2.setValue(120);
        jSlider_2.addChangeListener(formListener);

        jButton_1.setText("Усмішка / Гримаса");
        jButton_1.setToolTipText("");
        jButton_1.setActionCommand("smile/unsmile");
        jButton_1.addActionListener(formListener);

        jButton_2.setText("Змінити колір ліній");
        jButton_2.setActionCommand("changeForeground");
        jButton_2.addActionListener(formListener);

        jButton_3.setText("Змінити колір фону");
        jButton_3.setActionCommand("changeBackground");
        jButton_3.addActionListener(formListener);

        jButton_4.setText("Очистити налаштування");
        jButton_4.setActionCommand("resetSettings");
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
                .addContainerGap()
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

    if (evt.getSource() == jSlider_1)
        { jFaceComponent.setLineWidth(jSlider_1.getValue()); }
    else
        { jFaceComponent.setMouthWidth(jSlider_2.getValue()); }

    }//GEN-LAST:event_jSliderStateCanged

///////////////////////////////////////////////////////////////////////////////

    private void jButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed

    switch (evt.getActionCommand()) {
        
        // Усмішка/гримаса
        case "smile/unsmile":
            jFaceComponent.setSmile(!jFaceComponent.isSmile());
            break;
        
        // Колір ліній
        case "changeForeground":
            jFaceComponent.setForeground(getRandomColor());
            break;
            
        // Колір фону
        case "changeBackground":
            jFaceComponent.setBackground(getRandomColor());
            break;
        
        // Відновити початкові налаштування
        case "resetSettings":
            resetSettings();
            break;
        
    }
        
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

    private Color defaultBackground = null;
    private Color defaultForeground = null;
    
    private final boolean smile = true;
    private final int lineWidth = 5;
    private final int mothWidth = 120;
    
///////////////////////////////////////////////////////////////////////////////

private void resetSettings() {
    
    if (defaultBackground == null) 
        { defaultBackground = jFaceComponent.getBackground(); }
    if (defaultForeground == null) 
        { defaultForeground = jFaceComponent.getForeground(); }
    
    jFaceComponent.setSmile(smile);
    
    jFaceComponent.setLineWidth(lineWidth);
    jSlider_1.setValue(lineWidth);
    
    jFaceComponent.setMouthWidth(mothWidth);
    jSlider_2.setValue(mothWidth);
    
    jFaceComponent.setBackground(defaultBackground);
    jFaceComponent.setForeground(defaultForeground);
    
}

///////////////////////////////////////////////////////////////////////////////

private Color getRandomColor() {
    return new Color( (int)(Math.random()*255),
                      (int)(Math.random()*255),
                      (int)(Math.random()*255) );
}
    
///////////////////////////////////////////////////////////////////////////////

private void printComponentChange (String eventText, JFaceComponentEvent evt) {
    System.out.println(eventText + " was changed" +
                                   " from " + evt.getOldValue() +
                                   " to "   + evt.getNewValue());
}

///////////////////////////////////////////////////////////////////////////////

JFaceComponentListener jFaceComponentListener = new JFaceComponentListener() {
    
    @Override
    public void smileChange (JFaceComponentEvent evt)
        { printComponentChange("Smile", evt); }

    @Override
    public void lineWidthChange (JFaceComponentEvent evt)
        { printComponentChange("Line width", evt); }

    @Override
    public void mouthWidthChange (JFaceComponentEvent evt)
        { printComponentChange("Mouth width", evt); }

    @Override
    public void backgroundChange (JFaceComponentEvent evt)
        { printComponentChange("Background", evt); }

    @Override
    public void foregroundChange (JFaceComponentEvent evt)
        { printComponentChange("Foreground", evt); }
};

///////////////////////////////////////////////////////////////////////////////

}
