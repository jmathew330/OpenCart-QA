package testCases;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import testBase.BaseClass;

public class TC_016_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testFeaturedSectionElementsVisibility_Images() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isFeaturedImagesDisplayed());
	}
	
	@Test
	public void testFeaturedSectionElements_Images_URL() {
		homePage = new HomePage(driver);
        String actualURLsString = homePage.getFeaturedImagesURL();
        List<String> actualURLs = Arrays.asList(actualURLsString.split(",\\s*"));
        List<String> expectedURLs = Arrays.asList(
            "https://tutorialsninja.com/demo/image/cache/catalog/demo/macbook_1-200x200.jpg",
            "https://tutorialsninja.com/demo/image/cache/catalog/demo/iphone_1-200x200.jpg",
            "https://tutorialsninja.com/demo/image/cache/catalog/demo/apple_cinema_30-200x200.jpg",
            "https://tutorialsninja.com/demo/image/cache/catalog/demo/canon_eos_5d_1-200x200.jpg"
        );
        
        Assert.assertEquals(actualURLs, expectedURLs, "Featured image URLs do not match.");
	}
	
	@Test
	public void testFeaturedSectionElements_Images_Title() {
		homePage = new HomePage(driver);
		System.out.println(homePage.getFeaturedImagesTitle());
		String actualTitlesString = homePage.getFeaturedImagesTitle();
		List<String> actualTitles = Arrays.asList(actualTitlesString.split(",\\s*"));
		List<String> expectedTitles = Arrays.asList(
				"MacBook",
				"iPhone",
				"Apple Cinema 30\"",
				"Canon EOS 5D"
				);
		Assert.assertEquals(actualTitles, expectedTitles);
	}

}
