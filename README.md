# Automation Script Analysis Report

<img height="311" width="423" alt="test" src="https://res.cloudinary.com/dheiniqiw/image/upload/v1707107592/RDCD/rdcd1_mjm8nm.png" />

**Full Report Link:** [Report overview](https://rdcd-nameclearance-nameapproval.netlify.app)
---

## Introduction

Welcome to the Automation Script Analysis Report! This comprehensive document provides a detailed exploration of the automation scripts nestled within the Utilities package. Tailored to optimize processes related to name clearance, duplicate name approval, and name approval within a web application, these scripts are designed for efficiency. Below, discover an insightful overview of code structures, functionalities, and recommendations for improvement for each script.

---

## 1. Duplicate Name Approval Automation

### Code Overview

The `DuplicateNameApproval` class, extending the `Methods` class, harnesses the prowess of Selenium for web automation. Delve into the specifics:

#### Web Elements:
- Various `By` objects represent elements such as buttons and dropdowns, identified using XPath expressions.

#### Methods:
- **DupNameApply():** This method orchestrates the automation process, executing a sequence of actions. These include clicking on elements, selecting options, inputting text, capturing alerts and screenshots, and finally, logging out the user.

### Workflow

1. Initiates the name clearance process by clicking on the Name Clearance Icon.
2. Selects options such as 'প্রাথমিক', 'খুলনা', 'যশোর', etc.
3. Inputs the name 'Ornob' into the designated field.
4. Captures any duplicate name alerts and takes a screenshot.
5. Logs out the current user.
<img height="314" width="720" alt="test" src="https://res.cloudinary.com/dheiniqiw/image/upload/v1707107590/RDCD/rdcd3_f2pfwl.png" />
---

## 2. Name Approval Page Automation

### Code Overview

The `NameApprovalPage` class, extending the `Methods` class, utilizes the Selenium WebDriver. Dive into the details:

#### Web Elements:
- Defines `By` objects representing elements like buttons, dropdowns, and notifications using XPath expressions.

#### Methods:
- **NameApproveSamity():** This method drives the approval process, encompassing waiting for elements, clicking on them, selecting options from dropdowns, capturing screenshots, and ultimately logging out the user.

### Workflow

1. Waits for landing page visibility and navigates to the 'কার্যক্রম ব্যবস্থাপনা' section.
2. Selects the 'New Samiti Acceptance' option and awaits the Name Clearance Approval page.
3. Scrolls down the page, selects 'অনুমোদন' from the dropdown list, and proceeds with approval.
4. Logs out the current user.
<img height="357" width="795" alt="dsda" src="https://res.cloudinary.com/dheiniqiw/image/upload/v1707107591/RDCD/rdcd2_ynqkh4.png" />

---

## 3. Name Clearance Page Automation

### Code Overview

The `NameClearancePage` class, an extension of the `Methods` class, employs Selenium for web automation. Delve into the details:

#### Web Elements:
- Various `By` objects represent elements like buttons, dropdowns, and notifications, identified using XPath expressions.

#### Methods:
- **NameClearanceApply():** This method executes the automation process, encompassing actions such as clicking on elements, selecting options from dropdowns, inputting text, capturing screenshots, and logging out the user.

### Workflow

1. Initiates the name clearance process by clicking on the Name Clearance Icon.
2. Selects options such as 'প্রাথমিক', 'খুলনা', 'যশোর', etc.
3. Inputs a random name into the designated field.
4. Clicks the save button and captures a screenshot.
5. Logs out the current user.

---

## Conclusion

In conclusion, these automation scripts exemplify functional workflows for specific processes within a web application, leveraging the robust Selenium WebDriver. By implementing the recommended improvements, these scripts can evolve to be more maintainable, scalable, and resilient to changes in the application under test. Dive in, explore, and enhance your automation capabilities!

---