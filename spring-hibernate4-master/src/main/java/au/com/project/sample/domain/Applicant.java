/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PostLoad;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/**
 *
 * @author SONY
 */
@Entity
@Table(name = "PROJECT_APPLICANT")
public class Applicant extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "APP_ELIGIBLE")
    private Boolean eligible;
    @Column(name = "APP_QUALIFICATION")
    private String qualification;
    @Column(name = "APP_RES_HEADLINE")
    private String resumeHeadline;
    @Column(name = "APP_EMAIL_ID")
    private String emailId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CAT_ID")
    private Category category;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PROJECT_APP_SUB_CATEGORY", joinColumns =
    @JoinColumn(name = "APP_ID"), inverseJoinColumns =
    @JoinColumn(name = "SUB_CAT_ID"))
    private List<SubCategory> subCategory = new ArrayList<SubCategory>();
    @Column(name = "APP_SAL_FROM")
    private Integer salaryFrom;
    @Column(name = "APP_SAL_TO")
    private Integer salaryTo;
    @Column(name = "APP_RATE")
    private Integer rate;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "APP_ID")
    private List<EmploymentSummary> employmentSummary = new ArrayList<EmploymentSummary>();
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "APP_ID")
    private List<Photo> photos = new ArrayList<Photo>();
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "APP_ID")
    private List<Project> projects = new ArrayList<Project>();
    @Lob
    @Column(name = "APP_KEY_SKILLS", length = 0x400)
    private String keySkills;
    @Column(name = "APP_MAR_STATUS")
    private String maritalStatus;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUR_LOC_ID")
    private Location currentLocation;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRE_LOC_ID")
    private Location preferredLocation;
    @Column(name = "APP_PRE_LOCATION")
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PROJECT_APP_PRE_LOCATION", joinColumns =
    @JoinColumn(name = "APP_ID"), inverseJoinColumns =
    @JoinColumn(name = "PRE_LOC_ID"))
    private List<Location> preferredLocations = new ArrayList<Location>();
    @Column(name = "APP_EXP_YEARS")
    private Integer experienceYears;
    @Column(name = "APP_EXP_MONTHS")
    private Integer experienceMonths;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "APP_ID")
    private List<Document> documents = new ArrayList<Document>();
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EMP_ROL_ID")
    private EmploymentRole employmentRole = new EmploymentRole();
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "APP_ID")
    private List<EducationSummary> educationSummary = new ArrayList<EducationSummary>();
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PROJECT_APP_ROLE", joinColumns =
    @JoinColumn(name = "APP_ID"), inverseJoinColumns =
    @JoinColumn(name = "AUT_ROL_ID"))
    private List<AuthenticationRole> roles = new ArrayList<AuthenticationRole>();
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PROJECT_APP_CERTIFICATION", joinColumns =
    @JoinColumn(name = "APP_ID"), inverseJoinColumns =
    @JoinColumn(name = "CER_ID"))
    private List<Certification> certfications = new ArrayList<Certification>();
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SAL_ID")
    private Salary annualSalary = new Salary();
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TOT_EXP_ID")
    private TotalExperience totalExperience = new TotalExperience();
    @OneToOne
    @JoinColumn(name = "APP_USE_ID")
    private ApplicationUser applicationUser;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Applicant)) {
            return false;
        }
        Applicant other = (Applicant) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.APP[ id=" + getId() + " ]";
    }

    /**
     * @return the eligible
     */
    public Boolean getEligible() {
        return eligible;
    }

    /**
     * @param eligible the eligible to set
     */
    public void setEligible(Boolean eligible) {
        this.eligible = eligible;
    }

    /**
     * @return the qualification
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * @param qualification the qualification to set
     */
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    /**
     * @return the subCategory
     */
    public List<SubCategory> getSubCategory() {
        return subCategory;
    }

    /**
     * @return the salaryFrom
     */
    public Integer getSalaryFrom() {
        return salaryFrom;
    }

    /**
     * @param salaryFrom the salaryFrom to set
     */
    public void setSalaryFrom(Integer salaryFrom) {
        this.salaryFrom = salaryFrom;
    }

    /**
     * @return the salaryTo
     */
    public Integer getSalaryTo() {
        return salaryTo;
    }

    /**
     * @param salaryTo the salaryTo to set
     */
    public void setSalaryTo(Integer salaryTo) {
        this.salaryTo = salaryTo;
    }

    /**
     * @return the rate
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the keySkills
     */
    public String getKeySkills() {
        return keySkills;
    }

    /**
     * @param keySkills the keySkills to set
     */
    public void setKeySkills(String keySkills) {
        this.keySkills = keySkills;
    }

    /**
     * @return the maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return the currentLocation
     */
    public Location getCurrentLocation() {
        return currentLocation;
    }

    /**
     * @param currentLocation the currentLocation to set
     */
    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * @return the resumeHeadline
     */
    public String getResumeHeadline() {
        return resumeHeadline;
    }

    /**
     * @param resumeHeadline the resumeHeadline to set
     */
    public void setResumeHeadline(String resumeHeadline) {
        this.resumeHeadline = resumeHeadline;
    }

    /**
     * @return the preferredLocations
     */
    public List<Location> getPreferredLocations() {
        return preferredLocations;
    }

    /**
     * @return the projects
     */
    public List<Project> getProjects() {
        return projects;
    }

    /**
     * @return the experienceYears
     */
    public Integer getExperienceYears() {
        return experienceYears;
    }

    /**
     * @param experienceYears the experienceYears to set
     */
    public void setExperienceYears(Integer experienceYears) {
        this.experienceYears = experienceYears;
    }

    /**
     * @return the experienceMonths
     */
    public Integer getExperienceMonths() {
        return experienceMonths;
    }

    /**
     * @param experienceMonths the experienceMonths to set
     */
    public void setExperienceMonths(Integer experienceMonths) {
        this.experienceMonths = experienceMonths;
    }

    /**
     * @return the documents
     */
    public List<Document> getDocuments() {
        return documents;
    }

    /**
     * @param documents the documents to set
     */
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    /**
     * @return the roles
     */
    public List<AuthenticationRole> getRoles() {
        return roles;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(List<AuthenticationRole> roles) {
        this.roles = roles;
    }

    /**
     * @return the certfications
     */
    public List<Certification> getCertfications() {
        return certfications;
    }

    /**
     * @param certfications the certfications to set
     */
    public void setCertfications(List<Certification> certfications) {
        this.certfications = certfications;
    }

    /**
     * @return the educationSummary
     */
    public List<EducationSummary> getEducationSummary() {
        return educationSummary;
    }

    /**
     * @param educationSummary the educationSummary to set
     */
    public void setEducationSummary(List<EducationSummary> educationSummary) {
        this.educationSummary = educationSummary;
    }

    /**
     * @return the annualSalary
     */
    public Salary getAnnualSalary() {
        return annualSalary;
    }

    /**
     * @param annualSalary the annualSalary to set
     */
    public void setAnnualSalary(Salary annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * @return the totalExperience
     */
    public TotalExperience getTotalExperience() {
        return totalExperience;
    }

    /**
     * @param totalExperience the totalExperience to set
     */
    public void setTotalExperience(TotalExperience totalExperience) {
        this.totalExperience = totalExperience;
    }

    /**
     * @return the employmentSummary
     */
    public List<EmploymentSummary> getEmploymentSummary() {
        return employmentSummary;
    }

    /**
     * @param employmentSummary the employmentSummary to set
     */
    public void setEmploymentSummary(List<EmploymentSummary> employmentSummary) {
        this.employmentSummary = employmentSummary;
    }

    /**
     * @return the preferredLocation
     */
    public Location getPreferredLocation() {
        return preferredLocation;
    }

    /**
     * @param preferredLocation the preferredLocation to set
     */
    public void setPreferredLocation(Location preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    /**
     * @return the employmentRole
     */
    public EmploymentRole getEmploymentRole() {
        return employmentRole;
    }

    /**
     * @param employmentRole the employmentRole to set
     */
    public void setEmploymentRole(EmploymentRole employmentRole) {
        this.employmentRole = employmentRole;
    }

    /**
     * @return the photos
     */
    public List<Photo> getPhotos() {
        return photos;
    }

    /**
     * @param photos the photos to set
     */
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    @PrePersist
    public void prepersist() {
        System.out.println("pre persist!!");
    }

    @PreUpdate
    public void preupdate() {
        System.out.println("pre update!!");
    }

    @PostUpdate
    public void postupdate() {
        System.out.println("post update!!");
    }

    @PostLoad
    public void postload() {
        System.out.println("post load!!");
    }

    /**
     * @return the applicationUser
     */
    public ApplicationUser getApplicationUser() {
        return applicationUser;
    }

    /**
     * @param applicationUser the applicationUser to set
     */
    public void setApplicationUser(ApplicationUser applicationUser) {
        this.applicationUser = applicationUser;
    }
}
