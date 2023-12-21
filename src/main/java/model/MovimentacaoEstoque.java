package model;

import java.time.LocalDate;

public class MovimentacaoEstoque {
    private int id;
    private int idFornecedorProduto;
    private LocalDate data;
    private double quantidade;
    private String tipoMovimentacao;
    private double custo;
    private int lote;
    private LocalDate validade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFornecedorProduto() {
        return idFornecedorProduto;
    }

    public void setIdFornecedorProduto(int idFornecedorProduto) {
        this.idFornecedorProduto = idFornecedorProduto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return String.format("| %-5d | %-10s | %-10s | %-10s | %-20s |%-10s |%-10s |%-10s |", id, idFornecedorProduto, data, quantidade, tipoMovimentacao, custo, lote, validade);

    }
}INSERT INTO Movimentacao_Estoque (FK_Id_Fornecedor_Produto, Data, Quantidade, Tipo_Movimentacao, Custo, Lote, Validade) VALUES
(8, 1676332800000, 52.96, 'Entrada', 389.07, 9623, 1676332800000),
        (6, 1601078400000, 62.04, 'Saída', 116.39, 7883, 1601078400000),
        (14, 1589932800000, 91.94, 'Saída', 148.97, 6676, 1589932800000),
        (8, 1671408000000, 37.92, 'Entrada', 166.65, 8494, 1671408000000),
        (15, 1589673600000, 24.99, 'Entrada', 247.0, 8264, 1589673600000),
        (9, 1659312000000, 11.37, 'Saída', 345.55, 6294, 1659312000000),
        (10, 1662768000000, 36.46, 'Entrada', 76.18, 9664, 1662768000000),
        (3, 1643155200000, 73.11, 'Saída', 495.99, 7263, 1643155200000),
        (5, 1581897600000, 88.85, 'Saída', 166.58, 5825, 1581897600000),
        (14, 1625702400000, 89.18, 'Entrada', 193.75, 6491, 1625702400000),
        (12, 1583884800000, 32.51, 'Entrada', 159.44, 1701, 1583884800000),
        (16, 1598572800000, 78.83, 'Saída', 320.87, 2519, 1598572800000),
        (5, 1654819200000, 59.1, 'Saída', 410.32, 7329, 1654819200000),
        (10, 1640649600000, 44.42, 'Saída', 95.48, 1192, 1640649600000),
        (14, 1639526400000, 58.16, 'Entrada', 415.85, 9369, 1639526400000)
