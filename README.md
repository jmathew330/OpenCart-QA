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

### UI Tests – Home Page Header

| Test Case ID      | Description                                                                                          | Expected Outcome                                                      |
|-------------------|----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|
| **TC_001_HOMEPAGE** | Verify the home page loads successfully with the correct URL and page title displayed.              | Page loads successfully with correct URL and title                   |
| **TC_002_HOMEPAGE** | Verify the home page logo is present and displays the expected text.                                | Logo is present and shows correct text                               |
| **TC_003_HOMEPAGE** | Verify the 'Currency' dropdown and its options are present in the header and display expected text. | 'Currency' dropdown and options are correctly displayed              |
| **TC_004_HOMEPAGE** | Verify the phone icon and phone number are present in the header, displaying expected text.          | Phone icon and number are displayed with correct text                |
| **TC_005_HOMEPAGE** | Verify the 'My Account' dropdown and its options are present in the header and display expected text.| 'My Account' dropdown and options are displayed correctly            |
| **TC_006_HOMEPAGE** | Verify the wish list icon and wish list text are present in the header and display expected text.    | Wish list icon and label are displayed with correct text             |
| **TC_007_HOMEPAGE** | Verify the shopping cart icon and shopping cart label are present in the header with expected text. | Shopping cart icon and label are displayed with correct text         |
| **TC_008_HOMEPAGE** | Verify the checkout icon and checkout label are present in the header with expected text.            | Checkout icon and label are displayed with correct text              |
| **TC_009_HOMEPAGE** | Verify the search box and search button are present in the header.                                   | Search box and search button are displayed                           |
| **TC_010_HOMEPAGE** | Verify the search box displays the expected placeholder text.                                        | Search box shows correct placeholder text                            |
| **TC_011_HOMEPAGE** | Verify the shopping cart button label displays the expected text when no items are added.            | Shopping cart button shows correct text when empty                   |
| **TC_012_HOMEPAGE** | Verify the navigation menu links display the expected text.                                         | Navigation menu links display correct text                           |
| **TC_013_HOMEPAGE** | Verify the 'Desktop', 'Laptops & Notebooks', 'Components', and 'MP3 Players' dropdown menus display expected text.| Dropdown menus display correct text                                  |
| **TC_014_HOMEPAGE** | Verify the iPhone and Macbook Air pictures display in the image gallery slideshow.                   | iPhone and Macbook Air images are shown in the slideshow             |
| **TC_015_HOMEPAGE** | Verify the 'Featured' heading displays with the expected text.                                      | 'Featured' heading shows correct text                                |
| **TC_016_HOMEPAGE** | Verify the 'Featured' section images display with expected URL and title.                           | Featured section images display correct URL and title                |

---

## 🛠️ Tech Stack

| Category        | Tool/Technology             |
|----------------|-----------------------------|
| Programming Language | Java                     |
| Automation Framework | Selenium WebDriver        |
| Test Framework | TestNG                   |
| Design Pattern | Page Object Model (POM)     |
| Build Tool     | Maven    |

---
