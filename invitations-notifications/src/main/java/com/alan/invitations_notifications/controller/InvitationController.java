package com.alan.invitations_notifications.controller;

import com.alan.invitations_notifications.entity.Invitation;
import com.alan.invitations_notifications.entity.InvitationStatus;
import com.alan.invitations_notifications.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invitations")
public class InvitationController {

    @Autowired
    private InvitationService invitationService;

    @PostMapping
    public Invitation createInvitation(@RequestBody Invitation invitation) {
        return invitationService.createInvitation(invitation);
    }

    @GetMapping("/receiver/{receiverId}")
    public List<Invitation> getInvitationsByReceiverId(@PathVariable Long receiverId) {
        return invitationService.getInvitationsByReceiverId(receiverId);
    }

    @GetMapping("/pending")
    public List<Invitation> getPendingInvitations() {
        return invitationService.getPendingInvitations();
    }

    @PutMapping("/{invitationId}/respond")
    public void respondToInvitation(@PathVariable Long invitationId, @RequestParam InvitationStatus status) {
        invitationService.respondToInvitation(invitationId, status);
    }
}