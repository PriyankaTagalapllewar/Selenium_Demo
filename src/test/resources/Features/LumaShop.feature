
Feature: Order module Luma Driven BagPacks bags
 

  Scenario: Order to Bags Driven bagPacks
    Given Click On URL "https://magento.softwaretestingboard.com/"
    And Click on Gear Option DropDown
    When Open to Bag Pagge
    And User Click on Driven BagPacks Bag
    And Page Should be "Driven Backpack"
    And User Should Click on Add to carts button
    Then User should be able to see massege "You added Driven bagPack to your" 
    




