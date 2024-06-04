
package com.library.custom;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * @author Jareth Bayron Baur
 * @since March 22, 2024
 */
public class DarkTable extends JTable {

    public DarkTable() {
        getTableHeader().setDefaultRenderer(new DarkTableHeader());
        getTableHeader().setPreferredSize(new Dimension(0, 35));
        setDefaultRenderer(Object.class, new DarkTableCell());
        setRowHeight(30);
    }

    private class DarkTableHeader extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            component.setBackground(new Color(30, 30, 30));
            component.setForeground(new Color(200, 200, 200));
            component.setFont(component.getFont().deriveFont(Font.BOLD, 12));
            return component;
        }

    }

    private class DarkTableCell extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (isCellSelected(row, column)) {
                if (row%2==0) {
                    component.setBackground(new Color(33,103,153));
                }else{
                    component.setBackground(new Color(29,86,127));
                }
            }else{
                if (row%2==0) {
                    component.setBackground(new Color(50,50,50));
                }else{
                    component.setBackground(new Color(30,30,30));
                }
            }
            component.setForeground(new Color(200, 200, 200));
            setBorder(new EmptyBorder(0,5,0,5));
            return component;
        }
    }
}
