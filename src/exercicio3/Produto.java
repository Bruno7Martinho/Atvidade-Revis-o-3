/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author 7
 */
public class Produto {
        private String nome;
    private int quantidade;
    private double preco;
    private int quantidadeAdicionar;
    private int quantidadeRemover;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeAdicionar() {
        return quantidadeAdicionar;
    }

    public void setQuantidadeAdicionar(int quantidadeAdicionar) {
        this.quantidadeAdicionar = quantidadeAdicionar;
    }

    public int getQuantidadeRemover() {
        return quantidadeRemover;
    }

    public void setQuantidadeRemover(int quantidadeRemover) {
        this.quantidadeRemover = quantidadeRemover;
    }

    public void adicionarEstoque() {
        if (quantidadeAdicionar > 0) {
            quantidade += quantidadeAdicionar;
            System.out.println(quantidadeAdicionar + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade a adicionar deve ser positiva.");
        }
    }

    public void removerEstoque() {
        if (quantidadeRemover > 0) {
            if (quantidade >= quantidadeRemover) {
                quantidade -= quantidadeRemover;
                System.out.println(quantidadeRemover + " unidades removidas do estoque.");
            } else {
                System.out.println("Estoque insuficiente para remover " + quantidade + " unidades.");
            }
        } else {
            System.out.println("Quantidade a remover deve ser positiva.");
        }
    }

    public void mostrarDados() {
        System.out.println("Nome:" + nome);
        System.out.println("Quantidade no estoque:" + quantidade);
        System.out.println("Preço: R$ " + preco);

    }
}


