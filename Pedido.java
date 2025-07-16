public class Pedido {
    int numero;
    ArrayList<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public Pedido(int numero) {
        this.numero = numero;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.preco;
        }
        return total;
    }

    public void imprimir() {
        System.out.println("Pedido #" + numero);
        int i = 1;
        for (ItemPedido item : itens) {
            System.out.printf("%d - %s ($%.2f)%n", i++, item.nomeItem, item.preco);
        }
        System.out.printf("Total: $%.2f%n%n", calcularTotal());
    }
}
