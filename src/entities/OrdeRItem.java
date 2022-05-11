package entities;

public class OrdeRItem {

    private Integer quantity;
    private Double price;


    private Product product;

    public OrdeRItem() {

    }

    public OrdeRItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
   //retorna o preço do item * a quantidade desse item
    public double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName()// entramos no objeto do produto e pegamos o nome dele
            + ", $ "
            + String.format(" %.2f", price)
            + ", Quantity: "
            + quantity
            + ", Sbtotal: $ "
            + String.format(" %.2f", subTotal());
    }
}
