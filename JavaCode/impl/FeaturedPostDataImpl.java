package com.mysite.core.models.impl;

import com.mysite.core.models.FeaturedPostData;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class , adapters = FeaturedPostData.class)
public class FeaturedPostDataImpl implements FeaturedPostData {


    @Inject
    String postTitle;

    @Inject
    String postDesc;

    @Inject
    String postTech;

    @Inject
    String postLink;

    @Inject
    String postDate;




    @Override
    public String getTech() {
        return postTech;
    }

    @Override
    public String getTitle() {
        return postTitle;
    }

    @Override
    public String getDesc() {
        return postDesc;
    }

    @Override
    public String getDate() {
        return postDate;
    }

    @Override
    public String getLink() {
        return postLink;
    }
}
