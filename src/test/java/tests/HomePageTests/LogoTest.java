package tests.HomePageTests;

import org.junit.jupiter.api.Test;
import pages.HomePage.HomePageAct;

import pages.components.header.SearchBar;
import tests.BaseTest;

public class LogoTest extends BaseTest {
    @Test
    public void testingTest() {
        HomePageAct homePageAct = new HomePageAct(driver);
        SearchBar searchBar = homePageAct.getSearchBar();
        searchBar.switchCategory("MP3");
        searchBar.searchFor("MP3333333");
    }
}
