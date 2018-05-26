/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlk.utils;

import javax.swing.JOptionPane;

/**
 *
 * @author Programming
 */
public class Util {
    public static void infoMsg(String info){
        JOptionPane.showMessageDialog(null, info,"Info message",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void waringMsg(String warning){
        JOptionPane.showMessageDialog(null, warning,"Warning message",JOptionPane.WARNING_MESSAGE);
    }
}
