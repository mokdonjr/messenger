package com.example.mymessenger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerBaseBean extends StaticBaseBean {
    protected Logger logger = LoggerFactory.getLogger(getClass());
}
