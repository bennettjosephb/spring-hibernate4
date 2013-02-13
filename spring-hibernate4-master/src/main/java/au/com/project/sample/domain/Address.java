/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author SONY
 */
@Entity
@Inheritance(strategy=InheritanceType 
.JOINED)
@Table(name="PROJECT_ADDRESS")
@SequenceGenerator(name="ADDRESS_SEQUENCE",
                   sequenceName="ADDRESS_SEQUENCE")
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="ADDRESS_SEQUENCE")
    @Column(name="ADDRESS_ID")
    private Long id;
    
    @Column(name="ADDRESS_NUMBER")
    private String number;

    @Column(name="ADDRESS_STREET1")
    private String street1;

    @Column(name="ADDRESS_STREET2")
    private String street2;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CIT_ID")
    private City city;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "STA_ID")
    private State state;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "COU_ID")
    private Country country;

    @Column(name="ADDRESS_POSTAL_CODE")
    private String postalCode;

    @Column(name="ADDRESS_COPY_TO_TEMPORARY")
    private Boolean copyToTemporaryAddress;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "EMP_ROL_ID")
//    private Address temporaryAddress;

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
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.Address[ id=" + id + " ]";
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the street1
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * @param street1 the street1 to set
     */
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * @return the street2
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * @param street2 the street2 to set
     */
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the copyToTemporaryAddress
     */
    public Boolean getCopyToTemporaryAddress() {
        return copyToTemporaryAddress;
    }

    /**
     * @param copyToTemporaryAddress the copyToTemporaryAddress to set
     */
    public void setCopyToTemporaryAddress(Boolean copyToTemporaryAddress) {
        this.copyToTemporaryAddress = copyToTemporaryAddress;
    }

    /**
     * @return the state
     */
    public State getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * @return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @return the city
     */
    public City getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(City city) {
        this.city = city;
    }
    
}
