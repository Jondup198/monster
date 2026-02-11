package io.github.some_example_name;

public class Items {

    private boolean hasDeathTrap;
    private boolean hasMonsterTrap;
    private boolean hasGold;
    private boolean hasExit;

    public Items(boolean deathTrap, boolean monsterTrap, boolean gold, boolean exit){
        this.hasDeathTrap = deathTrap;
        this.hasMonsterTrap = monsterTrap;
        this.hasGold = gold;
        this.hasExit = exit;
    }

    public boolean isHasDeathTrap() {return hasDeathTrap;}
    public void setHasDeathTrap(boolean hasDeathTrap) {this.hasDeathTrap = hasDeathTrap;}
    public boolean isHasMonsterTrap() {return hasMonsterTrap;}
    public void setHasMonsterTrap(boolean hasMonsterTrap) {this.hasMonsterTrap = hasMonsterTrap;}
    public boolean isHasGold() {return hasGold;}
    public void setHasGold(boolean hasGold) {this.hasGold = hasGold;}
    public boolean isHasExit() {return hasExit;}
    public void setHasExit(boolean hasExit) {this.hasExit = hasExit;}
}
