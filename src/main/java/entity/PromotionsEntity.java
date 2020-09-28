
package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "promotions")
public class PromotionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private String discountproducts;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateStar;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateClose;
    
    private String descrption;
    private String amount;
    
    @OneToMany(mappedBy = "promotions",fetch = FetchType.LAZY)
    List<ProductPromotionEntity> productsPromotionslist;

    public PromotionsEntity(String discountproducts, LocalDate dateStar, LocalDate dateClose, String descrption, String amount, List<ProductPromotionEntity> productsPromotionslist) {
        this.discountproducts = discountproducts;
        this.dateStar = dateStar;
        this.dateClose = dateClose;
        this.descrption = descrption;
        this.amount = amount;
        this.productsPromotionslist = productsPromotionslist;
    }

    public String getDiscountproducts() {
        return discountproducts;
    }

    public void setDiscountproducts(String discountproducts) {
        this.discountproducts = discountproducts;
    }

    public LocalDate getDateStar() {
        return dateStar;
    }

    public void setDateStar(LocalDate dateStar) {
        this.dateStar = dateStar;
    }

    public LocalDate getDateClose() {
        return dateClose;
    }

    public void setDateClose(LocalDate dateClose) {
        this.dateClose = dateClose;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public List<ProductPromotionEntity> getProductsPromotionslist() {
        return productsPromotionslist;
    }

    public void setProductsPromotionslist(List<ProductPromotionEntity> productsPromotionslist) {
        this.productsPromotionslist = productsPromotionslist;
    }
    
    
    
    
    public String getdateStarFormatted(){
        DateTimeFormatter dateStarFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dateStarFormat.format(dateStar);
    }
    public String getdateCloseFormatted(){
        DateTimeFormatter dateCloseFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dateCloseFormat.format(dateClose);
    }
}
