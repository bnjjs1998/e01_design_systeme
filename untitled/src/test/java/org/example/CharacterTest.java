package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {

    @Test
    public void test() {
        assertEquals('a', 'a', "Il n'y a pas d'égalité");
        assertNotEquals(true, false, "True est false ne peuvent pas être égal");// Vérifie que 'a' est égal à 'a'
    }

    //Maintenant que on sait que ça fonctionne on test les méthodes de la classe Charcatere
    @Test
    public void testDefaultCharacterInstance() throws Exception {
        GameCharacter a = new GameCharacter();  // Ce constructeur peut lancer une exception
        assertEquals("Sans noms", a.getName(), "Le nom n'est pas celui attendu");
        assertEquals(1, a.getLevel(), "Le niveau n'est pas celui attendu");
        assertEquals(false, a.getAlive(), "Le personnage  n'est pas en vie");
    }

    @Test
    public void InitialiationCharacter() throws Exception {

        String name ="hero";
        GameCharacter a = new GameCharacter(name);
        assertNotNull(a);
        assertEquals(name, a.getName(), "Le nom n'est pas celui attendu");
        assertEquals(1, a.getLevel(), "Le personnage  n'est pas en vie");

    }
    // je vais tester les throws Eception
    @Test
    public void testCharacterInstanceInvalid() throws Exception
    {
        assertThrows(Exception.class, () -> {
            GameCharacter a = new GameCharacter("a",11);
        });
    }

    // je vais tester méthode Die()
    @Test
    public void Dietest() throws Exception {
        GameCharacter a = new GameCharacter("aa", 1);
        assertTrue(a.isAlive(), "Le personnage doit être vivant ");
        a.Die();
        assertFalse(a.isAlive(), "Le personnage doit etre mort");
    }


    // On va tester le SetLevel inferieur à 10
    @Test
    public void SetLevelTestOK() throws Exception {
        // on initialise L'objet
        GameCharacter a = new GameCharacter("aa", 1);
        a.setLevel(1,10);
        assertEquals(1, a.getLevel(), "Le niveaux doit etre correctement initialiser");
    }

    //SetLevelSupérerieurMax
    @Test
    public void SetLevelSupérerieurMax() throws Exception {
        GameCharacter a = new GameCharacter("aa", 1);
        Exception e = assertThrows(Exception.class, () -> {
           a.setLevel(11,10);
        });
    }


    //SetLevelInferieurAzero
    @Test
    public void SetLevelInferieurAzero() throws Exception {
        GameCharacter a = new GameCharacter("aa", 1);
        Exception e  = assertThrows(Exception.class, () -> {
            a.setLevel(0,10);
        });
    }
}
