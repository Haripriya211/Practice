package onetoOne;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "employ")
public class Employ {
 private long empId;
 private String empName;
 private Address empAddress;
 public Employ() {
 }
 public Employ(String empName, Address empAddress) {
  this.empName = empName;
  this.empAddress = empAddress;
 }
 @Id
 @GeneratedValue
 @Column(name = "emp_ID")
 public long getempId() {
  return this.empId;
  }
public void setempId(long empId) {
  this.empId = empId;
 }
 @Column(name = "emp_NAME", nullable = false, length = 100)
 public String getempName() {
  return this.empName;
 }
 public void setempName(String empName) {
  this.empName = empName;
 }
 @OneToOne(cascade = CascadeType.ALL)
 public Address getempAddress() {
  return this.empAddress;
 }
 public void setempAddress(Address empAddress) {
  this.empAddress = empAddress;
 }
}

