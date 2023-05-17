package com.javatunes.catalog;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    //fixtures
    private InMemoryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void findByKeyword_shouldReturn() {
    }

    @Test
    public void testSize() {
        assertEquals(18, catalog.size());
    }

    @Test
    public void findByCategory_shouldReturnNull_whenCategoryNotFound() {
        Collection<MusicItem> results = catalog.findByCategory(MusicCategory.JAZZ);
        for (MusicItem item: results){
            assertNull(item.getMusicCategory());
        }
    }

    @Test
    public void findByCategory_shouldReturnPopulatedCollection_whenCategoryFound() {
        Collection<MusicItem > popItems = catalog.findByCategory(MusicCategory.POP);
        //should be 4
        for (MusicItem item: popItems){
            assertEquals(MusicCategory.POP, item.getMusicCategory());
        }
    }

    @Test
    public void findById_shouldReturnNull_whenIdNotFound() {
        MusicItem item = catalog.findById(19L);
        assertNull(item);
    }

    @Test
    public void findById_shouldReturnMusicItemWithId_whenIdFound() {
        MusicItem item = catalog.findById(6L);
        assertEquals(6L, item.getId().longValue());
    }
}