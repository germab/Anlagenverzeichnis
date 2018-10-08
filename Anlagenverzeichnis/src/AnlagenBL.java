
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthias
 */
public class AnlagenBL extends AbstractTableModel{

    private ArrayList<Anlage> anlagen = new ArrayList();
    
    @Override
    public int getRowCount() {
        return anlagen.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Anlage a = anlagen.get(i);
        
        switch (i1) {
            case 0: return a.getBezeichnung();
            case 1: return a.getAk();
            case 2: return a.getInbetriebnahme();
            case 3: return a.getNd();
            case 4: return a.getBis_nd();
            case 5: return a.getBis_afa();
            case 6: return a.getBw();
            case 7: return a.getAfaDJ();
            case 8: return a.getBwEnde();
            default:
                return "???";
        }
    }
    
}
