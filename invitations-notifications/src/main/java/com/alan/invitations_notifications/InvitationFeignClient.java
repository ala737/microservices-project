package com.alan.invitations_notifications;

import com.alan.invitations_notifications.entity.Invitation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "invitation-notification-service")
public interface InvitationFeignClient {

    @GetMapping("/invitations/receiver/{receiverId}")
    List<Invitation> getInvitationsByReceiverId(@PathVariable("receiverId") Long receiverId);
}