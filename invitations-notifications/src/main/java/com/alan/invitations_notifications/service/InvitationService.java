package com.alan.invitations_notifications.service;

import com.alan.invitations_notifications.entity.Invitation;
import com.alan.invitations_notifications.entity.InvitationStatus;
import com.alan.invitations_notifications.repository.InvitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitationService {

    @Autowired
    private InvitationRepository invitationRepository;

    public Invitation createInvitation(Invitation invitation) {
        return invitationRepository.save(invitation);
    }

    public List<Invitation> getInvitationsByReceiverId(Long receiverId) {
        return invitationRepository.findByReceiverId(receiverId);
    }

    public List<Invitation> getPendingInvitations() {
        return invitationRepository.findByStatus(InvitationStatus.PENDING);
    }

    public void respondToInvitation(Long invitationId, InvitationStatus status) {
        Invitation invitation = invitationRepository.findById(invitationId).orElseThrow();
        invitation.setStatus(status);
        invitationRepository.save(invitation);
    }
}