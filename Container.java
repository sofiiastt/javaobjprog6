package homework6;
public class Container<x> {
    private x item;
    public Container(x item) {
    }
 public void setItem(x item) {
        this.item = item;
    }
     public void printType() {
         System.out.println("type" + item.getClass().getName());
    }
     }
