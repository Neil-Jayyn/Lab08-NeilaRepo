package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @ Test
    public void testHasCity(){
        CustomList customList = new CustomList();
        City calgary = new City("Calgary","AB");
        customList.addCity(calgary);

        //should fail since theres no hasCity()
        assertTrue(customList.hasCity(calgary));
    }

}
