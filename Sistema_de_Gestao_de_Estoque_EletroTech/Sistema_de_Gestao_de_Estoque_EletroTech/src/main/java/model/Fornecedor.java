package model;

public class Fornecedor {
    private int id;
    private String cnpjCpf;
    private String nome;
    private String razaoSocial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id=" + id +
                ", cnpjCpf='" + cnpjCpf + '\'' +
                ", nome='" + nome + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}
