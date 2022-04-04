package com.mysite.core.models.impl;

import com.mysite.core.models.ListOfBlogsDate;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;

@Model(adaptables = Resource.class , adapters = ListOfBlogsDate.class)
public class LIstOfBlogDataImpl implements ListOfBlogsDate{

    @Inject
    @Default(values = "FEatured Post")
    String blogTitle;

    @Inject
    String blogDesc;

    @Inject
    String blogLink;

    @Inject
    String blogDate;


    @Override
    public String getTitle() {
        return blogTitle;
    }

    @Override
    public String getLink() {
        return blogLink;
    }

    @Override
    public String getDate() {
        return blogDate;
    }

    @Override
    public String getDesc() {
        return blogDesc;
    }

}
