
package inv.model;


public class InvoiceItem {
   private InvoiceHeader inv;
    private String name;
    private int count;
    private double price;

    public InvoiceItem(InvoiceHeader inv, String name, int count, double price) {
        this.inv = inv;
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InvoiceHeader getInv() {
        return inv;
    }

    public void setInv(InvoiceHeader inv) {
        this.inv = inv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Items{" + "name=" + name + ", count=" + count + ", price=" + price + '}';
    }
    
    
   public double getTotal() {
        return count * price;
    }
}
