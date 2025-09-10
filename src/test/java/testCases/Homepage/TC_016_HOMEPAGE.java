package testCases.Homepage;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        System.out.println(actualURLs);
	}
	
	@Test
	public void testFeaturedSectionElements_Images_Title() {
		homePage = new HomePage(driver);
		String actualTitlesString = homePage.getFeaturedImagesTitle();
		List<String> actualTitles = Arrays.asList(actualTitlesString.split(",\\s*"));
		List<String> expectedTitles = Arrays.asList(
				"MacBook",
				"iPhone",
				"Apple Cinema 30\"",
				"Canon EOS 5D"
				);
		Assert.assertEquals(actualTitles, expectedTitles);
		System.out.println(actualTitles);
	}
	
	@Test
	public void testFeaturedSectionElements_Images_Caption() {
		homePage = new HomePage(driver);
		String actualCaptionsString = homePage.getFeaturedImagesCaption();
		List<String> actualCaptions = Arrays.asList(actualCaptionsString.split(";\\s*"));
		List<String> expectedCaptions = Arrays.asList(
				"Intel Core 2 Duo processor Powered by an Intel Core 2 Duo processor at speeds up to 2.1..",
				"iPhone is a revolutionary new mobile phone that allows you to make a call by simply tapping a nam..", 
				"The 30-inch Apple Cinema HD Display delivers an amazing 2560 x 1600 pixel resolution. Designed sp..",
				"Canon's press material for the EOS 5D states that it 'defines (a) new D-SLR category', while we'r..");
		Assert.assertEquals(actualCaptions, expectedCaptions);
		System.out.println(actualCaptions);
	}
	
	@Test
	public void testFeaturedSectionElements_Images_Price() {
		homePage = new HomePage(driver);
		String actualPricesString = homePage.getFeaturedImagesPrice();
		actualPricesString = actualPricesString.replace("\n", " ").trim();
		List<String> actualPrices = Arrays.asList(actualPricesString.split(";\\s*"));
		List<String> actualPricesNew = new ArrayList<>();
		for(String actualPrice : actualPrices) {
			actualPricesNew.add(actualPrice.split(" ")[0]);
		}
		List<String> expectedPrices = Arrays.asList("$602.00", "$123.20", "$110.00", "$98.00");
		Assert.assertEquals(actualPricesNew, expectedPrices);
	}
	
	@Test
	public void testFeaturedSectionElements_Images_OldPrice() {
		homePage = new HomePage(driver);
		String actualOldPricesString = homePage.getFeaturedImagesOldPrice();
		List<String> actualOldPrices = Arrays.asList(actualOldPricesString.split(";\\s*"));
		List<String> expectedOldPrices = Arrays.asList("$122.00", "$122.00");
		Assert.assertEquals(actualOldPrices, expectedOldPrices);
	}
	
	@Test
	public void testFeaturedSectionElements_Images_TaxPrice() {
		homePage = new HomePage(driver);
		String actualTaxPriceString = homePage.getFeaturedImagesTaxPrice();
		List<String> actualTaxPrices = Arrays.asList(actualTaxPriceString.split(";\\s*"));
		List<String> actualTaxPriceNew = new ArrayList<>();
		for(String actualTaxPrice : actualTaxPrices) {
			actualTaxPriceNew.add(actualTaxPrice.replace("Tax:", "").split(" ")[1]);
		}
		List<String> expectedTaxPrice = Arrays.asList("$500.00", "$101.00", "$90.00", "$80.00");
		Assert.assertEquals(actualTaxPriceNew, expectedTaxPrice);
	}

}
