/*
 * client Class
 */
public class Main {
    public static void main(String[] args) {
        MonsterRegistery monsterRegistery = new MonsterRegistery();
        //prototype
        Airmonster airmonster = new Airmonster();
        Landmonster landmonster = new Landmonster();
        Watermonster watermonster = new Watermonster();

        //register in hash map
        monsterRegistery.registeryMonster("airmonster", airmonster);
        monsterRegistery.registeryMonster("landmonster", landmonster);
        monsterRegistery.registeryMonster("watermonster", watermonster);

        // clone and display
        Monster airmont = monsterRegistery.createMonster("airmonster");
        airmont.display();
    }
}
