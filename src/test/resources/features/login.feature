Feature: Login

  Background: Go to home page
    Given The user is on the login page

  @login @wip
  Scenario: Login with valid credentials
  #(Uygulamaya sadece yetkili kullanicilar giris yapabilir. Kullanici gecerli kimlik bilgileri ile oturum actiginda
  #Account summary (Hesap ozeti) sayfasini goruntuleyebilmelidir.
  #(NOT: Sayfaya verilen url ile girdikten sonra Signin button a basilmali, sonrasinda verilen veriler girilmeli ve
  #Sign in butona basilmali. Ancak acilan sayfadan tekrar http://zero.webappsecurity.com/bank/accountsummary.html sayfasina gidilmeli.)

    When The user enters valid credentials
    Then verify Account Summary page is shown

  @loginInvalid @wip
  Scenario: Try to login with invalid credentials
  #Kullanici adi veya sifresi yanlis olan kullanicilar giris yapmamalidirlar.Kullanici gecersiz kullanici bigileri ile giris yapmak istediginde
  #Login and/or password are wrong seklinde mesaji gorebilmelidirler.
    When The user enters invalid credentials
    Then verify "Login and/or password are wrong." message is shown


  @loginEmpty @wip
  Scenario: Try to login with empty credentials
  #Kullanaicilarin bos kullanici adi veya sifre ile de girisleri mumkun olmamalidir. Kullanici gecersiz kullanici bigileri ile giris yapmak istediginde
  #Login and/or password are wrong seklinde mesaji gorebilmelidirler.
    When The user tries to login without entering any credentials
    Then verify "Login and/or password are wrong." message is shown