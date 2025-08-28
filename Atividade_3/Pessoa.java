package Atividade_3;

//Modelo simples de PDV em Java

import java.util.ArrayList;
import java.util.List;

//Classe abstrata Pessoa
abstract class Pessoa {
 protected String nome;
 protected String telefone;

 public Pessoa(String nome, String telefone) {
     this.nome = nome;
     this.telefone = telefone;
 }
}

//Cliente herda de Pessoa
class Cliente extends Pessoa {
 private String cpf;
 private Endereco endereco;

 public Cliente(String nome, String telefone, String cpf, Endereco endereco) {
     super(nome, telefone);
     this.cpf = cpf;
     this.endereco = endereco;
 }
}

//Funcionário abstrato
abstract class Funcionario extends Pessoa {
 protected String codigo;

 public Funcionario(String nome, String telefone, String codigo) {
     super(nome, telefone);
     this.codigo = codigo;
 }
}

//Vendedor herda de Funcionário
class Vendedor extends Funcionario {
 public Vendedor(String nome, String telefone, String codigo) {
     super(nome, telefone, codigo);
 }
}

//Supervisor herda de Funcionário
class Supervisor extends Funcionario {
 public Supervisor(String nome, String telefone, String codigo) {
     super(nome, telefone, codigo);
 }

 public void aprovarPedido(Pedido pedido) {
     pedido.setAprovado(true);
 }
}

//Endereço (composição)
class Endereco {
 private String rua;
 private String cidade;

 public Endereco(String rua, String cidade) {
     this.rua = rua;
     this.cidade = cidade;
 }
}

//Produto
class Produto {
 private String nome;
 private double preco;
 private int estoque;

 public Produto(String nome, double preco, int estoque) {
     this.nome = nome;
     this.preco = preco;
     this.estoque = estoque;
 }

 public double getPreco() {
     return preco;
 }
}

//Item do Pedido
class ItemPedido {
 private Produto produto;
 private int quantidade;

 public ItemPedido(Produto produto, int quantidade) {
     this.produto = produto;
     this.quantidade = quantidade;
 }

 public double getSubtotal() {
     return produto.getPreco() * quantidade;
 }
}

//Interface de pagamento
interface Pagamento {
 void pagar(double valor);
}

//Pagamento em dinheiro
class PagamentoDinheiro implements Pagamento {
 public void pagar(double valor) {
     System.out.println("Pago em dinheiro: R$" + valor);
 }
}

//Pedido
class Pedido {
 private Cliente cliente;
 private Vendedor vendedor;
 private List<ItemPedido> itens = new ArrayList<>();
 private boolean aprovado = false;

 public Pedido(Cliente cliente, Vendedor vendedor) {
     this.cliente = cliente;
     this.vendedor = vendedor;
 }

 public void adicionarItem(Produto p, int qtd) {
     itens.add(new ItemPedido(p, qtd));
 }

 public double getTotal() {
     double total = 0;
     for (ItemPedido i : itens) {
         total += i.getSubtotal();
     }
     return total;
 }

 public void setAprovado(boolean aprovado) {
     this.aprovado = aprovado;
 }

 public boolean isAprovado() {
     return aprovado;
 }
}


