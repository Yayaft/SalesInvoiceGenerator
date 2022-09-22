
package inv.model;

import java.util.ArrayList;
import java.util.Date;


public class InvoiceHeader {
    private int no;
    private String name;
    private Date date;
    private ArrayList<InvoiceItem> items;

    public InvoiceHeader(int no, String name, Date date) {
        this.no = no;
        this.name = name;
        this.date = date;
    }

    public InvoiceHeader() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<InvoiceItem> getItems() {
        if (items == null) {
            items = new ArrayList(); 
        }
        return items;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "no=" + no + ", name=" + name + ", date=" + date + ", items=" + items + '}';
    }

 
    public double getTotal () {
        double total = 0.0;
        
        
        for (InvoiceItem item :getItems()) {
            total += item.getTotal();
        }
        
        return total;
    }
       
   
        
    
     
    
    
}
