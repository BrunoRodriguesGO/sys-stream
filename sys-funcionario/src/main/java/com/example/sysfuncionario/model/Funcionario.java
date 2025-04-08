package com.example.sysfuncionario.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

   private String matricula;

    private String nome;

    private String cpf;

    private LocalDate data;

    private String cargo;

    private BigDecimal salario;

    private LocalDate dataContratacao;

    private Endereco endereco;


    public Funcionario(String matricula, String nome, String cpf, LocalDate data, String cargo, BigDecimal salario, LocalDate dataContratacao, Endereco endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.cargo = cargo;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.endereco = endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


@Override
public String toString() {
    return "Funcionario{" +
            "matricula='" + matricula + '\'' +
            ", nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            ", data=" + data +
            ", cargo='" + cargo + '\'' +
            ", salario=" + salario +
            ", dataContratacao=" + dataContratacao +
            ", endereco=" + endereco +
            '}';

}
}
