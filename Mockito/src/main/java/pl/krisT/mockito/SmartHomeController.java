package pl.krisT.mockito;

//  SmartHomeController - serce systemu, które sprawdza aktualną wilgotność i uruchamia lub zatrzymuje podlewanie
public class SmartHomeController {
    private final HumiditySensor humiditySensor;
    private final WateringController wateringController;

    public SmartHomeController(HumiditySensor humiditySensor, WateringController wateringController) {
        this.humiditySensor = humiditySensor;
        this.wateringController = wateringController;
    }

    public void enableWateringIfNeeded() {
        int humidity = humiditySensor.getHumidity();

        if (humidity < 50) {
            wateringController.enableWatering();  //  49% wilgotności zostanie uruchomione nawadnianie
        } else {
            wateringController.disableWatering();  //  50% wilgotności zostanie zatrzymane nawadnianie
        }
    }
}
