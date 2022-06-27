public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name,int damage,int health,int weight,int dodge)
    {
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if(dodge>=0&&dodge<=100)
        {
            this.dodge=dodge;
        }else
            this.dodge=0;

    }

    int hit(Fighter foe)
    {
        if(foe.isDodge())
        {
            System.out.println(foe.name+" Hasari blokladi");
            return foe.health;
        }
        else

        System.out.println(this.name+" "+foe.name+"'e "+this.damage+" hasar verdi.");
        if(foe.health-this.damage<0)
        {
            return 0;
        }
        return foe.health-this.damage;
    }
    boolean isDodge()
    {
        double rndNum=Math.random()*100;
        if(rndNum<=this.dodge)
        {
            return true;
        }
        else
            return false;
    }

}
