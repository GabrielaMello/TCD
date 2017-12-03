/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcd.modelo;

import br.com.tcd.enumeration.ClasseAco;
import br.com.tcd.enumeration.ClasseMadeira;
import br.com.tcd.enumeration.EspessuraChapaAco;

/**
 *
 * @author Gabriela Mello
 */
public class ElementoLigacao {
    
    private ClasseMadeira classeMadeira;
    private float espessura;
    private boolean forcaParaleraAFibra = false;
    private EspessuraChapaAco espessuraChapaAco;
    private ClasseAco classeAco;

    public ClasseMadeira getClasseMadeira() {
        return classeMadeira;
    }

    public void setClasseMadeira(ClasseMadeira classeMadeira) {
        this.classeMadeira = classeMadeira;
    }

    public ClasseAco getClasseAco() {
        return classeAco;
    }

    public void setClasseAco(ClasseAco classeAco) {
        this.classeAco = classeAco;
    }
       

    public float getEspessura() {
        return espessura;
    }

    public void setEspessura(float espessura) {
        this.espessura = espessura;
    }

    public EspessuraChapaAco getEspessuraChapaAco() {
        return espessuraChapaAco;
    }

    public void setEspessuraChapaAco(EspessuraChapaAco espessuraChapaAco) {
        this.espessuraChapaAco = espessuraChapaAco;
    }

    public boolean isForcaParalelaAFibra() {
        return forcaParaleraAFibra;
    }

    public void setForcaParalelaAFibra(boolean forcaParaleraAFibra) {
        this.forcaParaleraAFibra = forcaParaleraAFibra;
    }

}
