package com.mysite.core.models.impl;


import com.mysite.core.models.FeaturedPost;
import com.mysite.core.models.FeaturedPostData;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class , adapters = FeaturedPost.class)
public class FeaturedpostImpl implements FeaturedPost{


    @Inject
    List<FeaturedPostData> FeaturedPost;

    @Override
    public List<FeaturedPostData> getPost() {
        return FeaturedPost;
    }
}
