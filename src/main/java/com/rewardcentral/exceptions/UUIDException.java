package com.rewardcentral.exceptions;

import java.util.UUID;

public class UUIDException extends Exception{

    public UUIDException (String attractionUUID, String userUUID){
        super("Can't parse UUID: "+attractionUUID+" and: "+userUUID);
    }
}
