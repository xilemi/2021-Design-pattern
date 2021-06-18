import java.util.List;

public abstract class File {
    protected String name;

    public void showSelf(int i) {
        // 根据递归深度调整输出格式
        while (i > 0) {
            System.out.print("  ");
            i--;
        }
    }

    public void add(File f) {
        System.out.println("该文件不支持添加节点操作");
    }

    public void remove(File f) {
        System.out.println("该文件不支持移除节点操作");
    }

    public List<File> getChild() {
        System.out.println("该节点不支持获取子节点操作");
        return null;
    }
}
