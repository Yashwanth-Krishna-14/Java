package first.com;

import org.springframework.stereotype.Component;

@Component
public class laptop implements computer {

    public void compile(){

        System.out.println("compiling with 404 bugs");
    }
}
//                   +----------------------------------------------------------------------+
// for connecting :  |class     -> class (or)  interface -> interface = 'extends' keyword    |
//                   |-----------------------------------------------------------------------|
//                   |interface -> class (or)  class     -> interface = 'implements' keyword |
//                   +-----------------------------------------------------------------------+