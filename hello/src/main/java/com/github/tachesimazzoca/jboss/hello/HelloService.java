package com.github.tachesimazzoca.jboss.hello;

import javax.inject.Inject;

public class HelloService {
    @Inject
    private HelloDao helloDao;

    public String getMessage() {
       return helloDao.findMessage();
    }
}
