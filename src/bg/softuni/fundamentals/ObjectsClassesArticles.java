package bg.softuni.fundamentals;

import java.util.Scanner;

public class ObjectsClassesArticles {

    static class Article{
       private String  title;
       private String content;
       private String author;

        public Article(String title, String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void edit(String newContent){
            this.content = newContent;
        }
        public void changeAuthor (String newAuthor){
            this.author = newAuthor;
        }
        public void rename (String newTitle){
            this.title = newTitle;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",
                    this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] articleData = scanner.nextLine().split(", ");
        String initialTitle = articleData[0];
        String initialContent = articleData[1];
        String initialAuthor = articleData[2];

        Article article = new Article(initialTitle, initialContent, initialAuthor);

        int n= Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<n; i++){
            String [] tokens = scanner.nextLine().split(": ");
            String command = tokens[0];
            String data = tokens[1];
            switch (command){
                case "Edit":
                    article.edit(data);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(data);
                    break;
                case "Rename":
                    article.rename(data);
                    break;

            }
        }

        System.out.println(article);

    }
}
