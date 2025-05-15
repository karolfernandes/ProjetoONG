/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class pagamentosmodel {
    
    private String Nome_doador;
    private Float Valor_doado; 
    private String Data;
    private String tipo_doacao;

    public pagamentosmodel(String Nome_doador, Float Valor_doado, String Data, String tipo_doacao) {
        this.Nome_doador = Nome_doador;
        this.Valor_doado = Valor_doado;
        this.Data = Data;
        this.tipo_doacao = tipo_doacao;
    }

    public pagamentosmodel() {
    } 
    
 // metodos getter e setter 

    public String getNome_doador() {
        return Nome_doador;
    }

    public void setNome_doador(String Nome_doador) {
        this.Nome_doador = Nome_doador;
    }

    public Float getValor_doado() {
        return Valor_doado;
    }

    public void setValor_doado(Float Valor_doado) {
        this.Valor_doado = Valor_doado;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getTipo_doacao() {
        return tipo_doacao;
    }

    public void setTipo_doacao(String tipo_doacao) {
        this.tipo_doacao = tipo_doacao;
    }
    
    
    
  
            
    
}





