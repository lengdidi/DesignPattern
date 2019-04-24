package memento;

/**
 * 备忘录模式
 */
public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("A", "AA", "AAA");

        ArticleMemento articleMemento = article.saveToMemento();

        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题：" + article.getTitle() + "内容：" + article.getContent() + "图片：" + article.getImgs() + "，暂存成功");

        System.out.println("手记完整信息：" + article);

        System.out.println("修改手记Start");

        article.setTitle("B");
        article.setContent("BB");
        article.setImgs("BBB");

        System.out.println("修改手记End");

        System.out.println("手记完整信息：" + article);

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("C");
        article.setContent("CC");
        article.setImgs("CCC");

        System.out.println("暂存回退Start");

        System.out.println("回退出栈1次");

        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退End");
        System.out.println("手记完整信息：" + article);

    }
}
