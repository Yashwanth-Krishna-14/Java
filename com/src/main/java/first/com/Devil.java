package first.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Devil {



    //@Autowired  // field injection

    private laptop laptop ;
    

    public dev(laptop laptop){

        this.laptop = laptop;

    }
    public void build(){


        laptop.compile();
        System.out.println("working perfectly");



}
}
