package first.com;

import org.springframework.stereotype.Component;

@Component
public class laptop implements computer {

    public void compile(){

        System.out.println("compiling with 404 bugs");
    }
}
