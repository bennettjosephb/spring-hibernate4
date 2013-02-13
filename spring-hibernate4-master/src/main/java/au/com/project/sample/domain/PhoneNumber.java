/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import au.com.project.sample.domain.phonenumber.ContactNumber;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author SONY
 */
@Entity
@Table(name="PROJECT_PHONE_NUMBER")
@SequenceGenerator(name="PHONE_NUMBER_SEQUENCE",
                   sequenceName="PHONE_NUMBER_SEQUENCE")
public class PhoneNumber implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="PHONE_NUMBER_SEQUENCE")
    @Column(name = "PHO_NUM_ID")
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PROJECT_PHO_NUM_CON_NUMBER", joinColumns =
    @JoinColumn(name = "PHO_NUM_ID"), inverseJoinColumns =
    @JoinColumn(name = "CON_NUM_ID"))
    private List<ContactNumber> workNumbers;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PROJECT_PHO_NUM_CON_NUMBER", joinColumns =
    @JoinColumn(name = "PHO_NUM_ID"), inverseJoinColumns =
    @JoinColumn(name = "CON_NUM_ID"))
    private List<ContactNumber> homeNumbers;
    
//    @OneToMany(cascade = CascadeType.ALL/*, mappedBy = "phoneNumber"*/)
//    @JoinColumn(name="CON_NUM_ID_ID")
//    private List<ContactNumber> mobileNumbers;
            
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PROJECT_PHO_NUM_CON_NUMBER", joinColumns =
    @JoinColumn(name = "PHO_NUM_ID"), inverseJoinColumns =
    @JoinColumn(name = "CON_NUM_ID"))
    private List<ContactNumber> faxNumbers;

//    @Column(name = "PHONENUMBER_COUNTRYCODE")
//    private String countryCode;
//    @Column(name = "PHONENUMBER_AREACODE")
//    private String areaCode;
//    @Column(name = "PHONENUMBER_NUMBER")
//    private String number;
//    @ManyToOne(cascade= CascadeType.ALL)
//    @JoinColumn(name="PERSON_ID", nullable = false)
//    private Person person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber other = (PhoneNumber) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.PhoneNumber[ id=" + getId() + " ]";
    }

//    /**
//     * @return the countryCode
//     */
//    public String getCountryCode() {
//        return countryCode;
//    }
//
//    /**
//     * @param countryCode the countryCode to set
//     */
//    public void setCountryCode(String countryCode) {
//        this.countryCode = countryCode;
//    }
//
//    /**
//     * @return the areaCode
//     */
//    public String getAreaCode() {
//        return areaCode;
//    }
//
//    /**
//     * @param areaCode the areaCode to set
//     */
//    public void setAreaCode(String areaCode) {
//        this.areaCode = areaCode;
//    }
//
//    /**
//     * @return the number
//     */
//    public String getNumber() {
//        return number;
//    }
//
//    /**
//     * @param number the number to set
//     */
//    public void setNumber(String number) {
//        this.number = number;
//    }
//
    /**
     * @return the employee
     */
//    public Person getPerson() {
//        return person;
//    }
//
//    /**
//     * @param employee the employee to set
//     */
//    public void setPerson(Person person) {
//        this.person = person;
//    }

//    /**
//     * @return the workNumbers
//     */
//    public List<Work> getWorkNumbers() {
//        return workNumbers;
//    }
//
//    /**
//     * @param workNumbers the workNumbers to set
//     */
//    public void setWorkNumbers(List<Work> workNumbers) {
//        this.workNumbers = workNumbers;
//    }
//
//    /**
//     * @return the homeNumbers
//     */
//    public List<Home> getHomeNumbers() {
//        return homeNumbers;
//    }
//
//    /**
//     * @param homeNumbers the homeNumbers to set
//     */
//    public void setHomeNumbers(List<Home> homeNumbers) {
//        this.homeNumbers = homeNumbers;
//    }
//
//    /**
//     * @return the mobileNumbers
//     */
//    public List<Mobile> getMobileNumbers() {
//        return mobileNumbers;
//    }
//
//    /**
//     * @param mobileNumbers the mobileNumbers to set
//     */
//    public void setMobileNumbers(List<Mobile> mobileNumbers) {
//        this.mobileNumbers = mobileNumbers;
//    }
//
//    /**
//     * @return the faxNumbers
//     */
//    public List<Fax> getFaxNumbers() {
//        return faxNumbers;
//    }
//
//    /**
//     * @param faxNumbers the faxNumbers to set
//     */
//    public void setFaxNumbers(List<Fax> faxNumbers) {
//        this.faxNumbers = faxNumbers;
//    }

    /**
     * @return the workNumbers
     */
    public List<ContactNumber> getWorkNumbers() {
        return workNumbers;
    }

    /**
     * @param workNumbers the workNumbers to set
     */
    public void setWorkNumbers(List<ContactNumber> workNumbers) {
        this.workNumbers = workNumbers;
    }

    /**
     * @return the homeNumbers
     */
    public List<ContactNumber> getHomeNumbers() {
        return homeNumbers;
    }

    /**
     * @param homeNumbers the homeNumbers to set
     */
    public void setHomeNumbers(List<ContactNumber> homeNumbers) {
        this.homeNumbers = homeNumbers;
    }

//    /**
//     * @return the mobileNumbers
//     */
//    public List<ContactNumber> getMobileNumbers() {
//        return mobileNumbers;
//    }
//
//    /**
//     * @param mobileNumbers the mobileNumbers to set
//     */
//    public void setMobileNumbers(List<ContactNumber> mobileNumbers) {
//        this.mobileNumbers = mobileNumbers;
//    }

    /**
     * @return the faxNumbers
     */
    public List<ContactNumber> getFaxNumbers() {
        return faxNumbers;
    }

    /**
     * @param faxNumbers the faxNumbers to set
     */
    public void setFaxNumbers(List<ContactNumber> faxNumbers) {
        this.faxNumbers = faxNumbers;
    }
}
