@all @search
Feature: Ebebek search senaryyosu

  Scenario Outline: Ebebek search
    Given Ebebek anasayfası açılır
    When <kullaniciAdi> <sifre> ile giriş yapılır
    And Arama çubuğuna <veri> yazılıp aratılır
    And Çıkan ilk ürüne tıklanıp sepete eklenir
    Then Sepete eklendiği kontrol edilir

    Examples:
      | kullaniciAdi  | sifre    | veri    |
      | xxx@gmail.com | xxxxxxxx | biberon |
      | xxx@gmail.com | xxxxxxxx | emzik   |
