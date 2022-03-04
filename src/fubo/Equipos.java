/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fubo;

/**
 *
 * @author josec
 */
public class Equipos {
    public String equipo;
    public int pj;
    public int pg;
    public int pe;
    public int pp;
    public int gf;
    public int gc;
    public int dfg;
    public int pts;

    public Equipos() {
    }
    
    

    public Equipos(String equipo, int pj, int pg, int pe, int pp, int gf, int gc, int dfg, int pts) {
        this.equipo = equipo;
        this.pj = pj;
        this.pg = pg;
        this.pe = pe;
        this.pp = pp;
        this.gf = gf;
        this.gc = gc;
        this.dfg = dfg;
        this.pts = pts;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getPj() {
        return pj;
    }

    public void setPj(int pj) {
        this.pj = pj;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getPe() {
        return pe;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getGc() {
        return gc;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }

    public int getDfg() {
        return dfg=gf-gc;
    }

    public void setDfg(int dfg) {
        this.dfg = dfg;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    @Override
    public String toString() {
        return "Equipos{" + "equipo=" + equipo + ", pj=" + pj + ", pg=" + pg + ", pe=" + pe + ", pp=" + pp + ", gf=" + gf + ", gc=" + gc + ", dfg=" + dfg + ", pts=" + pts + '}';
    }
    
    
}
