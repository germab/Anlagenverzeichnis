
import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import java.time.LocalDate;
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
        else if(value instanceof Integer || value instanceof Double && column!=2 && column!=3)
        {
            DecimalFormat tausendertrennung = new DecimalFormat();
            label.setText(tausendertrennung.format(value));
            
        }
        else if(value instanceof Double)
        {
            label.setText(String.format("%.1f", value));
        }
        
        
        if(isSelected)
        {
            label.setBackground(new Color(130,200,240,123));
        }
        if(value instanceof Double && column==4)
        {
            if((double)value<0)
            {
                label.setBackground(Color.RED);
            }
        }
        else if(value instanceof Double && column==2 )
        {
            if((double)value >= LocalDate.now().getYear())
            {
                label.setBackground(Color.RED);
            }
        }
        
        
        c=label;
        return c;
    }
    
}
