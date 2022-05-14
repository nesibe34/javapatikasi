public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player){
        super(player,"Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz, canınız yenilendi.");
        this.getPlayer().setHealth(this.getPlayer().getOrjHealth());
        boolean food=this.getPlayer().getInventory().isFood();
        boolean firewood=this.getPlayer().getInventory().isFirewood();
        boolean water=this.getPlayer().getInventory().isWater();
        if (food && firewood && water){
            System.out.println("Tüm bölgeleri tamamladınız!");
            System.out.println("**********************************");
            System.out.println("Oyunu KAZANDINIZ... Tebrikler...");
            System.out.println("**********************************");
            return false;
        }
        return true;
    }

}
