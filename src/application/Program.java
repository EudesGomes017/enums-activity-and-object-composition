package application;

import entities.Client;
import entities.OrdeRItem;
import entities.Order;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

     /* aqui é para testar esse objetos

        INSTÂCIAMOS  o objeto Product
        Product p = new Product("TV", 1000.00);
        vamos instância agora ordemItem, a sequênciadentro do argumento é no nosso exemplo é quantidade 1, preço 1000.0
        e por último vamos coloca o nosso da instânciação do Product*
        OrdemItem oi1 =  new OrdemItem(1, 1000.00, p);

        System.out.println(oi1);
        */

        /*  Client cli = new Client("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));*/


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next()); // estamos usando sdf.parsepara transforma o tipo string que eu digitar a data para tipo Date

        /*depois de ler  os dados do cliente vamos instância o cliente*/
        Client client = new Client(name, email, birthDate);

        //ler dados do pedido
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next()); /*para converte esse String que o usuario digitar para OrderStatus  vamos
        usar OrderStatus.valueOf(sc.next());*/

        /*estamos instânciando o pedido. o instântete do tempo do pedido é o  horario atual do sistema por isso damos um new Date.
        status que digitamos anterior esse codigo,  cliente tbm q já intânciamos antes desse codigos*/
        Order order = new Order(new Date(), status, client);

        // ler os dados do pedido
        System.out.print("How many items to this order? ");
        int N = sc.nextInt(); // N quantidade de pedidos
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            /*vamos instâciar os objetos, temos q instânciar o produto depois intância o item de pedidod associado ao produto
            e depois inserir esse item de pedido no pedido.
            passo 1 intânciar o produto
            seundo passo vamos instânciar o item de pedido associado a esse produto */
            Product product = new Product(productName, productPrice);

            OrdeRItem it = new OrdeRItem(quantity, productPrice, product);


            /*para associar a lista de pedido dentro do order */
            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();

    }
}