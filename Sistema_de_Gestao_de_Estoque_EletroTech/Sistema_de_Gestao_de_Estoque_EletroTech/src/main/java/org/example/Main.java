package org.example;

import controller.ProdutoDAO;
import model.Produto;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

        ProdutoDAO produtoDAO = new ProdutoDAO();
        ArrayList<Produto> produtos = new ArrayList<>();

    produtoDAO.update(8,"Descrição","Teste 2");

    produtoDAO.delete( 1,  "Descrição", "");

        //System.out.println(produtoDAO.getOne(8));

        //produtoDAO.updade(8,"Nome","Fone Ouvido HB");

        //System.out.println(produtoDAO.getOne(8));



       // produtoDAO.insert();


        produtos=produtoDAO.getAll();
        for (Produto produto:produtos) {
            System.out.println(produto);

        }

    }
}