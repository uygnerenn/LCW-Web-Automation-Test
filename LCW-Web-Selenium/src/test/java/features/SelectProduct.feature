@SelectProduct
Feature: Select Product


  @login @Product
  Scenario Outline: Login Scenario
    Given The user should see LCW page
    When The user should click Login button
    Then The user should see login Page
    And The user should sendkey e-mail text box "<E-mail>"
    And The user should sendkey password text box "<Password>"
    And The user should click in login page login button
    And The user should see true account
    Examples:
      | E-mail              | Password |
      | uygnerenn@gmail.com | 123lcw   |

  @ProductSelection @Product
  Scenario Outline: Product Filter Scenario
    Given The user should see LCW page
    When  The user should click kadın-giyim-bluz button
    Then The user should see "Bluz Modelleri" Page
    Then The user should click Siyah colour filter
    Then The user should click Product
    Then The user should see "<ProductTitle>"
    Then The user should click Medium size
    Then The user should click Sepete Ekle button
    Then The user should click Sepetim Button "LC WAIKIKI Bluz"
    Then The user should see name of product "<ProductTitle2>"
    Then The user should see size of product "<Size>"
    Then The user should see number of product "<Number>"
    Then The user should click Ödeme Adımına Geç button
    Then The user should see Payment Page
    Examples:
      | ProductTitle                                                        | ProductTitle2 | Size | Number |
      | LCW CASUAL Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz | Bluz          | M    | 1      |


