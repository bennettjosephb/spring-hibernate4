/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "PROJECT_DOCUMENT")
@SequenceGenerator(name="DOCUMENT_SEQUENCE",
                   sequenceName="DOCUMENT_SEQUENCE")
public class Document implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="DOCUMENT_SEQUENCE")
    @Column(name = "DOC_ID")
    private Long id;
    
    @Column(name = "DOC_FILE_TYPE", nullable=false)
    @Enumerated(EnumType.STRING)
    private FileType fileType;
    
    @Column(name = "DOC_TITLE")
    private String title;
    
    @Column(name = "DOC_MIME_TYPE")
    private String mimeType;
    
    @Column(name = "DOC_VISIBLE_STATUS")
    private Boolean visibleStatus; 
    
    @Column(name = "DOC_FILE")
    @Lob
    @Basic(fetch=FetchType.EAGER) // this gets ignored anyway, but it is recommended for blobs
    private byte[] file;
    
    @Column(name = "DOC_FILE_NAME")
    private String fileName;

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
        if (!(object instanceof Document)) {
            return false;
        }
        Document other = (Document) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.Resume[ id=" + id + " ]";
    }

    /**
     * @return the fileType
     */
    public FileType getFileType() {
        return fileType;
    }

    /**
     * @param fileType the fileType to set
     */
    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the mimeType
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * @param mimeType the mimeType to set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * @return the visibleStatus
     */
    public Boolean getVisibleStatus() {
        return visibleStatus;
    }

    /**
     * @param visibleStatus the visibleStatus to set
     */
    public void setVisibleStatus(Boolean visibleStatus) {
        this.visibleStatus = visibleStatus;
    }

    /**
     * @return the file
     */
    public byte[] getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(byte[] file) {
        this.file = file;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}
