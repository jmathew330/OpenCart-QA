# OpenCart QA

**OpenCart QA** is an automated test suite designed to validate the core functionality and user interface of the [OpenCart](https://www.opencart.com) platform. Built using **Java**, **Selenium WebDriver**, and **TestNG**, this project follows the **Page Object Model (POM)** design pattern for scalable and maintainable test automation.

---

## 🧩 Project Overview

This repository provides a robust test framework to ensure the quality of the OpenCart web application. The focus is currently on validating the **UI components**, particularly the **home page header**, with future expansion into functional workflows and other key areas.

### Highlights

- ✅ Automated browser-based UI testing with Selenium  
- 📘 Scalable architecture using Page Object Model (POM)  
- 🧪 Test management with TestNG

---

## ✅ Current Test Coverage

### UI Tests – Home Page Header & Elements

| Test Case ID      | Description                                                                                          | Expected Outcome                                                      | Preconditions                              |
|-------------------|----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|-------------------------------------------|
| **TC_001_HOMEPAGE** | Verify the home page loads successfully with the correct URL and page title displayed.              | Ensure the page loads successfully with the correct URL and page title displayed. | User has stable internet connection        |
| **TC_002_HOMEPAGE** | Verify the home page logo is present and displays the expected text.                                | Ensure the logo is present upon page load and displays the correct text. | User is on homepage                        |
| **TC_003_HOMEPAGE** | Verify the 'Currency' dropdown and its options are present in the header and display the expected text. | Ensure the 'Currency' dropdown and its options are displayed with the correct text. | User is on homepage                        |
| **TC_004_HOMEPAGE** | Verify the phone icon and phone number are present in the header, with the phone number displaying the expected text. | Ensure the phone icon and phone number label are displayed, with the phone number label showing the correct text. | User is on homepage                        |
| **TC_005_HOMEPAGE** | Verify the 'My Account' dropdown and its options are present in the header and display the expected text. | Ensure the 'My Account' dropdown and its options are displayed with the correct text. | User is on homepage                        |
| **TC_006_HOMEPAGE** | Verify the wish list icon and wish list text are present in the header and display the expected text. | Ensure the wish list icon and wish list label are displayed, with the wish list label showing the correct text. | User is on homepage                        |
| **TC_007_HOMEPAGE** | Verify the shopping cart icon and shopping cart label are present in the header and display the expected text. | Ensure the shopping cart icon and shopping cart label are displayed, with the shopping cart label showing the correct text. | User is on homepage                        |
| **TC_008_HOMEPAGE** | Verify the checkout icon and checkout label are present in the header, with the checkout label displaying the expected text. | Ensure the checkout icon and checkout label are displayed, with the checkout label showing the correct text. | User is on homepage                        |
| **TC_009_HOMEPAGE** | Verify the search box and search button are present in the header.                                   | Ensure both the search box and search button ("search bar") are displayed in the header. | User is on homepage                        |
| **TC_010_HOMEPAGE** | Verify the search box displays the expected placeholder text.                                        | Ensure the search box has the correct placeholder text.              | User is on homepage                        |
| **TC_011_HOMEPAGE** | Verify the shopping cart button label displays the expected text when no items are added to the cart. | Ensure the shopping cart button label is displayed, showing the correct text when no items are added to the cart. | User is on homepage; User has no items added to their cart |
| **TC_012_HOMEPAGE** | Verify the navigation menu links display the expected text.                                         | Ensure the navigation menu links are displayed with the correct text. | User is on homepage                        |
| **TC_013_HOMEPAGE** | Verify the 'Desktop', 'Laptops & Notebooks', 'Components', and 'MP3 Players' dropdown menu navigation links display the expected text. | Ensure the 'Desktop', 'Laptops & Notebooks', 'Components', and 'MP3 Players' dropdown menu navigation links are displayed with the correct text. | User is on homepage                        |
| **TC_014_HOMEPAGE** | Verify the iPhone and Macbook Air pictures display in the image gallery slideshow.                   | Ensure the iPhone and Macbook Air images are displayed in the image gallery slideshow. | User is on homepage                        |
| **TC_015_HOMEPAGE** | Verify the 'Featured' heading displays with the expected text.                                      | Ensure the 'Featured' heading displays with the correct text.        | User is on homepage                        |
| **TC_016_HOMEPAGE** | Verify the 'Featured' section images display with expected URL, title, caption, price, old price, and tax price. | Ensure the 'Featured' section images display with the correct URL, title, caption, price, old price, and tax price. | User is on homepage                        |
| **TC_017_HOMEPAGE** | Verify the 'Featured' section 'Add to Cart', 'Add to Wishlist', and 'Compare this Product' buttons display for each featured product. | Ensure the 'Featured' section 'Add to Cart', 'Add to Wishlist', and 'Compare this Product' buttons display for each featured product. | User is on homepage                        |
| **TC_019_HOMEPAGE** | Verify Footer headings display with the expected text.                                              | Ensure that each heading displays with the correct text.             | User is on homepage                        |
| **TC_020_HOMEPAGE** | Verify Footer hyperlinks display with the expected text.                                           | Ensure that each hyperlink displays with the correct text.           | User is on homepage                        |

### Navigation Menu Links Redirection on Home Page

| Test Case ID      | Description                                                                                          | Expected Outcome                                                      | Preconditions                              |
|-------------------|----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|-------------------------------------------|
| **TC_021_HOMEPAGE** | Verify 'PC', 'Mac', and 'Show All Desktops' links redirect correctly from 'Desktops' dropdown menu. | Ensure that clicking the 'PC', 'Mac', or 'Show All Desktops' links from the 'Desktops' dropdown menu redirect to the appropriate page. | User is on homepage                        |
| **TC_022_HOMEPAGE** | Verify 'Macs', 'Windows', and 'Show All Laptops & Notebooks' links redirect correctly from 'Laptops & Notebooks' dropdown menu. | Ensure that clicking the 'Macs', 'Windows', or 'Show All Laptops & Notebooks' links from the 'Laptops & Notebooks' dropdown menu redirect to the appropriate page. | User is on homepage                        |
| **TC_023_HOMEPAGE** | Verify 'Mice and Trackballs', 'Monitors', 'Printers', 'Scanners', 'Web Cameras', and 'Show All Components' links redirect correctly from 'Components' dropdown menu. | Ensure that clicking these links from the 'Components' dropdown menu redirect to the appropriate page. | User is on homepage                        |

---

### Register Page Tests

| Test Case ID      | Description                                                                                          | Expected Outcome                                                      |
|-------------------|----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|
| **TC_001_REGISTER** | Verify the Register page loads successfully with the correct URL and page title displayed.         | Ensure the page loads successfully with the correct URL and page title displayed. |
| **TC_002_REGISTER** | Verify the Register page's heading displays with appropriate text.                                 | Ensure the Register page's heading displays with the correct text.    |
| **TC_003_REGISTER** | Verify the Register page's form functionality when no data is entered and the user does not agree to the Privacy Policy. | Ensure the form is functional and handles the scenario correctly.     |
| **TC_004_REGISTER** | Verify the Register page's form functionality when no data is entered and the user agrees to the Privacy Policy. | Ensure the form is functional and handles the scenario correctly.     |
| **TC_005_REGISTER** | Verify the Register page's form functionality when no data is entered and the user does not agree to the Privacy Policy and subscription is selected 'Yes'. | Ensure the form is functional and handles the scenario correctly.     |
| **TC_006_REGISTER** | Verify the Register page's form functionality when no data is entered and the user agrees to the Privacy Policy and subscription is selected 'Yes'. | Ensure the form is functional and handles the scenario correctly.     |
| **TC_007_REGISTER** | Verify the Register page's form functionality when valid data is entered for the 'First Name' field and the user agrees to the Privacy Policy. | Ensure the form accepts valid first name and privacy agreement.       |
| **TC_008_REGISTER** | Verify the Register page's form functionality when valid data is entered for the 'Last Name' field and the user agrees to the Privacy Policy. | Ensure the form accepts valid last name and privacy agreement.        |
| **TC_009_REGISTER** | Verify the Register page's form functionality when valid data is entered for the 'Email' field and the user agrees to the Privacy Policy. | Ensure the form accepts valid email and privacy agreement.            |
| **TC_010_REGISTER** | Verify the Register page's form functionality when valid data is entered for the 'Telephone' field and the user agrees to the Privacy Policy. | Ensure the form accepts valid telephone and privacy agreement.        |
| **TC_011_REGISTER** | Verify the Register page's form functionality when valid data is entered for the 'Password' and 'Password Confirm' fields and the user agrees to the Privacy Policy. | Ensure the form accepts valid passwords and privacy agreement.        |
| **TC_012_REGISTER** | Verify the Register page's form functionality when valid data is entered for all fields and the user agrees to the Privacy Policy. | Ensure the form accepts valid data for all fields and privacy agreement. |
| **TC_013_REGISTER** | Verify the Register page's form functionality when an existing email address is used to register a new user. | Ensure appropriate error handling for duplicate emails.               |
| **TC_014_REGISTER** | Verify the Register page's form functionality when unmatching passwords are entered to register a new user. | Ensure appropriate error handling for password mismatch.             |
| **TC_015_REGISTER** | Verify the Register page's form functionality when data entered for the 'First Name' field exceeds the character limit (>32 characters). | Ensure the form handles input exceeding character limits properly.    |
| **TC_016_REGISTER** | Verify the Register page's form functionality when data entered for the 'Last Name' field exceeds the character limit (>32 characters). | Ensure the form handles input exceeding character limits properly.    |
| **TC_017_REGISTER** | Verify the Register page's form functionality when data entered for the 'Telephone' field is below the character requirement (>=3 characters). | Ensure the form validates minimum character requirement.              |
| **TC_018_REGISTER** | Verify the Register page's form functionality when data entered for the 'Telephone' field exceeds the character requirement (>32 characters). | Ensure the form handles input exceeding character limits properly.    |
| **TC_019_REGISTER** | Verify the Register page's form functionality when data entered for the 'Password' field is below the character requirement (>=4 characters). | Ensure the form validates minimum password length.                    |
| **TC_020_REGISTER** | Verify the Register page's form functionality when data entered for the 'Password' field exceeds the character requirement (>20 characters). | Ensure the form handles input exceeding password length properly.     |

---

### Cart Functionality – UI Elements

| Test Case ID   | Title                                                                                         | Description                                                                                       |
|----------------|-----------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|
| TC_CART_001     | Verify success message is present and displays with correct text after adding the featured MacBook to the cart | Ensure success message is present and displays with correct text after adding the featured MacBook to the cart |
| TC_CART_002     | Verify quantity count and price per quantity is present and displays with correct text after adding a single MacBook to the cart | Ensure quantity count and price per quantity is present and displays with correct text after adding a single MacBook to the cart |
| TC_CART_003     | Verify success message is present and displays with correct text after adding the featured iPhone to the cart | Ensure success message is present and displays with correct text after adding the featured iPhone to the cart |
| TC_CART_004     | Verify quantity count and price per quantity is present and displays with correct text after adding a single iPhone to the cart | Ensure quantity count and price per quantity is present and displays with correct text after adding a single iPhone to the cart |
| TC_CART_005     | Verify quantity count and price per quantity is present and displays with correct text after removing a single MacBook from the cart | Ensure quantity count and price per quantity is present and displays with correct text after removing a single MacBook from the cart |
| TC_CART_006     | Verify quantity count and price per quantity is present and displays with correct text after removing a single iPhone from the cart | Ensure quantity count and price per quantity is present and displays with correct text after removing a single iPhone from the cart |

---


### Login Page Tests

| Test Case ID      | Description                                                                                          | Expected Outcome                                                      |
|-------------------|----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|
| **TC_001_LOGIN**   | Verify the 'No Account Exists' warning message is present and displays the expected text when no email and no password is supplied to the login form. | Ensure the warning message is displayed with correct text when login credentials are missing. |
| **TC_002_LOGIN**   | Verify the 'No Account Exists' warning message is present and displays the expected text when an invalid email and password is supplied to the login form. | Ensure the warning message is displayed with correct text for invalid login credentials. |

---

## 🛠️ Tech Stack

| Category             | Tool/Technology             |
|----------------------|-----------------------------|
| Programming Language | Java                        |
| Automation Framework | Selenium WebDriver          |
| Test Framework       | TestNG                      |
| Design Pattern       | Page Object Model (POM)     |
| Build Tool           | Maven                       |
| CI Tool              | Jenkins                     |

---

## Automation Report (as of 9/22/15) | ExtentReports

### Homepage
<img width="800" alt="Homepage_AutomationReport" src="https://github.com/user-attachments/assets/294298c6-7623-45a5-9405-bbc227fff6d3" />

### RegisterPage
<img width="800" alt="RegisterPage_AutomationReport" src="https://github.com/user-attachments/assets/72e30220-44e1-45c8-af9e-511751365d4b" />
