/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author SONY
 */
@Entity
@Table(name = "PROJECT_CERTIFICATION")
@SequenceGenerator(name="CERTIFICATION_SEQUENCE",
                   sequenceName="CERTIFICATION_SEQUENCE")
public class Certification implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="CERTIFICATION_SEQUENCE")
    @Column(name = "CER_ID")
    private Long id;
    
    @Column(name = "CER_NAME")
    private String name;
    
    @Column(name = "CER_VERSION")
    private String version;
    
    @Column(name = "CER_LAST_USED")
    private Integer lastUsed;
    
    @Column(name = "CER_EXP_YEAR")
    private Integer experienceYear;
    
    @Column(name = "CER_EXP_MONTH")
    private Integer experienceMonth;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Certification)) {
            return false;
        }
        Certification other = (Certification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.Certfication[ id=" + id + " ]";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the lastUsed
     */
    public Integer getLastUsed() {
        return lastUsed;
    }

    /**
     * @param lastUsed the lastUsed to set
     */
    public void setLastUsed(Integer lastUsed) {
        this.lastUsed = lastUsed;
    }

    /**
     * @return the experienceYear
     */
    public Integer getExperienceYear() {
        return experienceYear;
    }

    /**
     * @param experienceYear the experienceYear to set
     */
    public void setExperienceYear(Integer experienceYear) {
        this.experienceYear = experienceYear;
    }

    /**
     * @return the experienceMonth
     */
    public Integer getExperienceMonth() {
        return experienceMonth;
    }

    /**
     * @param experienceMonth the experienceMonth to set
     */
    public void setExperienceMonth(Integer experienceMonth) {
        this.experienceMonth = experienceMonth;
    }
    
}
