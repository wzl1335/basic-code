package cn.itcast.day05.demo4;

public class Body {
    public void mes(){
        System.out.println("外部类方法");
    }
    public class Heart{
        public void me(){
            System.out.println("  这是一个内部类");
        }
    }
}
