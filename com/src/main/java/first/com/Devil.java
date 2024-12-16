package first.com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Devil {
    @Autowired  // ** automatically connects devil.java and laptop.java , since devil.java is dependent on laptop.java

    @Qualifier("desktop")  // instead of using @primary in the bean , we can mention the instance(bean name)

    private computer comp;

  /*  public void dev(laptop laptop){
        
        this.laptop = laptop;
    }*/
    public void build(){
        comp.compile();

        System.out.println("working perfectly"); // it prints o/p





}
}
