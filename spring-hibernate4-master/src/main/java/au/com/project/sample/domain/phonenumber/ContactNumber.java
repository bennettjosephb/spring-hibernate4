/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain.phonenumber;

import au.com.project.sample.domain.Person;
import au.com.project.sample.domain.PhoneNumber;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author SONY
 */
@Entity
public class ContactNumber implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CON_NUM_ID")
    private Long id;
    @Column(name = "CON_NUM_COUNTRYCODE")
    private String countryCode;
    @Column(name = "CON_NUM_AREACODE")
    private String areaCode;
    @Column(name = "CON_NUM_NUMBER")
    private String number;
    @Column(name = "CON_NUM_TYPE")
    @Enumerated(EnumType.STRING)
    private ContactNumberType contactNumberType;
//    @ManyToOne
//    @JoinColumn(name="PHO_NUM_ID")
//    private PhoneNumber phoneNumber;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="PERSON_ID", nullable = false)
    private Person person;
    
//    private PhoneNumber mobileLink;
    
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
        if (!(object instanceof ContactNumber)) {
            return false;
        }
        ContactNumber other = (ContactNumber) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.Fax[ id=" + id + " ]";
    }

    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * @param areaCode the areaCode to set
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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

//    /**
//     * @return the phoneNumber
//     */
//    public PhoneNumber getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    /**
//     * @param phoneNumber the phoneNumber to set
//     */
//    public void setPhoneNumber(PhoneNumber phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

    /**
     * @return the contactNumberType
     */
    public ContactNumberType getContactNumberType() {
        return contactNumberType;
    }

    /**
     * @param contactNumberType the contactNumberType to set
     */
    public void setContactNumberType(ContactNumberType contactNumberType) {
        this.contactNumberType = contactNumberType;
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }

}
