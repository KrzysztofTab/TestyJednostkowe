package pl.krisT.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SmartHomeControllerTest01 {

    @Mock
    private HumiditySensor humiditySensorMock;
    @Mock
    private WateringController wateringControllerMock;
    @InjectMocks
    private SmartHomeController smartHomeController;


    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldDisableWatering() {
        // given
        Mockito.when(humiditySensorMock.getHumidity()).thenReturn(50);
        SmartHomeController smartHomeController = new SmartHomeController(humiditySensorMock, wateringControllerMock);

        // when
        smartHomeController.enableWateringIfNeeded();

        // then
        verify(wateringControllerMock).disableWatering();
    }
}
