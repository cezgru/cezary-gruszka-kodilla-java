package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("My Library");
        Book book1 = new Book("T1", "A1", LocalDate.of(1993, 12, 1));
        Book book2 = new Book("T2", "A2", LocalDate.of(1995, 10, 12));
        Book book3 = new Book("T3", "A3", LocalDate.of(1997, 8, 23));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //Shallow copy
        Library libraryShallowCopy = null;
        try {
            libraryShallowCopy = library.shallowCopy();
            libraryShallowCopy.setName("My Library Shallow Copy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //Deep copy
        Library libraryDeepCopy = null;
        try {
            libraryDeepCopy = library.deepCopy();
            libraryDeepCopy.setName("My Library Deep Copy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(libraryShallowCopy);
        System.out.println(libraryDeepCopy);
        //When
        library.getBooks().remove(book3);
        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, libraryShallowCopy.getBooks().size());
        Assert.assertEquals(3, libraryDeepCopy.getBooks().size());
    }
}
