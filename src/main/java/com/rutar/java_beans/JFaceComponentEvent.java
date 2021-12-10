package com.rutar.java_beans;

import java.awt.*;

// ............................................................................

public class JFaceComponentEvent extends AWTEvent {

private final Object oldValue;
private final Object newValue;

public static final int JFACECOMPONENT_EVENT = AWTEvent.RESERVED_ID_MAX + 333;

///////////////////////////////////////////////////////////////////////////////

public JFaceComponentEvent (Object source,
                            Object oldValue, Object newValue) {

super(source, JFACECOMPONENT_EVENT);

this.oldValue = oldValue;
this.newValue = newValue;

}

///////////////////////////////////////////////////////////////////////////////

public Object getOldValue() { return oldValue; }
public Object getNewValue() { return newValue; }

///////////////////////////////////////////////////////////////////////////////

@Override
public String toString() {

    return getClass().getName() +
            
        "[" +
            "oldValue=" + oldValue + "; " +
            "newValue=" + newValue +
        "]";
}

///////////////////////////////////////////////////////////////////////////////

}