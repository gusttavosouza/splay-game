package com.splay.Models;

import java.util.Date;
import java.util.UUID;

public class Activity {
    private UUID id;
    private UUID creatorUserId;
    private Group group;
    private CurricularUnit curricularUnit;
    private String title;
    private String description;
    private Date createdAt;
    private Date updatedAt;
    private Date deliveryDate;
}
