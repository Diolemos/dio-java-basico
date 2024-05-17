package Cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    public String nome;
    public Integer cpf;
    public LocalDate dataNascimento;

    public Cliente(String nome, String dataNascimento) {
        setNome(nome);

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

    public void setCpf(Integer cpf) {
        String cpfString = cpf.toString();
        if (cpfString.length() != 11) {
            throw new IllegalArgumentException("CPF precisa ter 11 dígitos");
        } else {
            this.cpf = cpf;
        }
    }

    public Integer getCPF() {
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
}
