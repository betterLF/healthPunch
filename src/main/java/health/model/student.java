package health.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class student {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date uploadDate;

    private String studentName;

    private String classId;

    private String telephone;

    private String temperature;

    private Boolean fever;

    private String feverDetail;

    private Boolean contact;

    private String contactDetail;

    private Boolean situation;

    private String situationDetail;

    public student(Date uploadDate, String studentName, String classId, String telephone, String temperature, Boolean fever, String feverDetail, Boolean contact, String contactDetail, Boolean situation, String situationDetail) {
        this.uploadDate = uploadDate;
        this.studentName = studentName;
        this.classId = classId;
        this.telephone = telephone;
        this.temperature = temperature;
        this.fever = fever;
        this.feverDetail = feverDetail;
        this.contact = contact;
        this.contactDetail = contactDetail;
        this.situation = situation;
        this.situationDetail = situationDetail;
    }

    public student() {
        super();
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public Boolean getFever() {
        return fever;
    }

    public void setFever(Boolean fever) {
        this.fever = fever;
    }

    public String getFeverDetail() {
        return feverDetail;
    }

    public void setFeverDetail(String feverDetail) {
        this.feverDetail = feverDetail == null ? null : feverDetail.trim();
    }

    public Boolean getContact() {
        return contact;
    }

    public void setContact(Boolean contact) {
        this.contact = contact;
    }

    public String getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(String contactDetail) {
        this.contactDetail = contactDetail == null ? null : contactDetail.trim();
    }

    public Boolean getSituation() {
        return situation;
    }

    public void setSituation(Boolean situation) {
        this.situation= situation;
    }

    public String getConditionDetail() {
        return situationDetail;
    }

    public void setConditionDetail(String situationDetail) {
        this.situationDetail = situationDetail == null ? null : situationDetail.trim();
    }

    @Override
    public String toString() {
        return "student{" +
                "uploadDate=" + uploadDate +
                ", studentName='" + studentName + '\'' +
                ", classId='" + classId + '\'' +
                ", telephone='" + telephone + '\'' +
                ", temperature='" + temperature + '\'' +
                ", fever=" + fever +
                ", feverDetail='" + feverDetail + '\'' +
                ", contact=" + contact +
                ", contactDetail='" + contactDetail + '\'' +
                ", situation=" + situation +
                ", situationDetail='" + situationDetail + '\'' +
                '}';
    }
}