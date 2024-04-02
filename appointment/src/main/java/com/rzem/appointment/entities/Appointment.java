package com.rzem.appointment.entities;


import com.rzem.appointment.enums.AppointmentType;
import com.rzem.appointment.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "appointments")
public class Appointment {

    @Id
    private String id;
    private String description;
    private Date start;
    private Status status;
    private Boolean reminder;
    private AppointmentType appointmentType;
    private User student;
    private User professor;
    private Location location;
    private int priority;
    private List<Feedback> feedbackList;
    private List<Notification> notificationList;
}
