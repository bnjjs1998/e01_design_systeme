package org.example;

public class GameCharacter {
    private  String name;
    private int level;
    private int levelMax;
    private boolean alive;

    public GameCharacter(String name, int level) throws Exception {
        setName(name);
        setLevel(level, levelMax);
        this.alive = true;

    }
    public GameCharacter(String name) throws Exception {
        this(name , 1);
    }

    public GameCharacter() throws Exception {
        this("Sans noms", 1);
        this.alive = false;

    }
    public boolean isAlive() {
        return this.alive;
    }
    public String getName() {
        return this.name;
    }
    public int getLevel() {
        return this.level;
    }
    public boolean getAlive(){
        return this.alive;
    }

    public void Die() {
        this.alive = false;

    }

    //Les Setters

    private void setName(String name) throws Exception {
        int NameLenght = name.length();
        if (NameLenght < 2 || NameLenght > 12) {
            throw new Exception("Le noms du perso doit etre compris entre 2 e 12 lettre");
        }
        this.name = name;
    }


    public void setLevel(int level, int levelMax) throws Exception {
      if (level < 1) {
          throw new Exception("Le level doit etre supérieur à 1");
      } else if (level > levelMax) {
          this.level =levelMax;
      }
      this.level = level;
    }

}
