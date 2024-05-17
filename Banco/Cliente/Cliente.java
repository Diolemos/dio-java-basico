package Cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    public String nome;
    public String cpf;
    public LocalDate dataNascimento;
    public Integer agencia;

    public Cliente(String nome, String dataNascimento, String cpf,  Integer agencia) {
        setNome(nome);
        this.agencia = agencia;
        setCpf(cpf);
        setDataNascimento(dataNascimento);


    }

    public void setNome(String nome) {
        if (nome.length() <= 3 || nome == null) {
            throw new IllegalArgumentException("Erro. O nome precisa ter no mínimo 2 letras.");
        } else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF precisa ter 11 dígitos");
        } else {
            this.cpf = cpf;
        }
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
        } catch (Exception e) {
            System.out.print(e);
            throw new IllegalArgumentException("Data de nascimento precisar está no formato DD/MM/YYYY");

        }

    }
    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

    public void setAgencia(Integer agencia){
        this.agencia = agencia;
    }
    public Integer getAgencia(){
        return this.agencia;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", agencia=" + agencia +
                '}';
    }

}
