
import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph Mautner
 */
public class TableCellRenderer implements javax.swing.table.TableCellRenderer
{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        JLabel label = new JLabel();
        Component c = null;
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        if(value instanceof String)
        {
            label.setText(value.toString());
            
        }
        else if(value instanceof Integer || value instanceof Double)
        {
            DecimalFormat tausendertrennung = new DecimalFormat();
            label.setText(tausendertrennung.format(value));
        }
        
        
        c=label;
        return c;
    }
    
}
