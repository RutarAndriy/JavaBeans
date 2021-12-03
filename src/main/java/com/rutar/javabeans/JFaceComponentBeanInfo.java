package com.rutar.javabeans;

import java.io.*;
import java.awt.*;
import java.util.*;
import java.beans.*;
import javax.imageio.*;

import static java.beans.BeanInfo.*;

// ............................................................................

public class JFaceComponentBeanInfo extends SimpleBeanInfo {

///////////////////////////////////////////////////////////////////////////////
// Метод повертає список доступних властивостей

@Override
public PropertyDescriptor[] getPropertyDescriptors() {

PropertyDescriptor property;
ArrayList <PropertyDescriptor> properties = new ArrayList();

try {

// Background
property = new PropertyDescriptor("background", JFaceComponent.class,
                                  "getBackground", "setBackground");
property.setPreferred(false);
properties.add(property);

// Foreground
property = new PropertyDescriptor("foreground", JFaceComponent.class,
                                  "getForeground", "setForeground");
property.setPreferred(false);
properties.add(property);

// LineWidth
property = new PropertyDescriptor("lineWidth", JFaceComponent.class,
                                  "getLineWidth", "setLineWidth");
property.setPreferred(true);
properties.add(property);

// MouthWidth
property = new PropertyDescriptor("mouthWidth", JFaceComponent.class,
                                  "getMouthWidth", "setMouthWidth");
property.setPreferred(true);
properties.add(property);

// Smile
property = new PropertyDescriptor("smile", JFaceComponent.class,
                                  "isSmile", "setSmile");
property.setPreferred(true);
properties.add(property);

}

catch (IntrospectionException e) { e.printStackTrace(); }

return properties.toArray(new PropertyDescriptor[] {});

}

///////////////////////////////////////////////////////////////////////////////
// Метод повертає список доступних прослуховувачів

@Override
public EventSetDescriptor[] getEventSetDescriptors() {

String[] methods;
EventSetDescriptor eventSet;
ArrayList <EventSetDescriptor> descriptors = new ArrayList();

try {

// ............................................................................
// JFaceComponentListener

methods = new String[] { "smileChange",
                         "lineWidthChange",
                         "mouseWidthChange",
                         "backgroundChange",
                         "foregroundChange" };

eventSet = new EventSetDescriptor(JFaceComponent.class,
                                  "JFaceComponentListener",
                                  JFaceComponentListener.class, methods,
                                  "addJFaceComponentListener",
                                  "removeJFaceComponentListener");

descriptors.add(eventSet);

// ............................................................................
// PropertyChangeListener

methods = new String[] { "propertyChange" };

eventSet = new EventSetDescriptor(JFaceComponent.class,
                                  "PropertyChangeListener",
                                  PropertyChangeListener.class, methods,
                                  "addPropertyChangeListener",
                                  "removePropertyChangeListener");

descriptors.add(eventSet);
  
}

catch (IntrospectionException e) { e.printStackTrace(); }

return descriptors.toArray(new EventSetDescriptor[] {});

}

///////////////////////////////////////////////////////////////////////////////
// Метод повертає об'єкт зображення типу Image

@Override
public Image getIcon (int iconType) {
    
switch (iconType) {

    case ICON_MONO_16x16:
    case ICON_COLOR_16x16: return loadIcon(false);
    
    case ICON_MONO_32x32:
    case ICON_COLOR_32x32: return loadIcon(true);
                           
    default: return null;

}
}

///////////////////////////////////////////////////////////////////////////////
// Метод завантажує зображення різного розміру

private Image loadIcon (boolean large) {

    Image image;
    String res = "/smile_" + (large ? "32" : "16") + ".png";
    
    try (InputStream stream = JFaceComponentBeanInfo.class
                             .getResourceAsStream(res)) {
            
        image = ImageIO.read(stream);
        return image;
    
    }
    
    catch (IOException ex) { return null; }

}

///////////////////////////////////////////////////////////////////////////////

}