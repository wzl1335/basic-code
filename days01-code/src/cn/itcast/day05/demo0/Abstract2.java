package cn.itcast.day05.demo0;
//定义抽象方法
public interface Abstract2 {
    public static final int NUM = 1; //接口中定义常量 不可改变 接口.变量名字直接调用 名字大写（NUM）
    public abstract void aa();
    abstract void bb();
    public void cc();
    void dd();
    //
    public  static  void ff(){
        System.out.println("接口静态方法");
    }
    //默认方法加 default 、、也可以被覆盖重写
    public default void ee(){
        System.out.println("这是一个默认方法");
    }

}
