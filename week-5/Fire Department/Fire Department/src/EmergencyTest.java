import static org.junit.jupiter.api.Assertions.*;

class EmergencyTest
{

    @org.junit.jupiter.api.Test
    void getWaterLevelNeeded_priority2_expected5000()
    {
        Emergency emergency = new Emergency(2, false, null, 0);

        int waterNeeded = emergency.getWaterNeeded();

        assertEquals(5000, waterNeeded);
    }
}