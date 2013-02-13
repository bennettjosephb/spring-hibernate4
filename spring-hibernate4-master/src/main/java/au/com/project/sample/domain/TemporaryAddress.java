/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author SONY
 */
@Entity
@Table(name="PROJECT_TEMPORARY_ADDRESS")
//@SequenceGenerator(name="TEMPORARY_ADDRESS_SEQUENCE",
//                   sequenceName="TEMPORARY_ADDRESS_SEQUENCE")
public class TemporaryAddress extends Address implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemporaryAddress)) {
            return false;
        }
        TemporaryAddress other = (TemporaryAddress) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.TemporaryAddress[ id=" + getId() + " ]";
    }
    
}
