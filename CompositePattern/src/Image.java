public class Image extends File{
    public Image(String name) {
        this.name = name;
    }
    @Override
    public void showSelf(int i) {
        super.showSelf(i);
        System.out.println("图片文件:" + name);
    }
}
