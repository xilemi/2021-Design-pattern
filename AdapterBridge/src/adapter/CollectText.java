package adapter;
/*系统原来的手机方法接口，如果需要兼容第三方接口就需要写一个适配器，使用原来收集方与第三方的手机方式都兼容本系统*/
public interface CollectText {
    String collect(String s);
}
