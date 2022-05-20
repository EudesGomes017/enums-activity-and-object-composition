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

            Product product = new Product(productName, productPrice);

            OrdeRItem it = new OrdeRItem(quantity, productPrice, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();

    }
}
