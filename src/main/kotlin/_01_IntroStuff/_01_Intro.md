## Skąd się wziął?

* Firma JetBrains stworzyła Kotlina, aby budować projekty dużej skali. Główne skupienie jest na czytelności, 
wsparciu sprawdzania poprawności i wsparciu produktywności.
* Kompilator produkuje bytecode na JVM lub kod JavaScript
* Język stworzony jako odpowiedź na ograniczenia Javy i pozostałych języków targetujących JVM - JetBrains nie znalazło wśród nich języka
który by im odpowiadał
* W roku 2011 pojawiły się pierwsze wzmianki - jest to język bardzo świeży

## Założenia

* Statyczny i silnie typowany, z mocnym 'type inference'
* Praktycznie idealna i 100% kompatybilność z Javą i standardową biblioteką Javy
* Dwustronna łatwość wywoływania Javy z Kotlina i vice-versa
* Masz nawet nie zauważyć, że przekroczyłeś granicę
* Prostota i czytelność przede wszystkim - język jest prosty
* Wybranie dobrych i prostych elementów z innych języków
* Nic nadzwyczajnego i rewolucyjnego - po prostu skuteczne i proste narzędzie
* Bardzo mały i lekki narzut runtime (libki, jarki, dodatkowe klasy). Rozbudowanie istniejących klas standardowych Javy

## Ciekawostki

* Przeładowywanie operatorów
* Nie jest zbudowany nad Javą - Java to dla Kotlina 'platform specific'
* Wszystko jest obiektem (ale nie java.lang.Object!)
* Obsługa typów specjalnych i mocne optymalizacje performance i pamięciowe (stos/sterta) - ale dla programisty są używane jak obiekty
* == to equals. Jest === czyli .identityEquals
* nie trzeba używać ;
* pakiet nie musi sie zgadzać z katalogiem (coś jak namespace z C#)

