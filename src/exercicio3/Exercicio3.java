/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author 7
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Informe o nome do produto:");
        produto.setNome(ler.next());
        System.out.println("Informe a quantidade no estoque:");
        produto.setQuantidade(ler.nextInt());
        System.out.println("Informe o preço do produto:");
        produto.setPreco(ler.nextDouble());
        produto.mostrarDados();
        System.out.println("Informe a quantidade para adicionar ao estoque:");
        produto.setQuantidadeAdicionar(ler.nextInt());
        produto.adicionarEstoque();
        produto.mostrarDados();
        System.out.println("Informe a quantidade para remover do estoque:");
        produto.setQuantidadeRemover(ler.nextInt());
        produto.removerEstoque();
        produto.mostrarDados();
    }
}

    
    

