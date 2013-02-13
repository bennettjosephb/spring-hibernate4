/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author SONY
 */
@Entity
@Table(name = "PROJECT_AUTHENTICATION_ROLE")
@SequenceGenerator(name="AUTHENTICATION_ROLE_SEQUENCE",
                   sequenceName="AUTHENTICATION_ROLE_SEQUENCE")
public class AuthenticationRole implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="AUTHENTICATION_ROLE_SEQUENCE")
    @Column(name = "AUT_ROL_ID")
    private Long id;
    
    @Column(name = "AUT_ROL_NAME")
    private String name;
    
    @Column(name = "AUT_ROL_VALUE")
    private Integer value ;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy="authenticationRole")    
    private List<ApplicationUser> applicationUser;

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
        if (!(object instanceof AuthenticationRole)) {
            return false;
        }
        AuthenticationRole other = (AuthenticationRole) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.Role[ id=" + id + " ]";
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
     * @return the value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * @return the applicationUser
     */
    public List<ApplicationUser> getApplicationUser() {
        return applicationUser;
    }

    /**
     * @param applicationUser the applicationUser to set
     */
    public void setApplicationUser(List<ApplicationUser> applicationUser) {
        this.applicationUser = applicationUser;
    }
    
}
