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
        JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">"+info+"</font></p></html>", "ແຈ້ງເຕືອນ", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void warningMsg(String warning){
        JOptionPane.showMessageDialog(null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">"+warning+"</font></p></html>", "ແຈ້ງເຕືອນ", JOptionPane.WARNING_MESSAGE);
    }
    public static boolean confirmMsg(String message){ 
        return JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog (null, "<html><p><font color=\"#000\"size=\"3\" face=\"Saysettha OT\">"+message+"</font></p></html>","ການຢຶນຢັນ",JOptionPane.YES_NO_OPTION);
    }
}
