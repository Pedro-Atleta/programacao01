/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao1;

/**
 *
 * @author aluno
 */
public class Diciplina {
    private String codigoDiciplina;
    private String nomeDiciplina;
    private String cargaHoraria;
    private String ementa;
    private String objetivos;
    
    public String getCodigoDiciplina() {
        return codigoDiciplina;
    }
    
    public void setCodigoDiciplina(String _codigoDiciplina) {
        codigoDiciplina = _codigoDiciplina;
    }
    
    public Diciplina() {
        nomeDiciplina = "Nobody";
    }
    
    public String getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(String _cargaHoraria) {
        cargaHoraria = _cargaHoraria;
    }
    
    public String getEmenta() {
        return ementa;
    }
    
    public void setEmenta(String _ementa) {
        ementa = _ementa;
    }
    
    public String getObjetivos() {
        return objetivos;
    }
    
    public void setObjetivos(String _ojetivos) {
        objetivos = _ojetivos;
    }
}
