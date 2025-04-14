package com.alan.invitations_notifications.repository;


import com.alan.invitations_notifications.entity.Invitation;
import com.alan.invitations_notifications.entity.InvitationStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InvitationRepository extends MongoRepository<Invitation, Long> {
    List<Invitation> findByReceiverId(Long receiverId); // Fetch invitations for a user
    List<Invitation> findByStatus(InvitationStatus status); // Fetch invitations by status
}