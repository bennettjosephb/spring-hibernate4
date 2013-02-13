/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import au.com.project.sample.domain.phonenumber.ContactNumber;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author SONY
 */
@Entity
@Inheritance(strategy=InheritanceType 
.JOINED)
@Table(name="PROJECT_PERSON")
@SequenceGenerator(name="PERSON_SEQUENCE",
                   sequenceName="PERSON_SEQUENCE")
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="PERSON_SEQUENCE")
    @Column(name="PERSON_ID")
    private Long id = -1l;

    @Column(name="PERSON_FIRST_NAME", nullable=false)
    private String firstName;
    
    @Column(name="PERSON_MIDDLE_NAME")
    private String middleName;
    
    @Column(name="PERSON_LAST_NAME", nullable=false)
    private String lastName;
    
    @Column(name="PERSON_DOB", nullable=false)
    @Temporal(TemporalType.DATE)
    private Calendar dob;
    
    @Column(name="PERSON_GENDER", nullable=false)
    private Boolean gender;
    
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn (name="ADDRESS_ID")
    private Address address;

//    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
//    private List<PhoneNumber> phoneNumber = new ArrayList<PhoneNumber>();
    
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<ContactNumber> mobileNumber = new ArrayList<ContactNumber>();

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<ContactNumber> faxNumber = new ArrayList<ContactNumber>();

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<ContactNumber> workNumber = new ArrayList<ContactNumber>();

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<ContactNumber> homeNumber = new ArrayList<ContactNumber>();

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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.Person[ id=" + getId() + " ]";
    }

//    public List<PhoneNumber> getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//    public void addPhoneNumber(PhoneNumber phoneNumber) {
//        phoneNumber.setPerson(this);
//        this.phoneNumber.add(phoneNumber);
//    }

    /**
     * @return the dob
     */
    public Calendar getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Calendar dob) {
        this.dob = dob;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return the gender
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the mobileNumber
     */
    public List<ContactNumber> getMobileNumber() {
        return mobileNumber;
    }

    /**
     * @param mobileNumber the mobileNumber to set
     */
    public void setMobileNumber(List<ContactNumber> mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void addMobileNumber(ContactNumber mobileNumber) {
        mobileNumber.setPerson(this);
        this.mobileNumber.add(mobileNumber);
    }

    /**
     * @return the faxNumber
     */
    public List<ContactNumber> getFaxNumber() {
        return faxNumber;
    }

    /**
     * @param faxNumber the faxNumber to set
     */
    public void setFaxNumber(List<ContactNumber> faxNumber) {
        this.faxNumber = faxNumber;
    }
    public void addFaxNumber(ContactNumber faxNumber) {
        faxNumber.setPerson(this);
        this.faxNumber.add(faxNumber);
    }

    /**
     * @return the workNumber
     */
    public List<ContactNumber> getWorkNumber() {
        return workNumber;
    }

    /**
     * @param workNumber the workNumber to set
     */
    public void setWorkNumber(List<ContactNumber> workNumber) {
        this.workNumber = workNumber;
    }
    public void addWorkNumber(ContactNumber workNumber) {
        workNumber.setPerson(this);
        this.workNumber.add(workNumber);
    }

    /**
     * @return the homeNumber
     */
    public List<ContactNumber> getHomeNumber() {
        return homeNumber;
    }

    /**
     * @param homeNumber the homeNumber to set
     */
    public void setHomeNumber(List<ContactNumber> homeNumber) {
        this.homeNumber = homeNumber;
    }
    public void addHomeNumber(ContactNumber homeNumber) {
        homeNumber.setPerson(this);
        this.homeNumber.add(homeNumber);
    }
}
