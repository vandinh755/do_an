
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
@Table(name = "creditcrad")
public class CreditcradEntity {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     
     private String name;
     private double number;
     @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate cardDate;
     
     private String amount;
     private double passwork;
    
     @OneToMany(mappedBy = "creditcrad",fetch = FetchType.LAZY)
    List<PaymentsEntity> paymentslist;

    public CreditcradEntity(String name, double number, LocalDate cardDate, String amount, double passwork, List<PaymentsEntity> paymentslist) {
        this.name = name;
        this.number = number;
        this.cardDate = cardDate;
        this.amount = amount;
        this.passwork = passwork;
        this.paymentslist = paymentslist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public LocalDate getCardDate() {
        return cardDate;
    }

    public void setCardDate(LocalDate cardDate) {
        this.cardDate = cardDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public double getPasswork() {
        return passwork;
    }

    public void setPasswork(double passwork) {
        this.passwork = passwork;
    }

    public List<PaymentsEntity> getPaymentslist() {
        return paymentslist;
    }

    public void setPaymentslist(List<PaymentsEntity> paymentslist) {
        this.paymentslist = paymentslist;
    }
     
     
     
     
     public String getcardDateFormatted(){
        DateTimeFormatter cardDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return cardDateFormat.format(cardDate);
    }
     

}
