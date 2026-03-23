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
public class Etudante {
    private String nomeAluno;
    private Date datanascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    private String telefone;
    private int anoIngresso;
    private int semestreIngresso;
    private String situacao;
    private String digito;

    public Etudante() {
        nomeAluno = "Nobody";
    }
    
    private int obterIdade(Date hoje) {
        int idade = 0;
        // Lógica de calculo de idade
        return idade;
    }
    
    public String getnomeAluno() {
        return nomeAluno;
    }
    
    public void setNome(String _nome) {
        nomeAluno = _nome;
    }
    
    public Date getData() {
        return datanascimento;
    }
    
    public void setData(Date _datanascimento) {
        datanascimento = _datanascimento;
    }
    
    public String getCPF() {
        return cpf;
    }
    
    public void setCPF(String _cpf) {
        cpf = _cpf;
    }
    
    public char getGenero() {
        return genero;
    }
    
    public void setGenero(char _genero) {
        genero = _genero;
    }
    
    public String getMatricula() {
        return String.valueOf(anoIngresso)+ String.valueOf(semestreIngresso)+digito ;
    }
    
    public void setmatricula(String _digito) {
        digito = _digito;
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
    
    public int getanoIngresso() {
        return anoIngresso;
    }
    
    public void setanoIngresso(int _anoIngresso) {
        anoIngresso = _anoIngresso;
    }
    
    public int getsemestreIngresso() {
        return semestreIngresso;
    }
    
    public void setsemestreIngresso(int _semestreIngreso) {
        semestreIngresso = _semestreIngreso;
    }
    
    public String getsituacao() {
        return situacao;
    }
    
    public void setsituacao(String _situacao) {
        situacao = _situacao;
    }
}