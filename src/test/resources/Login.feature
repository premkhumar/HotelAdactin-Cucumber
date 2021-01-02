Feature: Verifying the login functionality of Adactin

  Scenario Outline: Successfull login with valid credentials
    Given User is on the adactin login page
    When User enters the valid "<username>" and "<password>" and click login
    Then Search Hotel page to be displayed
    When User is on search Hotel page enter "<location>","<hotel>","<Roomtype>","<No.of Rooms>","<check in date>","<check out date>","<Adult per Room>","<Children per Room>" details
    Then click search button
    When User is on select hotel page select the hotel package
    Then click continue
    When User is on enter "<firstname>","<lastname>","<Billingaddress>","<creditcardno>","<creditcardtype>","<expdatemonth>","<expdateyear>","<cvvno>"
    Then Click BookNow button
    When user is on Booking Confirmation page verify the details
    Then click Logout

    Examples: 
      | username  | password | location  | hotel          | Roomtype | No.of Rooms | check in date | check out date | Adult per Room | Children per Room | firstname | lastname | Billingaddress                                                                    | creditcardno     | creditcardtype | expdatemonth | expdateyear | cvvno |
      | anonym123 | admin123 | Melbourne | Hotel Sunshine | Deluxe   | 6 - Six     | 25/12/2020    | 28/12/2020     | 3 - Three      | 2 - Two           | Greens    | Tech     | Plot No.19,Balamurugan Garden,OMR Road,Kancheepuram District,Okkiam, Thoraipakkam | 4263982640269299 | VISA           | January      |        2021 |   123 |
