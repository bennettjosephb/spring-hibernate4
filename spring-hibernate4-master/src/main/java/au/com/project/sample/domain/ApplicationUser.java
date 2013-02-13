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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author SONY
 */
@Entity
@Table(name="PROJECT_APPLICATION_USER")
@SequenceGenerator(name="APPLICATION_USER_SEQUENCE",
                   sequenceName="APPLICATION_USER_SEQUENCE")
public class ApplicationUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="APPLICATION_USER_SEQUENCE")
    @Column(name = "APP_USE_ID")
    private Long id;
    
    @Column(name = "APP_USE_USERNAME")
    private String username;
    
    @Column(name = "APP_USE_PASSWORD")
    private String password;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AUT_ROL_ID")
    private AuthenticationRole authenticationRole;

    @OneToOne(mappedBy="applicationUser")
    private Applicant applicant;

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
        if (!(object instanceof ApplicationUser)) {
            return false;
        }
        ApplicationUser other = (ApplicationUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.ApplicationUser[ id=" + id + " ]";
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the authenticationRole
     */
    public AuthenticationRole getAuthenticationRole() {
        return authenticationRole;
    }

    /**
     * @param authenticationRole the authenticationRole to set
     */
    public void setAuthenticationRole(AuthenticationRole authenticationRole) {
        this.authenticationRole = authenticationRole;
    }

    /**
     * @return the applicant
     */
    public Applicant getApplicant() {
        return applicant;
    }

    /**
     * @param applicant the applicant to set
     */
    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }
    
}
