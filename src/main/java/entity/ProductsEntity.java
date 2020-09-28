
package entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     
    private String name;
    private String Confurationinfo;
    private String classer;
    private String amount;
    private String image;
    
    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY)
    List<OrderDetailsEntity> orderdetailslist; 
    
    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY)
    List<ProductPromotionEntity> productpromotionlist;  

    public ProductsEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfurationinfo() {
        return Confurationinfo;
    }

    public void setConfurationinfo(String Confurationinfo) {
        this.Confurationinfo = Confurationinfo;
    }

    public String getClasser() {
        return classer;
    }

    public void setClasser(String classer) {
        this.classer = classer;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<OrderDetailsEntity> getOrderdetailslist() {
        return orderdetailslist;
    }

    public void setOrderdetailslist(List<OrderDetailsEntity> orderdetailslist) {
        this.orderdetailslist = orderdetailslist;
    }

    public List<ProductPromotionEntity> getProductpromotionlist() {
        return productpromotionlist;
    }

    public void setProductpromotionlist(List<ProductPromotionEntity> productpromotionlist) {
        this.productpromotionlist = productpromotionlist;
    }

    

    
    
}
