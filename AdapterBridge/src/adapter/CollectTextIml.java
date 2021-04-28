package adapter;

import adapter.CollectText;

public class CollectTextIml implements CollectText {
    @Override
    public String collect(String s) {
        return "我是文本收集方式";
    }
}
