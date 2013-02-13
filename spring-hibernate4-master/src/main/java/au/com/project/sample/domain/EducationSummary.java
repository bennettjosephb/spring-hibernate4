/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author SONY
 */
@Entity
@Table(name = "PROJECT_EDUCATION_SUMMARY")
@SequenceGenerator(name="EDUCATION_SUMMARY_SEQUENCE",
                   sequenceName="EDUCATION_SUMMARY_SEQUENCE")
public class EducationSummary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="EDUCATION_SUMMARY_SEQUENCE")
    @Column(name = "EDU_SUM_ID")
    private Long id;
    @Column(name = "EDU_SUM_FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Calendar fromDate;
    @Column(name = "EDU_SUM_TO_DATE")
    @Temporal(TemporalType.DATE)
    private Calendar toDate;
    @Column(name = "EDU_SUM_COURSE_NAME")
    private String courseName;
    @Column(name = "EDU_SUM_PASSING_YEAR")
    private Integer passingYear;
    @Column(name = "EDU_SUM_INSTITUTE")
    private String institute;
    @Column(name = "EDU_SUM_SPECIALIZATION")
    private String specialization;
    @Column(name = "EDU_SUM_TYPE")
    private EducationType educationType;
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
        if (!(object instanceof EducationSummary)) {
            return false;
        }
        EducationSummary other = (EducationSummary) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.EducationSummary[ id=" + id + " ]";
    }

    /**
     * @return the fromDate
     */
    public Calendar getFromDate() {
        return fromDate;
    }

    /**
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Calendar fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * @return the toDate
     */
    public Calendar getToDate() {
        return toDate;
    }

    /**
     * @param toDate the toDate to set
     */
    public void setToDate(Calendar toDate) {
        this.toDate = toDate;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the passingYear
     */
    public Integer getPassingYear() {
        return passingYear;
    }

    /**
     * @param passingYear the passingYear to set
     */
    public void setPassingYear(Integer passingYear) {
        this.passingYear = passingYear;
    }

    /**
     * @return the institute
     */
    public String getInstitute() {
        return institute;
    }

    /**
     * @param institute the institute to set
     */
    public void setInstitute(String institute) {
        this.institute = institute;
    }

    /**
     * @return the specialization
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * @param specialization the specialization to set
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * @return the educationType
     */
    public EducationType getEducationType() {
        return educationType;
    }

    /**
     * @param educationType the educationType to set
     */
    public void setEducationType(EducationType educationType) {
        this.educationType = educationType;
    }
}
