package org.example.bd;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "requests")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String contactPhone;

    @Column(nullable = false)
    private String serviceType;

    private String additionalInfo;

    @Column(nullable = false)
    private LocalDate preferredDate;

    @Column(nullable = false)
    private LocalTime preferredTime;

    @Column(nullable = false)
    private String paymentMethod;

    @Column(nullable = false)
    private String status;

    private String rejectionReason;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
}
