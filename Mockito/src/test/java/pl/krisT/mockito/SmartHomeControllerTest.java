package pl.krisT.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class SmartHomeControllerTest {

    @Test
    void shouldDisableWatering() {
        // given
            //  korzystając z metody Mockito.mock(), jako argument podając jaką klasę chcemy mockować.
            //  Mockito stworzy klasę która implementuje interfejs HumiditySensor, a następnie obiekt tej klasy
        HumiditySensor humiditySensorMock = Mockito.mock(HumiditySensor.class);
            // nadanie temu obiektowi zachowania. Definiujemy, że jeśli zostanie wywołana metoda getHumidity()
            // to zwrócona powinna zostać wartość 50.
        Mockito.when(humiditySensorMock.getHumidity()).thenReturn(50);

            // tworzymy mock dla klasy WateringController.
        WateringController wateringControllerMock = Mockito.mock(WateringController.class);
            // możemy stworzyć instancję klasy SmartHomeController podając jako argumenty stworzone wcześniej mocki.
            // Zauważ, że mock ma taki sam typ jak klasa którą reprezentuje.
        SmartHomeController smartHomeController = new SmartHomeController(humiditySensorMock, wateringControllerMock);

        // when
        smartHomeController.enableWateringIfNeeded();

        // then
        Mockito.verify(wateringControllerMock).disableWatering();
    }

}