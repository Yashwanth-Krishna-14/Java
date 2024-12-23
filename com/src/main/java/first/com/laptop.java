package first.com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

    @Component

    @Primary
//primary annotation is used when a class is fetching data from 2 or more classes, which leads to priority issue
// In devil.java , the build() calls a method compile() which is present in both laptop and desktop , @primary is used in these scenario to give precedence
// the class required a single bean but 2 were found


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