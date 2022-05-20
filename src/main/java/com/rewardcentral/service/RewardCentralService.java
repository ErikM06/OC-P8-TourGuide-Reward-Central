package com.rewardcentral.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;

import java.util.UUID;

@Service
public class RewardCentralService {
    private Logger logger = LoggerFactory.getLogger(RewardCentralService.class);
    private RewardCentral rewardCentral = new RewardCentral();

    /**
     * @param attractionId the attraction's UUID
     * @param userId the user's UUID
     * @return a random int representing the reward points
     */
    public Integer getRewardPointsRewardsCentral(UUID attractionId, UUID userId) {
        logger.debug("getRewardPointsRewardsCentral");
        return rewardCentral.getAttractionRewardPoints(attractionId, userId);
    }
}
