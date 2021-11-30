package com.rutar.javabeans;

import java.awt.Color;

// ............................................................................

public interface JFaceComponentListener {
    
/**
 * Зміна усмішки
 * @param oldValue стара усмішка
 * @param newValue нова усмішка
 */
public void smileChenged (boolean oldValue, boolean newValue);
    
/**
 * Зміна ширини ліній
 * @param oldValue стара ширина ліній
 * @param newValue нова ширина ліній
 */
public void lineWidthChenged (int oldValue, int newValue);

/**
 * Зміна ширини роту (в градусах)
 * @param oldValue стара гирина роту
 * @param newValue нова ширина роту
 */
public void mouseWidthChenged (int oldValue, int newValue);

/**
 * Зміна кольору фону
 * @param oldValue старий колір фону
 * @param newValue новий колір фону
 */
public void backgroundChenged (Color oldValue, Color newValue);

/**
 * Зміна кольору ліній
 * @param oldValue старий колір ліній
 * @param newValue новий колір ліній
 */
public void foregroundChenged (Color oldValue, Color newValue);

}