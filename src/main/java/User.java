import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private String id;
    private String name;
    private String email;
    private String mobileNumber;
    private String password;

    private String ownerName;
    private String ownerMobileNumber;
    private String ownerEmail;
    private String ownerNID;

    //vendor's rating by consumers
    private double rating;

    //User Profile Picture
    private String image;

    //user address
    private double[] geoLocation;
    private String address;

    //user ip and date info
    private String registrationIp;
    //@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    /*@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)*/
    private String registrationDate;
    private String loginIp;
    private String lastLoginIp;

    //By defaults users are inactive
    private boolean active = false;
    //for branch request
    private boolean requested = false;
    private boolean vendorRequest = false;

    //Reference vendor for branch
    private User referenceVendor;
    private String vendorRegistrationCertificate;
    private String vendorVatCertificate;
    private String tradeLicense;
    private String drugLicense;
    private String registrationNumber;

    //User roles
    private List<Role> roles = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerMobileNumber() {
        return ownerMobileNumber;
    }

    public void setOwnerMobileNumber(String ownerMobileNumber) {
        this.ownerMobileNumber = ownerMobileNumber;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerNID() {
        return ownerNID;
    }

    public void setOwnerNID(String ownerNID) {
        this.ownerNID = ownerNID;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double[] getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(double[] geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegistrationIp() {
        return registrationIp;
    }

    public void setRegistrationIp(String registrationIp) {
        this.registrationIp = registrationIp;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isRequested() {
        return requested;
    }

    public void setRequested(boolean requested) {
        this.requested = requested;
    }

    public boolean isVendorRequest() {
        return vendorRequest;
    }

    public void setVendorRequest(boolean vendorRequest) {
        this.vendorRequest = vendorRequest;
    }

    public User getReferenceVendor() {
        return referenceVendor;
    }

    public void setReferenceVendor(User referenceVendor) {
        this.referenceVendor = referenceVendor;
    }

    public String getVendorRegistrationCertificate() {
        return vendorRegistrationCertificate;
    }

    public void setVendorRegistrationCertificate(String vendorRegistrationCertificate) {
        this.vendorRegistrationCertificate = vendorRegistrationCertificate;
    }

    public String getVendorVatCertificate() {
        return vendorVatCertificate;
    }

    public void setVendorVatCertificate(String vendorVatCertificate) {
        this.vendorVatCertificate = vendorVatCertificate;
    }

    public String getTradeLicense() {
        return tradeLicense;
    }

    public void setTradeLicense(String tradeLicense) {
        this.tradeLicense = tradeLicense;
    }

    public String getDrugLicense() {
        return drugLicense;
    }

    public void setDrugLicense(String drugLicense) {
        this.drugLicense = drugLicense;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", password='" + password + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerMobileNumber='" + ownerMobileNumber + '\'' +
                ", ownerEmail='" + ownerEmail + '\'' +
                ", ownerNID='" + ownerNID + '\'' +
                ", rating=" + rating +
                ", image='" + image + '\'' +
                ", geoLocation=" + Arrays.toString(geoLocation) +
                ", address='" + address + '\'' +
                ", registrationIp='" + registrationIp + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", active=" + active +
                ", requested=" + requested +
                ", vendorRequest=" + vendorRequest +
                ", referenceVendor=" + referenceVendor +
                ", vendorRegistrationCertificate='" + vendorRegistrationCertificate + '\'' +
                ", vendorVatCertificate='" + vendorVatCertificate + '\'' +
                ", tradeLicense='" + tradeLicense + '\'' +
                ", drugLicense='" + drugLicense + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", roles=" + roles +
                '}';
    }
}
