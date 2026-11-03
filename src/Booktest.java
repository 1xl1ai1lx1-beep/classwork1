/*

public class Booktest {
    public static void main(String[] args) {
        // 创建5个图书的对象数组
        Book[] books = {
                new Book("1", "Java编程思想", "计算机科学", "2020-10-01"),
                new Book("2", "操作系统原理", "计算机科学", "1998-06-15"),
                new Book("3", "数据结构与算法", "计算机科学", "2015-03-20"),
                new Book("4", "人工智能导论", "人工智能", "2010-11-11"),
                new Book("5", "网络编程", "计算机科学", "2005-07-30")
        };

        // 遍历数组，打印图书信息
        System.out.println("图书信息：");
        for (Book b : books) {
            System.out.println(b.getBookInfo());
        }

        // 统计晚于2000年出版的图书的数量
        int countLaterThan2000 = 0;
        for (Book book : books) {
            if (book.isLater()) {
                countLaterThan2000++;
            }
        }

        // 打印统计结果
        System.out.println("晚于2000年出版的图书的数量: " + countLaterThan2000);
    }
}
*/
