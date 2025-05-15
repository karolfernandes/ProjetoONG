/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class Eventos {
     private String nome;
     private String data;
     private String horario;
     private String duracao;

    public Eventos(String nome, String data, String horario, String duracao) {
        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.duracao = duracao;
    }

    public Eventos() {
    }
    
    // metodos getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    
    
    
    
    
    
}
