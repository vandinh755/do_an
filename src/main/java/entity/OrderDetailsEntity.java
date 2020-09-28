
package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "orderdetails")
public class OrderDetailsEntity {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderDetailsID;
    
  @ManyToOne
    @JoinColumn(name = "orderId")
    private OrderEntity order;
  @ManyToOne
    @JoinColumn(name = "productsID")
  private ProductsEntity product;
  
  private String quantity;
  private String unitPrice;

    public OrderDetailsEntity() {
    }

    public int getOrderDetailsID() {
        return orderDetailsID;
    }

    public void setOrderDetailsID(int orderDetailsID) {
        this.orderDetailsID = orderDetailsID;
    }

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    public ProductsEntity getProduct() {
        return product;
    }

    public void setProduct(ProductsEntity product) {
        this.product = product;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    

  
}
