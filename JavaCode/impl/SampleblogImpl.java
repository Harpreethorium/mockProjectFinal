package com.mysite.core.models.impl;


import com.mysite.core.models.SampleBlog;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;


@Model(adaptables = Resource.class , adapters = SampleBlog.class)

public class SampleblogImpl implements SampleBlog {



    @Inject
    String HeadingContent;

    @Inject
    String SubHeading1;

    @Inject
    String SubHeadingContent;

    @Inject
    String SubHeading2;

    @Inject
    String SubHeadingContent2;

    @Inject
    String HeadingMain;



    @Override
    public String getHeading() {
        return null;
    }

    @Override
    public String getHeadingContent() {
        return HeadingContent;
    }

    @Override
    public String getSubHeadingContent() {
        return SubHeadingContent;
    }

    @Override
    public String getSubHeadingContent2() {
        return SubHeadingContent2;
    }


    @Override
    public String getsubHeading() {
        return SubHeading1;
    }

    @Override
    public String getsubHeading2() {
        return SubHeading2;
    }
    @Override
    public String getMainHeading(){
        return HeadingMain;
    }
}
