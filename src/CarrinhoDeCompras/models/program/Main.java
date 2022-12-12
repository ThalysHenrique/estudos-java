package CarrinhoDeCompras.models.program;

import CarrinhoDeCompras.models.Carrinho;
import CarrinhoDeCompras.models.Produto;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("notebook", 1, 3200.0);
        Produto p2 = new Produto("iphone 12", 2, 7500.0);
        Produto p3 = new Produto("macbook", 3, 12000.0);

        Carrinho c1 = new Carrinho();
        Carrinho c2 = new Carrinho();

        c1.addProduto(p1);
        c1.addProduto(p2, 0);

        c2.addProduto(p3);
        c2.addProduto(p2);

        System.out.println(c2);

        c1.getProduto(0).setPreco(8000);

        System.out.println(c1.getProduto(p1));
        System.out.println(c2.getProduto(p2));

        c1.calculaValorTotal();
        c2.calculaValorTotal();

        System.out.println(c1);
        System.out.println(c2);

    }
}