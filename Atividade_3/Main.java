package Atividade_3;

//Classe principal
public class Main {
public static void main(String[] args) {
   Endereco end = new Endereco("Rua A", "São Paulo");
   Cliente c1 = new Cliente("João", "9999-9999", "123.456.789-00", end);
   Vendedor v1 = new Vendedor("Maria", "8888-8888", "V01");
   Supervisor s1 = new Supervisor("Carlos", "7777-7777", "S01");

   Produto p1 = new Produto("Fone", 100.0, 10);
   Produto p2 = new Produto("Mouse", 50.0, 5);

   Pedido pedido = new Pedido(c1, v1);
   pedido.adicionarItem(p1, 2);
   pedido.adicionarItem(p2, 1);

   System.out.println("Total do pedido: R$" + pedido.getTotal());

   // Supervisor aprova
   s1.aprovarPedido(pedido);
   System.out.println("Pedido aprovado? " + pedido.isAprovado());

   // Pagamento
   Pagamento pagamento = new PagamentoDinheiro();
   pagamento.pagar(pedido.getTotal());
}
}