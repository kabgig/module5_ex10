public class Mage {
    String name;
    int level;
    int damage;
    String type; //fire, ice earth

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        return name + ", "
                + level + ", "
                + damage + ", "
                + type;
    }
//commit
    // fire -> ice -> earth -> fire
    public String fight(Mage mag2) {
        //type
        if (!(this.type.equals(mag2.type))) {
            if (this.type.equals("fire")) { //fire
                if (mag2.type.equals("ice")) return this.name;
                else return mag2.name;
            }
            if (this.type.equals("ice")) { //ice
                if (mag2.type.equals("earth")) return this.name;
                else return mag2.name;
            }
            if (this.type.equals("earth")) { //earth
                if (mag2.type.equals("fire")) return this.name;
                else return mag2.name;
            }

        }
        // level
        if (this.level != mag2.level) {
            if (this.level > mag2.level) return this.name;
            else return mag2.name;
        }
        // damage
        if (this.damage != mag2.damage) {
            if (this.damage > mag2.damage) return this.name;
            else return mag2.name;
        } else return "draw";
    }
}
