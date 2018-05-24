package pap.projeto.projetopap;

import java.util.Date;

public class Receita {
    private String _id;
    private String nome;
    private double valor;
    private Date data;
    private String descricao;

    public Receita(String nome, double valor, Date data, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public Receita(String _id, String nome, double valor, Date data, String descricao) {
        this._id = _id;
        this.nome = nome;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
