package task12.comparators;

import task12.Book;

import java.util.Comparator;

public class SortByAuthorThenNamePrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        var authorCompare = o1.getAuthor().compareTo(o2.getAuthor());
        return authorCompare != 0 ? authorCompare : o1.getTitle().compareTo(o2.getTitle());
    }
}
