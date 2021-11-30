package com.rutar.javabeans;

import java.awt.Color;

// ............................................................................

public class JFaceComponentAdapter implements JFaceComponentListener {

///////////////////////////////////////////////////////////////////////////////

@Override
public void smileChenged (boolean oldValue, boolean newValue) {}

@Override
public void lineWidthChenged (int oldValue, int newValue) {}

@Override
public void mouseWidthChenged (int oldValue, int newValue) {}

@Override
public void backgroundChenged (Color oldValue, Color newValue) {}

@Override
public void foregroundChenged (Color oldValue, Color newValue) {}

///////////////////////////////////////////////////////////////////////////////

}