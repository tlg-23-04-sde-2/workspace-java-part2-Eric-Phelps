/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.Collection;

class InMemoryCatalogTestMain
{

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args)
    {
        //Done: testFindById();
        testFindByKeyword();
        //Done: testFindByCategory();
        //Done: testSize();
        //testGetAll();
    }

    private static void testFindById()//new test done
    {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.findById(6L));
        System.out.println(catalog.findById(19L));
    }

    private static void testFindByKeyword()
    {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection < MusicItem> items = catalog.findByKeyword("after");
        System.out.println(items);
    }

    private static void testFindByCategory()//new test done
    {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);
        dump(items);
    }

    private static void testSize()// new test done
    {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.size());

    }

    private static void testGetAll()
    {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> items = catalog.getAll();
        dump(items);
    }

    //helper method to dump a Collection vertically
    private static void dump(Collection<MusicItem> items)
    {
        for (MusicItem item : items)
        {
            System.out.println(item);
        }
    }
}