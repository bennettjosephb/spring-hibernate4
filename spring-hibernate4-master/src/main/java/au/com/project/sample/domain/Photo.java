/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author SONY
 */
@Entity
@Table(name = "PROJECT_PHOTO")
@SequenceGenerator(name="PHOTO_SEQUENCE",
                   sequenceName="PHOTO_SEQUENCE")
public class Photo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="PHOTO_SEQUENCE")
    @Column(name = "PHO_ID")
    private Long id;

    @Column(name = "PHO_MIME_TYPE")
    private String MimeType;

    @Column(name = "PHO_STATUS")
    private Boolean status;

    @Column(name = "PHO_FILE_NAME")
    private String FileName;

    @Lob
    @Basic(fetch=FetchType.EAGER) // this gets ignored anyway, but it is recommended for blobs
    @Column(name = "PHO_IMAGE_FILE")
    private  byte[]  imageFile;

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
        if (!(object instanceof Photo)) {
            return false;
        }
        Photo other = (Photo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.Photo[ id=" + id + " ]";
    }

    /**
     * @return the MimeType
     */
    public String getMimeType() {
        return MimeType;
    }

    /**
     * @param MimeType the MimeType to set
     */
    public void setMimeType(String MimeType) {
        this.MimeType = MimeType;
    }

    /**
     * @return the FileName
     */
    public String getFileName() {
        return FileName;
    }

    /**
     * @param FileName the FileName to set
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * @return the imageFile
     */
    public byte[] getImageFile() {
        return imageFile;
    }

    /**
     * @param imageFile the imageFile to set
     */
    public void setImageFile(byte[] imageFile) {
        this.imageFile = imageFile;
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
    
}
