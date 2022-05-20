package com.rewardcentral.controller;

import com.rewardcentral.exceptions.UUIDException;
import com.rewardcentral.service.RewardCentralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RewardCentralController {

    @Autowired
    RewardCentralService rewardCentralService;

    /**
     *
     * @param attractionId get attraction UUID as a string
     * @param userId get user UUID as a string
     * @return int the rewardsPoints to the port 9000
     * @throws UUIDException if something went wrong parsing String id to UUID
     */
    @GetMapping("/getRewardPoint")
    public int getRewardPointFromService (@RequestParam String attractionId, @RequestParam String userId) throws UUIDException {
        UUID attractionUUID = null;
        UUID userUUID = null;
        try {
            attractionUUID= UUID.fromString(attractionId);
            userUUID=UUID.fromString(userId);

        } catch (IllegalArgumentException e) {
            throw new UUIDException(attractionId,userId);

        }
        return rewardCentralService.getRewardPointsRewardsCentral(attractionUUID, userUUID);
    }

}
