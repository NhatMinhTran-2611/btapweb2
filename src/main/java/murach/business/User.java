package murach.business;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String date;
    private String preference;
    private List<String> receiveAnnouncements; // Sử dụng List<String> thay cho String
    private String contactMethod;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        date = "";
        preference = "";
        receiveAnnouncements = null; // Khởi tạo danh sách rỗng nếu cần
        contactMethod = "";
    }

    public User(String firstName, String lastName, String email, String date,
                String preference, List<String> receiveAnnouncements, String contactMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.date = date;
        this.preference = preference;
        this.receiveAnnouncements = receiveAnnouncements;
        this.contactMethod = contactMethod;
    }

    // Getters and setters for all fields
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getPreference() { return preference; }
    public void setPreference(String preference) { this.preference = preference; }

    public List<String> getReceiveAnnouncements() { return receiveAnnouncements; }
    public void setReceiveAnnouncements(List<String> receiveAnnouncements) { this.receiveAnnouncements = receiveAnnouncements; }

    public String getContactMethod() { return contactMethod; }
    public void setContactMethod(String contactMethod) { this.contactMethod = contactMethod; }
}
