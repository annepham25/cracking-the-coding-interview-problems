public static void findHeavyBottle() {
    /* formula tells you the bottle number
        ---> (weight - 210 grams) / 0.1 grams

        because if 19 bottles have pills that are 1.0 grams, but only one that has
        1.1 grams, we know the expected sum of all the pills if we were to add all the pills

        this way, if we add one pill from Bottle #1, two pills from Bottle #2, three pills from
        Bottle #3, so on, --> the pills should read 210, but any "overage" must come from the extra
        0.1 gram pills which is where we can use the formula to identify which bottle it came from

        eg. if it was from Bottle #13, the weight would be 211.3

     */
}
