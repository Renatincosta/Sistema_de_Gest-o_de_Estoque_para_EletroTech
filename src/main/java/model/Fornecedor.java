package model;

public class Fornecedor {
    private int id;
    private String cnpjCpf;
    private String nome;
    private String razaoSocial;

    public Fornecedor(String cnpjCpf, String nome, String razaoSocial) {
        this.cnpjCpf = cnpjCpf;
        this.nome = nome;
        this.razaoSocial = razaoSocial;
    }

    public Fornecedor() {
    }

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
        return String.format("| %-5d | %-20s | %-40s | %-20s |", id, cnpjCpf, nome, razaoSocial);
    }
}

    INSERT INTO Fornecedor (CNPJ_CPF, Nome, Razao_Social) VALUES
('72.235.510/3905-58', 'Jimenez PLC', 'Group'),
        ('92.044.748/6287-05', 'Holder Ltd', 'Group'),
        ('19.507.720/6216-76', 'Saunders-White', 'Inc'),
        ('60.627.801/4170-57', 'Green-Curtis', 'Ltd'),
        ('46.734.995/4135-44', 'Lin, Mccoy and Stevenson', 'LLC'),
        ('70.527.238/9810-03', 'Nguyen, Thompson and Bradford', 'Group'),
        ('04.503.493/3313-43', 'Hamilton-Johnson', 'Inc'),
        ('49.857.793/3822-00', 'Martin PLC', 'PLC'),
        ('32.553.063/0711-39', 'Pittman-Campbell', 'Inc'),
        ('62.985.744/6749-70', 'Fisher-Gamble', 'PLC'),
        ('56.567.110/2284-94', 'Rowland, Carter and Luna', 'Group'),
        ('91.877.259/5115-89', 'Ramos, Jones and Vang', 'PLC'),
        ('03.721.114/3706-61', 'Duarte PLC', 'Ltd'),
        ('14.312.966/5291-48', 'Gilbert-Walter', 'Inc'),
        ('83.568.097/1859-90', 'Lee Ltd', 'Ltd');
