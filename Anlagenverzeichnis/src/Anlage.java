
import java.time.LocalDate;
import java.time.Year;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthias
 */
public class Anlage {
    private String bezeichnung;
    private int ak;
    private double inbetriebnahme;
    private double nd;
    private double bis_nd;
    private double bis_afa;
    private double bw;
    private double afaDJ;
    private double bwEnde;

    public Anlage(String bezeichnung, int ak, double inbetriebnahme, double nd, double bis_nd, double bis_afa, double bw, double afaDJ, double bwEnde) {
        this.bezeichnung = bezeichnung;
        this.ak = ak;
        this.inbetriebnahme = inbetriebnahme;
        this.nd = nd;
        this.bis_nd = bis_nd;
        this.bis_afa = bis_afa;
        this.bw = bw;
        this.afaDJ = afaDJ;
        this.bwEnde = bwEnde;
        this.bis_nd = LocalDate.now().getYear()-nd;
    }
    
    public Anlage(String line){
        String[] parts = line.split(";");
        this.bezeichnung = parts[0];
        this.ak = Integer.parseInt(parts[1].replace(".", ""));
        this.inbetriebnahme = Double.parseDouble(parts[2].replace(",", "."));
        this.nd = Double.parseDouble(parts[3].replace(",","."));
        this.bis_nd = GUI.getYear()-inbetriebnahme;
        this.bis_afa = ak/bis_nd;
        this.afaDJ = ak/nd;
        this.bw = ak-bis_afa;
        this.bwEnde = ak-bis_afa-afaDJ;
    }

    public double getBwEnde() {
        return bwEnde;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getAk() {
        return ak;
    }

    public double getInbetriebnahme() {
        return inbetriebnahme;
    }

    public double getNd() {
        return nd;
    }

    public double getBis_nd() {
        return bis_nd;
    }

    public double getBis_afa() {
        return bis_afa;
    }

    public double getBw() {
        return bw;
    }

    public double getAfaDJ() {
        return afaDJ;
    }
    
    
}
