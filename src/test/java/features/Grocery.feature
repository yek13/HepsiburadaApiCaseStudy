Feature: Hepsiburada api testleri

  Scenario: Ürün Bazlı Kontrol
    Given Name 'apple', price '3',stock '100' olan ürün olduğu kontrol edilir.

  Scenario: Ürünlerin Varlığı Kontrol
    Given Apideki ürünlerin varlığı kontrol edilir.

  Scenario: Ürün Ekleme
    Given id '6', name 'banana', price '34',stock '13' özellikli ürün eklenir.