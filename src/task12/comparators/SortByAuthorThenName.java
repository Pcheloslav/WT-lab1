package task12.comparators;

import task12.Book;

import java.util.Comparator;

public class SortByAuthorThenName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        var authorCompare = o1.getAuthor().compareTo(o2.getAuthor());
        if (authorCompare == 0) {
            var titleCompare = o1.getTitle().compareTo(o2.getTitle());
            if (titleCompare == 0) {
                return o1.getPrice() - o2.getPrice();
            } else {
                return titleCompare;
            }
        } else {
            return authorCompare;
        }
    }
}
