Feature: Pay Bills

  Scenario: Account Activity sayfasinin basligi Zero -Pay Bills olmalidir

    Scenario: Kullanici odeme(Pay) islemini gerceklestirdiginde The payment was successfully submitted mesajini gorebilmelidir.

      Scenario: Kullanici odeme islemi yaparken miktari veya tarihi girmediginde Please fill out this field message! gorebilmelidir.

        Scenario: Tutar (Amount) alani alfabetik veya ozel karakter icermemelidir.

          Scenario: Tarih alani alfabetik karakter kabul etmemelidir. (NOT: input alanlari icin sendKeys kullanabilirsiniz. Date navigetoru click yapmaya gerek yok.)