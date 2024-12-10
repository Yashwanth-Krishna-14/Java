package first.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Devil {

    @Autowired

    private laptop laptop ;
    public void build(){


        laptop.compile();
        System.out.println("working");


}
}
