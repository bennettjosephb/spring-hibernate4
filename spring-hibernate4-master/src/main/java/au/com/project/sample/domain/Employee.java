/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author SONY
 */
@Entity
@Table(name="PROJECT_EMPLOYEE")
//@SequenceGenerator(name="EMPLOYEE_SEQUENCE",
//                   sequenceName="EMPLOYEE_SEQUENCE")
public class Employee extends Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "EMPLOYEE_ROLLNUMBER")
    private String rollNumber;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.Employee[ id=" + getId() + getRollNumber() + " ]";
    }

    /**
     * @return the rollNumber
     */
    public String getRollNumber() {
        return rollNumber;
    }

    /**
     * @param rollNumber the rollNumber to set
     */
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
