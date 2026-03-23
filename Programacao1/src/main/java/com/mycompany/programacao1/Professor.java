/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao1;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Professor {
    private String nomeProfessor;
    private String SIAPE;
    private String email;
    private String telefone;
    private String titulacao;
    private String areadeAtuacao;
    private String regimeTrabalho;
    private int anoIngresso;
    private String formacao;
    
    public Professor() {
        nomeProfessor = "Nobody";
    }
    
    public String getnomeProfessor() {
        return nomeProfessor;
    }
    
    public void setNome(String _nome) {
        nomeProfessor = _nome;
    }
    
    public String  getIAPE() {
        return SIAPE;
    }
    
    public void setIAPE(String _SIAPE) {
        SIAPE = _SIAPE;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String _email) {
        email = _email;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String _telefone) {
        telefone = _telefone;
    }
    
    public String getTitulacao() {
        return titulacao;
    }
   
    public void setTitulacao(String _titulacao) {
        titulacao = _titulacao;
    }
    
    public String getAreaAtuacao() {
        return areadeAtuacao;
    }
    
    public void setAreaAtuacao(String _areaAtuacao) {
        areadeAtuacao = _areaAtuacao;
    }
    
    public String getRegimeTrabalho() {
        return regimeTrabalho;
    }
    
    public void setRegimeTrabalho(String _regimeTrabalho) {
        regimeTrabalho = _regimeTrabalho;
    }
    
    public int getanoIngresso() {
        return anoIngresso;
    }
    
    public void setanoIngresso(int _anoIngresso) {
        anoIngresso = _anoIngresso;
    }
    
     public String getformacao() {
        return formacao;
    }
    
    public void setformacao(String _formacao) {
        formacao = _formacao;
    }
}
