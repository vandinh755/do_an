
package entity;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "order")
public class OrderEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private String name;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOrder;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate shippingDate;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate destinstionDate;
    
    private String amount;
    private String classer;
    
    
    
     @ManyToOne
    @JoinColumn(name = "customersID")
    private CustomerEntity customer;
    
    
    @OneToMany(mappedBy = "order",fetch = FetchType.LAZY)
    List<OrderDetailsEntity> orderdertailslist;

    public OrderEntity(String name, LocalDate dateOrder, LocalDate shippingDate, LocalDate destinstionDate, String amount, String classer, CustomerEntity customer, List<OrderDetailsEntity> orderdertailslist) {
        this.name = name;
        this.dateOrder = dateOrder;
        this.shippingDate = shippingDate;
        this.destinstionDate = destinstionDate;
        this.amount = amount;
        this.classer = classer;
        this.customer = customer;
        this.orderdertailslist = orderdertailslist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public LocalDate getDestinstionDate() {
        return destinstionDate;
    }

    public void setDestinstionDate(LocalDate destinstionDate) {
        this.destinstionDate = destinstionDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getClasser() {
        return classer;
    }

    public void setClasser(String classer) {
        this.classer = classer;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public List<OrderDetailsEntity> getOrderdertailslist() {
        return orderdertailslist;
    }

    public void setOrderdertailslist(List<OrderDetailsEntity> orderdertailslist) {
        this.orderdertailslist = orderdertailslist;
    }
    
    
    
    
    public String getdateOrderFormatted(){
        DateTimeFormatter dateOrderFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dateOrderFormat.format(dateOrder);
    }
    public String getshippingDateFormatted(){
        DateTimeFormatter shippingDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return shippingDateFormat.format(shippingDate);
    }
    public String getdestinstionDateFormatted(){
        DateTimeFormatter destinstionDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return destinstionDateFormat.format(destinstionDate);
    }
}
