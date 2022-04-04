package com.mysite.core.models.impl;


import com.mysite.core.models.ListOfBlogs;
import com.mysite.core.models.ListOfBlogsDate;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class , adapters = ListOfBlogs.class)
public class ListOfBlogImpl implements ListOfBlogs{

    @Inject
    List<ListOfBlogsDate> blogs;

    @Override
    public List<ListOfBlogsDate> getBlogs() {
        return blogs;
    }
}
