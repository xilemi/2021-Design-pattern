public class Txt extends File{
    public Txt(String name) {
        this.name = name;
    }
    @Override
    public void showSelf(int i) {
        super.showSelf(i);
        System.out.println("文本文件:" + name);
    }
}
