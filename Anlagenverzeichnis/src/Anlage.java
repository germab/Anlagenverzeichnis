
import java.time.LocalDate;

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
    private int nd;
    private double bis_nd;
    private double bis_afa;
    private double bw;
    private double afaDJ;
    private double bwEnde;

    public Anlage(String bezeichnung, int ak, double inbetriebnahme, int nd, double bis_nd, double bis_afa, double bw, double afaDJ, double bwEnde) {
        this.bezeichnung = bezeichnung;
        this.ak = ak;
        this.inbetriebnahme = inbetriebnahme;
        this.nd = nd;
        this.bis_nd = bis_nd;
        this.bis_afa = bis_afa;
        this.bw = bw;
        this.afaDJ = afaDJ;
        this.bwEnde = bwEnde;
    }
    
    public Anlage(String line){
        String[] parts = line.split("");
        
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

    public int getNd() {
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
