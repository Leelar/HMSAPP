
package com.mlk.controllers;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class JTableHeaderColumnAlignment implements TableCellRenderer {
    private int TableAlignment = SwingConstants.LEFT;
    public JTableHeaderColumnAlignment(int horizontalAlignment) {
        this.TableAlignment = horizontalAlignment;
    }
    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {
        TableCellRenderer r = table.getTableHeader().getDefaultRenderer();
        JLabel l = (JLabel) r.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
        l.setHorizontalAlignment(TableAlignment);
        return l;
    }
}

