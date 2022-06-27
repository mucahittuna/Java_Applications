public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight)
    {
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }
    boolean CheckWeight()
    {
        if((this.f1.weight>=this.minWeight&& this.f1.weight<=this.maxWeight)&&(this.f2.weight>=this.minWeight&& this.f2.weight<=this.maxWeight))
        {
            return true;
        }
        else
        {

            return false;
        }

    }
    public void run()
    {
        int i=1;
        if(CheckWeight())
        {
            if(tossUp()==1)
            {
                System.out.println("\n\n\n"+this.f1.name+" basliyor ");
                while(this.f1.health>0&&this.f2.health>0)
                {
                    System.out.println("\n\n*********ROUND "+i+"*********");

                    this.f2.health=this.f1.hit(f2);
                    System.out.println(this.f2.name+" kalan cani: "+this.f2.health);
                    if(isWin())
                    {
                        break;
                    }
                    this.f1.health=this.f2.hit(f1);
                    System.out.println(this.f1.name+" kalan cani: "+this.f1.health);
                    i++;
                    if(isWin())
                    {
                        break;
                    }
                }
            }
            else
                System.out.println("\n\n\n"+this.f2.name+" basliyor ");
                while(this.f2.health>0&&this.f1.health>0)
                {

                    System.out.println("\n\n*********ROUND "+i+"*********");

                    this.f1.health=this.f2.hit(f1);
                    System.out.println(this.f1.name+" kalan cani: "+this.f1.health);
                    i++;
                    if(isWin())
                    {
                        break;
                    }
                    this.f2.health=this.f1.hit(f2);
                    System.out.println(this.f2.name+" kalan cani: "+this.f2.health);
                    if(isWin())
                    {
                        break;
                    }
                }

        }
        else
            System.out.println("Sikletler uyusmuyor");
    }

    boolean isWin()
    {
        if(this.f1.health==0)
        {
            System.out.println("\n\n"+this.f2.name+" kazandi.");
            return true;
        }
        if(this.f2.health==0)
        {
            System.out.println("\n\n"+this.f1.name+" kazandi.");
            return true;
        }
        else
            return false;
    }

    int tossUp()
    {
        double rndNum1=Math.random()*100;
        double rndNum2=Math.random()*100;

        if(rndNum1!=rndNum2)
        {
            if(rndNum1>rndNum2)
            {
                return 1;
            }
            else
                return 2;
        }

        return tossUp();
    }
}
