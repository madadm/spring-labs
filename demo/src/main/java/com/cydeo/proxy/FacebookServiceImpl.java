package com.cydeo.proxy;

import com.cydeo.entity.Recipe;
import com.cydeo.proxy.ShareService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("facebook")
public class FacebookServiceImpl implements ShareService {
    @Override
    public void share(Recipe recipe) {
        System.out.println("Sharing recipe on Facebook"+recipe);
    }
}
