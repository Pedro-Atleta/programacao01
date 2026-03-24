/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Turma {
    private Estudante estudantes = new Estudante();
    private Professor professor = new Professor();
    private Diciplina diciplina = new Diciplina();
    
    private Set<Estudante>materias = new HashSet<Estudante>();
    private Set<Professor>alunos = new HashSet<Professor>();
    private Set<Diciplina>professores = new HashSet<Diciplina>();
}
