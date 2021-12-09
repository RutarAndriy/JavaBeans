package com.rutar.javabeans;

import java.util.*;

// ............................................................................

public interface JFaceComponentListener extends EventListener {
    
/**
 * Зміна усмішки
 * @param evt Подія типу JFaceComponentEvent
 */
public void smileChange (JFaceComponentEvent evt);
    
/**
 * Зміна ширини ліній
 * @param evt Подія типу JFaceComponentEvent
 */
public void lineWidthChange (JFaceComponentEvent evt);

/**
 * Зміна ширини роту (в градусах)
 * @param evt Подія типу JFaceComponentEvent
 */
public void mouthWidthChange (JFaceComponentEvent evt);

/**
 * Зміна кольору фону
 * @param evt Подія типу JFaceComponentEvent
 */
public void backgroundChange (JFaceComponentEvent evt);

/**
 * Зміна кольору ліній
 * @param evt Подія типу JFaceComponentEvent
 */
public void foregroundChange (JFaceComponentEvent evt);

}