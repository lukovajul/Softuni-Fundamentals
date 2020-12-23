package bg.softuni.fundamentals;

import java.util.*;

public class ObjectsClassesArticles02 {

    static class Article{
       private String  title;
       private String content;
       private String author;

        public Article(String title, String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", title, content, author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            String[] data = scanner.nextLine().split(", ");
            articles.add(new Article(data[0], data[1], data[2]));
           // String title = data[0];
           // String content = data[1];
           // String author = data[2];
           // Article article = new Article(title, content, author);
           // articles.add(article);
        }
            String command = scanner.nextLine();
            switch (command){
                case "title":
                    articles.sort(Comparator.comparing(Article::getTitle));
                    break;
                case "content":
                    articles.sort(Comparator.comparing(Article::getContent));
                    break;
                case "author":
                    articles.sort(Comparator.comparing(Article::getAuthor));
                    break;
            }

        for (Article article : articles) {
            System.out.println(article.toString());
        }

    }
    }

