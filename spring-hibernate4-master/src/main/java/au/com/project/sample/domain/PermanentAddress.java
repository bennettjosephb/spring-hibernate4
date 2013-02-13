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
@Table(name="PROJECT_PERMANENT_ADDRESS")
//@SequenceGenerator(name="PERMANENT_ADDRESS_SEQUENCE",
//                   sequenceName="PERMANENT_ADDRESS_SEQUENCE")
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERMANENT_ADDRESS_SEQUENCE")
public class PermanentAddress extends Address implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Column(name="PER_ADD_COPY_ADD")
    private Boolean copyAddress;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermanentAddress)) {
            return false;
        }
        PermanentAddress other = (PermanentAddress) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.PermanentAddress[ id=" + getId() + " ]";
    }

    /**
     * @return the copyAddress
     */
    public Boolean getCopyAddress() {
        return copyAddress;
    }

    /**
     * @param copyAddress the copyAddress to set
     */
    public void setCopyAddress(Boolean copyAddress) {
        this.copyAddress = copyAddress;
    }
    
}
