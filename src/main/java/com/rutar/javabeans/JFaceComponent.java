package com.rutar.javabeans;

import java.awt.*;
import java.util.*;
import java.beans.*;
import javax.swing.*;

// ............................................................................

public class JFaceComponent extends JPanel {

private static ArrayList <JFaceComponentListener> listeners = null;
private static transient PropertyChangeSupport propertyChangeSupport = null;

private int lineWidth = 1;                                     // Товщина ліній
private int mouthWidth = 120;                     // Ширина усмішки, в градусах
private boolean smile = true;                                // Усмішка/гримаса

///////////////////////////////////////////////////////////////////////////////
    
@Override
public void paint (Graphics g) {

Graphics2D g2 = (Graphics2D)g;
g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

int w = getWidth();
int h = getHeight();

int er = 4;
int pad = 12;

int cw = w - pad * 2;
int ch = h - pad * 2;
int lw = (lineWidth - 1) / 2;

g2.setStroke(new BasicStroke(lineWidth));

g2.setColor(getBackground());
g2.fillRect(0, 0, w, h);
g2.setColor(getForeground());
g2.drawArc(pad, pad, cw, ch, 0, 360);

// Mouth
int sw = cw / 2;
int sh = ch / 2;

if (smile) { g2.drawArc(w / 2 - sw / 2,
                        h / 2 - sh / 2,
                        sw, sh, 270 - mouthWidth / 2, mouthWidth); }

else       { g2.drawArc(w / 2 - sw / 2,
                        h / 2 + sh / 3,
                        sw, sh, 90 - mouthWidth / 2, mouthWidth); }
    
// Left eye
g2.fillArc(w / 2 - cw * 1 / 8 - er / 2 - lw,
           h / 2 - ch / 4 - er - lw,
           er+lw*2, er+lw*2, 0, 360);

// Right eye
g2.fillArc(w / 2 + cw * 1 / 8 - er / 2 - lw,
           h / 2 - ch / 4 - er - lw,
           er+lw*2, er+lw*2, 0, 360);

}

///////////////////////////////////////////////////////////////////////////////

public boolean isSmile() { return smile; }

public void setSmile (boolean smile)
    { boolean oldValue = this.smile;
      this.smile = smile;
      fireEvent("smile", oldValue, smile);
      getPropertyChangeSupport().firePropertyChange("smile", oldValue, smile);
      repaint(); }

///////////////////////////////////////////////////////////////////////////////

public int getLineWidth() { return lineWidth; }

public void setLineWidth (int lineWidth)
    { int oldValue = this.lineWidth;
      this.lineWidth = lineWidth;
      fireEvent("lineWidth", oldValue, lineWidth);
      getPropertyChangeSupport().firePropertyChange("lineWidth",
                                                    oldValue, lineWidth);
      repaint(); }

///////////////////////////////////////////////////////////////////////////////

public int getMouthWidth() { return mouthWidth; }

public void setMouthWidth (int mouthWidth)
    { int oldValue = this.mouthWidth;
      this.mouthWidth = mouthWidth;
      fireEvent("mouthWidth", oldValue, mouthWidth);
      getPropertyChangeSupport().firePropertyChange("mouthWidth",
                                                    oldValue, mouthWidth);
      repaint(); }

///////////////////////////////////////////////////////////////////////////////

@Override
public void setBackground (Color bg)
    { Color oldValue = getBackground();
      fireEvent("background", oldValue, bg);
      getPropertyChangeSupport().firePropertyChange("background",
                                                    oldValue, bg);
      super.setBackground(bg); }

///////////////////////////////////////////////////////////////////////////////

@Override
public void setForeground (Color fg)
    { Color oldValue = getForeground();
      fireEvent("foreground", oldValue, fg);
      getPropertyChangeSupport().firePropertyChange("foreground",
                                                    oldValue, fg);
      super.setForeground(fg); }

///////////////////////////////////////////////////////////////////////////////

@Override
public void addPropertyChangeListener (PropertyChangeListener listener)
    { getPropertyChangeSupport().addPropertyChangeListener(listener); }

///////////////////////////////////////////////////////////////////////////////

@Override
public void removePropertyChangeListener (PropertyChangeListener listener)
    { getPropertyChangeSupport().removePropertyChangeListener(listener); }

///////////////////////////////////////////////////////////////////////////////

private PropertyChangeSupport getPropertyChangeSupport() {
    if (propertyChangeSupport == null) {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }
    return propertyChangeSupport;
}

///////////////////////////////////////////////////////////////////////////////

public void addJFaceComponentListener (JFaceComponentListener listener)
    { getListeners().add(listener); }

///////////////////////////////////////////////////////////////////////////////

public void removeJFaceComponentListener (JFaceComponentListener listener)
    { getListeners().remove(listener); }

///////////////////////////////////////////////////////////////////////////////

private ArrayList <JFaceComponentListener> getListeners()
    { if (listeners == null) { listeners = new ArrayList(); }
      return listeners; }

///////////////////////////////////////////////////////////////////////////////

private void fireEvent (String type, Object oldValue, Object newValue) {

JFaceComponentEvent event = new JFaceComponentEvent(this, oldValue, newValue);

for (JFaceComponentListener listener : getListeners()) {

    switch (type) {

        case "smile":      listener.smileChange(event);      break;
        case "lineWidth":  listener.lineWidthChange(event);  break;
        case "mouthWidth": listener.mouseWidthChange(event); break;
        case "background": listener.backgroundChange(event); break;
        case "foreground": listener.foregroundChange(event); break;

    }
}
}

///////////////////////////////////////////////////////////////////////////////

}